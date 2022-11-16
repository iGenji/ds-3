
//Exercice defis
public class BalVar1 {

	private NoeudEtudiant tete;
	private NoeudEtudiant dernierGarcon;
	private NoeudEtudiant derniereFille;

	public BalVar1() {
		derniereFille = new NoeudEtudiant(new Etudiant("bidon", 'F'));
		dernierGarcon = tete = new NoeudEtudiant(new Etudiant("bidon", 'M'), derniereFille);
	}

	public String toString() {
		String aRenvoyer = "";
		NoeudEtudiant baladeur = tete;
		while (baladeur != null) {
			String nom = baladeur.etudiant.getPrenom();
			if (!nom.equals("bidon")) {
				aRenvoyer += " " + nom;
			}
			baladeur = baladeur.suivant;
		}
		return aRenvoyer;
	}

	/**
	 * ajoute l etudiant dans la liste en tenant compte de l'ordre prevu
	 * 
	 * @param etudiant l'etudiant a ajouter
	 * @throws IllegalArgumentException si l'etudiant est null
	 */
	public void ajouterEtudiant(Etudiant etudiant) {
		if (etudiant == null)
			throw new IllegalArgumentException("etudiant null");
		if (etudiant.getSexe() == 'M') {
			dernierGarcon = dernierGarcon.suivant = new NoeudEtudiant(etudiant, dernierGarcon.suivant);
		} else {
			derniereFille = derniereFille.suivant = new NoeudEtudiant(etudiant);
		}
	}

	// classe interne
	private class NoeudEtudiant {
		private Etudiant etudiant;
		private NoeudEtudiant suivant;

		public NoeudEtudiant(Etudiant etudiant) {
			this.etudiant = etudiant;
			this.suivant = null;
		}

		public NoeudEtudiant(Etudiant etudiant, NoeudEtudiant suivant) {
			this.etudiant = etudiant;
			this.suivant = suivant;
		}
	}
}