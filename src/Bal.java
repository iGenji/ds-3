
public class Bal {
	
	private NoeudEtudiant tete;
	private NoeudEtudiant dernierGarcon;
	private NoeudEtudiant derniereFille;	
	
	/**
	 * construit un bal "vide", la liste des etudiants est vide
	 */
	public Bal(){
		tete = null;
		dernierGarcon = null;
		derniereFille = null;
	}
	
	public String toString() {
		String aRenvoyer = "";
		NoeudEtudiant baladeur = tete;
		while (baladeur != null) {
			aRenvoyer += " " + baladeur.etudiant.getPrenom();
			baladeur = baladeur.suivant;
		}
		return aRenvoyer;
	}
	
	/**
	 * ajoute l etudiant dans la liste en tenant compte de l'ordre prevu
	 * @param etudiant l etudiant a ajouter
	 * @throws IllegalArgumentException si l etudiant est null
	 */
	public void ajouterEtudiant(Etudiant etudiant) {
		if (etudiant == null)
			throw new IllegalArgumentException("etudiant null");
		if (etudiant.getSexe() == 'M') {
			if (dernierGarcon == null)
				tete = dernierGarcon = new NoeudEtudiant(etudiant, tete);
			else
				dernierGarcon = dernierGarcon.suivant = new NoeudEtudiant(etudiant, dernierGarcon.suivant);
		} else {
			NoeudEtudiant nouveauNoueud = new NoeudEtudiant(etudiant);
			if (dernierGarcon == null) {
				if (derniereFille == null)
					tete = derniereFille = nouveauNoueud;
				else
					derniereFille = derniereFille.suivant = nouveauNoueud;
			} else {
				if (derniereFille == null)
					dernierGarcon.suivant = derniereFille = nouveauNoueud;
				else
					derniereFille = derniereFille.suivant = nouveauNoueud;
			}
		}
	}
	// classe interne
	private class NoeudEtudiant{
		private Etudiant etudiant;
		private NoeudEtudiant suivant;
		
		public NoeudEtudiant(Etudiant etudiant){
			this.etudiant = etudiant;
			this.suivant = null;
		}
		
		public NoeudEtudiant(Etudiant etudiant, NoeudEtudiant suivant){
			this.etudiant = etudiant;
			this.suivant = suivant;
		}		
	}
}
