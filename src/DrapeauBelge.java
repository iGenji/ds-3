public class DrapeauBelge {
	
	private NoeudCouleur tete;	
	private NoeudCouleur dernierJaune;
	// NE PAS AJOUTER D'AUTRES ATTRIBUTS!!!
	
	/**
	 * construit une liste contenant 3 noeuds avec les caracteres 'n', 'j' et 'r' (dans cet ordre)
	 */
	public DrapeauBelge() {
		tete = new NoeudCouleur('n', null);
		tete.suivant = dernierJaune = new NoeudCouleur('j', null);
		dernierJaune.suivant = new NoeudCouleur('r', null);
	}

	// A NE PAS MODIFIER. VA SERVIR POUR LES TESTS
	public String toString(){
		String drapeau="";
		NoeudCouleur baladeur = tete;
		while(baladeur!=null){
			drapeau+=baladeur.couleur;
			baladeur = baladeur.suivant;
		}
		return drapeau;
	}
	
	/**
	 * ajoute un noeud avec la couleur passee en parametre dans la liste
	 * La liste doit respecter les couleurs du  drapeau belge : noir/jaune/rouge
	 * @param couleur un caractere representant une couleur du drapeau belge : 'n', 'j' ou 'r'
	 * @throws IllegalArgumentException si le caractere ne correspond pas a un des 3 caracteres : 'n', 'j' ou 'r'
	 */
	public void ajouter(char couleur) {
		switch (couleur) {
		case 'n':
			tete = new NoeudCouleur(couleur, tete);
			break;
		case 'j':
			dernierJaune = dernierJaune.suivant = new NoeudCouleur(couleur, dernierJaune.suivant);
			break;
		case 'r':
			dernierJaune.suivant = new NoeudCouleur(couleur, dernierJaune.suivant);
			break;
		default:
			throw new IllegalArgumentException("Couleur invalide.");
		}
	}
	
	private class NoeudCouleur{
		
		private char couleur;
		private NoeudCouleur suivant;
		
		private NoeudCouleur(char couleur){
			this.couleur = couleur;
			this.suivant = null;
		}
		
		private NoeudCouleur(char couleur, NoeudCouleur suivant){
			this.couleur = couleur;
			this.suivant = suivant;
		}

	}
}
