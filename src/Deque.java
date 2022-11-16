public interface Deque<E> {

	/**
	 * renvoie le nombre d'elements qui se trouvent dans le deque
	 * @return nombre d'elements
	 */
	public int taille();

	/**
	 * verifie si le deque est vide
	 * @return true si la deque est vide, false sinon
	 */
	public boolean estVide();

	/**
	 * ajoute un element en fin du deque (queue)
	 * @param element l'element a ajouter
	 */
	public void ajoutDebut(E element);

	/**
	 * ajoute un element en debut de deque (tete)
	 * 
	 * @param element l'element a ajouter
	 */
	public void ajoutFin(E element);

	/**
	 * renvoie l'element qui se trouve en tete du deque et l'enleve 
	 * @return l'element en tete
	 * @throws DequeVideException si le deque est vide
	 */
	public E retraitDebut() throws DequeVideException;

	/**
	 * renvoie l'element qui se trouve en queue de deque et l'enleve
	 * @return l'element en queue
	 * @throws DequeVideException si le deque est vide
	 */
	public E retraitFin() throws DequeVideException;

	/**
	 * renvoie l'element qui se trouve en tete du deque sans l'enlever
	 * @return l'element en tete
	 * @throws DequeVideException si le deque est vide
	 */
	public E premier() throws DequeVideException;

	/**
	 * renvoie l'element qui se trouve en queue du deque sans l'enlever
	 * 
	 * @return l'element en queue
	 * @throws DequeVideException si le deque est vide
	 */
	public E dernier() throws DequeVideException;

}