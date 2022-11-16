
public class TestDequeImplChaine {

	public static void main(String[] args) {

		System.out.println("*********************************************");
		System.out.println("Programme Test pour la classe DequeImplChaine");
		System.out.println("*********************************************");
		testDeque();
	}

	public static void testDeque() {
		DequeImplChaine<Character> d = new DequeImplChaine<Character>();

		// test 1
		System.out.print("Test1 : deque.retraitDebut() ");
		try {
			d.retraitDebut();
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			return;

		} catch (DequeVideException ex) {
		} catch (Exception ex) {
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 2
		System.out.print("Test2 : deque.premier() ");
		try {
			d.premier();
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			return;

		} catch (DequeVideException ex) {
		} catch (Exception ex) {
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 3
		System.out.print("Test3 : deque.dernier() ");
		try {
			d.dernier();
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			return;

		} catch (DequeVideException ex) {
		} catch (Exception ex) {
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 4
		System.out.print("Test4 : deque.retraitFin() ");
		try {
			d.retraitFin();
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			return;

		} catch (DequeVideException ex) {
		} catch (Exception ex) {
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 5
		System.out.print("Test5 : deque.ajoutDebut('a') ");
		try {
			d.ajoutDebut('a');
			if (d.taille() != 1) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals(" a")) {
				System.out.println(" KO : contenu liste obtenu : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 6
		System.out.print("Test6 : deque.ajoutFin('b') ");
		try {
			d.ajoutFin('b');
			if (d.taille() != 2) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals(" a b") || !d.toStringALenvers().equals(" b a")) {
				System.out.println(" KO : contenu liste obtenu : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 7
		System.out.print("Test7 : deque.ajoutDebut('c') ");
		try {
			d.ajoutDebut('c');
			if (d.taille() != 3) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals(" c a b") || !d.toStringALenvers().equals(" b a c")) {
				System.out.println(" KO : contenu liste obtenu : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 8
		System.out.print("Test8 : deque.ajoutFin('d') ");
		try {
			d.ajoutFin('d');
			if (d.taille() != 4) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals(" c a b d") || !d.toStringALenvers().equals(" d b a c")) {
				System.out.println(" KO : contenu liste obtenu : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 9
		System.out.print("Test9 : deque.premier() ");
		try {
			char c = d.premier();
			if (c != 'c') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 4) {
				System.out.println();
				System.out.println(" KO : taille modifiee : " + d.taille());
				return;
			}
			if (!d.toString().equals(" c a b d")) {
				System.out.println(" KO : contenu modifie : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 10
		System.out.print("Test10 : deque.dernier() ");
		try {
			char c = d.dernier();
			if (c != 'd') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 4) {
				System.out.println();
				System.out.println(" KO : taille modifiee : " + d.taille());
				return;
			}
			if (!d.toString().equals(" c a b d")) {
				System.out.println(" KO : contenu modifie : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 11
		System.out.print("Test11 : deque.retraitDebut() ");
		try {
			char c = d.retraitDebut();
			if (c != 'c') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 3) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals(" a b d")) {
				System.out.println(" KO : contenu obtenu : " + d);
				return;
			}
		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 12
		System.out.print("Test12 : deque.retraitFin() ");
		try {
			char c = d.retraitFin();
			if (c != 'd') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 2) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals(" a b")) {
				System.out.println(" KO : contenu obtenu : " + d);
				return;
			}
		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 13
		System.out.print("Test13 : deque.retraitFin() ");
		try {
			char c = d.retraitFin();
			if (c != 'b') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 1) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals(" a")) {
				System.out.println(" KO : contenu obtenu : " + d);
				return;
			}
		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 14
		System.out.print("Test14 : deque.dernier() ");
		try {
			char c = d.dernier();
			if (c != 'a') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 1) {
				System.out.println();
				System.out.println(" KO : taille modifiee : " + d.taille());
				return;
			}
			if (!d.toString().equals(" a")) {
				System.out.println(" KO : contenu modifie : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 15
		System.out.print("Test15 : deque.premier() ");
		try {
			char c = d.premier();
			if (c != 'a') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 1) {
				System.out.println();
				System.out.println(" KO : taille modifiee : " + d.taille());
				return;
			}
			if (!d.toString().equals(" a")) {
				System.out.println(" KO : contenu modifie : " + d);
				return;
			}

		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 16
		System.out.print("Test16 : deque.retraitFin() ");
		try {
			char c = d.retraitDebut();
			if (c != 'a') {
				System.out.println(" KO : caractere renvoye : " + c);
				return;
			}
			if (d.taille() != 0) {
				System.out.println();
				System.out.println(" KO : taille obtenue : " + d.taille());
				return;
			}
			if (!d.toString().equals("")) {
				System.out.println(" KO : contenu obtenu : " + d);
				return;
			}
		} catch (Exception ex) {
			System.out.println(" KO, il y a eu Exception : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");

		// test 17
		System.out.print("Test17 : deque.retraitDebut() ");
		try {
			d.retraitFin();
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			return;

		} catch (DequeVideException ex) {
		} catch (Exception ex) {
			System.out.println(" KO, il n'y a pas eu DequeVideException : ");
			ex.printStackTrace();
			return;
		}
		System.out.println("ok");
		System.out.println("Tous les tests ont reussi !");
	}
}
