public class DequeSecretaire {

	private static Deque<String> dequeSecretaire;
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		dequeSecretaire = new DequeImplChaine<String>();
		int choix;
		System.out.println("Menu des taches a effectuer par la secretaire...");
		do {
			System.out.println("\n1 ---> Ajouter tache prioritaire");
			System.out.println("2 ---> Ajouter tache non prioritaire");
			System.out.println("3 ---> Selecionner tache");
			System.out.println("4 ---> Afficher les taches");
			System.out.println("0 ---> Fin");
			System.out.print("\nTon choix : ");
			choix = scanner.nextInt();
			switch (choix) {
			case 1:
				ajouterTachePrioritaire();
				break;
			case 2:
				ajouterTacheNonPrioritaire();
				break;
			case 3:
				selectionnerTache();
				break;
			case 4:
				afficherTaches();
			}
		} while (choix > 0 && choix < 5);
		System.out.println("Au revoir!\n");
	}

	public static void ajouterTachePrioritaire() {
		System.out.print("\nSpecifiez la tache a ajouter : ");
		try {
			String tache = scanner.next();
			dequeSecretaire.ajoutDebut(tache);
		} catch (Exception e) {
			System.out.println("Tache invalide.");
		}
	}

	public static void ajouterTacheNonPrioritaire() {
		System.out.print("\nSpecifiez la tache a ajouter : ");
		try {
			String tache = scanner.next();
			dequeSecretaire.ajoutFin(tache);
		} catch (Exception e) {
			System.out.println("Tache invalide.");
		}
	}

	public static void selectionnerTache() {
		try {
			String tacheRetiree = dequeSecretaire.premier();
			dequeSecretaire.retraitDebut();
			System.out.println("\nLa tache " + tacheRetiree + " a ete enlevee.");
		} catch (DequeVideException e) {
			System.out.println("\nAucune tache disponible.");
		}
	}

	public static void afficherTaches() {
		if (dequeSecretaire.estVide()) {
			System.out.println("Aucune tache disponible.");
		} else {
			System.out.println(dequeSecretaire);
		}
	}
}
