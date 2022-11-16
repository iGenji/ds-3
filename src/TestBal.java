
public class TestBal {

	public static void main(String[] args) {
		Bal bal;
		// BalVar bal; --> pour le defi
		Etudiant nico = new Etudiant("nico", 'M');
		Etudiant sam = new Etudiant("sam", 'M');
		Etudiant marie = new Etudiant("marie", 'F');
		Etudiant jeanne = new Etudiant("jeanne", 'F');
		System.out.println("Dans ces tests, on ajoute 2 hommes et 2 femmes");
		System.out.println("sam est toujours ajoute apres nico, jeanne est toujours ajoutee apres marie");
		String listeAttendue = " nico sam marie jeanne";
		System.out.println();
		
		
		System.out.print("Test1: d'abord on ajoute les 2 hommes ensuite les 2 femmes : ");
		bal = new Bal();
		// bal = new BalVar() --> pour le defi
		bal.ajouterEtudiant(nico);
		bal.ajouterEtudiant(sam);
		bal.ajouterEtudiant(marie);
		bal.ajouterEtudiant(jeanne);
		if(bal.toString().equals(listeAttendue))
			System.out.println("ok");
		else {
			System.out.println("ko");
			System.out.println("Revoyez votre methode!");
			return;
		}
		System.out.println();
		
		
		System.out.print("Test2: d'abord on ajoute les 2 femmes ensuite les 2 hommes : ");
		bal = new Bal();
		// bal = new BalVar() --> pour le defi
		bal.ajouterEtudiant(marie);
		bal.ajouterEtudiant(jeanne);
		bal.ajouterEtudiant(nico);
		bal.ajouterEtudiant(sam);	
		if(bal.toString().equals(listeAttendue))
			System.out.println("ok");
		else {
			System.out.println("ko");
			System.out.println("Revoyez votre methode!");
			return;
		}	
		System.out.println();
		
		
		
		System.out.print("Test3: on ajoute en alternance les hommes et les femmes, en commençant par un homme : ");
		bal = new Bal();
		// bal = new BalVar() --> pour le defi
		bal.ajouterEtudiant(nico);
		bal.ajouterEtudiant(marie);
		bal.ajouterEtudiant(sam);
		bal.ajouterEtudiant(jeanne);
		if(bal.toString().equals(listeAttendue))
			System.out.println("ok");
		else {
			System.out.println("ko");
			System.out.println("Revoyez votre methode!");
			return;
		}
		System.out.println();
		
		
		System.out.print("Test4: on ajoute en alternance les hommes et les femmes, en commençant par une femme : ");
		bal = new Bal();
		// bal = new BalVar() --> pour le defi
		bal.ajouterEtudiant(marie);
		bal.ajouterEtudiant(nico);
		bal.ajouterEtudiant(jeanne);
		bal.ajouterEtudiant(sam);		
		if(bal.toString().equals(listeAttendue))
			System.out.println("ok");
		else {
			System.out.println("ko");
			System.out.println("Revoyez votre methode!");
			return;
		}
		
			
			
		System.out.println();
		System.out.println("Tous les tests ont reussi!");
	}

}
