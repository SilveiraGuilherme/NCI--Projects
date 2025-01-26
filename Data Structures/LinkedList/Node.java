/*
This is our class definition... we are using generics to allow java to set the generic parameter at runtime.
This is denoted using <T>
*/

public class Node<T> {
	// Instance variables
	// We need to have some data that we would like to store and
	// We need to be able to find the next element

	T element;
	Node<T> next;

	// constructor
	public Node(T el, Node<T> n) {
		element = el;
		next = n;
	}

	public Node(T el) {
		element = el;
		next = null;
	}

	// methods
	@Override
	public String toString() {
		return "<Element: " + element + ">";
	}
}