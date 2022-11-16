public class DequeImplChaine<E> implements Deque<E> {

	private Noeud tete;
	private Noeud queue;
	private int taille;

	public DequeImplChaine() {
		tete = null;
		queue = null;
		taille = 0;
	}

	public String toString() {
		String aRenvoyer = "";
		Noeud baladeur = tete;
		int cpt = 0;
		while (baladeur != null) {
			cpt++;
			if (cpt > taille) {
				aRenvoyer = "boucle infinie dans toString(), chainage a verifier";
			}
			aRenvoyer += " " + baladeur.element;
			baladeur = baladeur.suivant;
		}
		return aRenvoyer;
	}

	public String toStringALenvers() {
		String aRenvoyer = "";
		Noeud baladeur = queue;
		int cpt = 0;
		while (baladeur != null) {
			cpt++;
			if (cpt > taille) {
				aRenvoyer = "boucle infinie dans toString(), chainage a verifier";
			}
			aRenvoyer += " " + baladeur.element;
			baladeur = baladeur.precedent;
		}
		return aRenvoyer;
	}

	public int taille() {
		return taille;
	}

	public boolean estVide() {
		return taille == 0;
	}

	public void ajoutDebut(E element) {
		if (element == null)
			throw new IllegalArgumentException();
		if (estVide()) {
			tete = queue = new Noeud(element, null, null);
		} else {
			tete = tete.precedent = new Noeud(element, null, tete);
		}
		taille++;
	}

	public void ajoutFin(E element) {
		if (element == null)
			throw new IllegalArgumentException();
		if (estVide()) {
			tete = queue = new Noeud(element, null, null);
		} else {
			queue = queue.suivant = new Noeud(element, queue, null);
		}
		taille++;
	}

	public E retraitDebut() throws DequeVideException {
		if (estVide())
			throw new DequeVideException();
		E elementEnleve = tete.element;
		if (tete.suivant == null) {
			tete = queue = null;
		} else {
			tete = tete.suivant;
		}
		taille--;
		return elementEnleve;
	}

	public E retraitFin() throws DequeVideException {
		if (estVide())
			throw new DequeVideException();
		E elementEnleve = queue.element;
		if (queue.precedent == null) {
			tete = queue = null;
		} else {
			queue = queue.precedent;
			queue.suivant = null;
		}
		taille--;
		return elementEnleve;
	}

	public E premier() throws DequeVideException {
		if (estVide())
			throw new DequeVideException();
		return tete.element;
	}

	public E dernier() throws DequeVideException {
		if (estVide())
			throw new DequeVideException();
		return queue.element;
	}

	private class Noeud {
		private E element;
		private Noeud precedent;
		private Noeud suivant;

		private Noeud(E element, Noeud precedent, Noeud suivant) {
			this.element = element;
			this.precedent = precedent;
			this.suivant = suivant;
		}
	}
}
