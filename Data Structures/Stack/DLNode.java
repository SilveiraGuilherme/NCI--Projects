/*
This is our class definition... we are using generics to allow java to set the generic parameter at runtime.
This is denoted using <T>
*/

public class DLNode<T> {
	// Instance variables
	// We need to have some data that we would like to store and
	// We need to be able to find the next element

	T element;
	DLNode<T> prev;
	DLNode<T> next;

	// constructor
	public DLNode(T el, DLNode<T> p, DLNode<T> n) {
		element = el;
		prev = p;
		next = n;
	}

	public DLNode(T el) {
		element = el;
		prev = null;
		next = null;
	}

	// methods
	@Override
	public String toString() {
		return "<Element: " + element + ">";
	}
}