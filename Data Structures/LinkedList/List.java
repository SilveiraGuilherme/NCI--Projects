
public interface List<T> {

	// This method should check if the LinkedList is empty
	public boolean isEmpty();

	// we should also have a method to calculate the size of the LinkedList
	public int size();

	/**
	 * This method adds an element to the list in the position previous to the first
	 * occurrence of the the target element
	 **/
	public void addBefore(T target, T elem);

	/**
	 * This method adds an element to the list in the position after to the first
	 * occurrence of the the target element
	 **/
	public void addAfter(T target, T elem);

	/**
	 * This method removes the first occurance of the target from the list
	 **/
	public void remove(T target);
}
