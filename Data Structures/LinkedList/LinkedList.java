/*
In a single Linked List we are going to store objects in a linked allocation storage method, for example;
*/

// [Node data, Pointer] --> [Node data, Pointer] --> [Node data, Pointer] --> null

// [Node data, Pointer] = our Node...

// we are creating the class signature and implementing the
// List interface
public class LinkedList<T> implements List<T> {
	// instance variables
	private Node<T> first;
	private Node<T> last;

	// constructor
	public LinkedList() {
		first = null;
		last = null;
	}

	// methods - here we have to provide the implementation

	public boolean isEmpty() {
		return first == null;
	}

	// we need to have a way of counting the number of nodes in the LinkedList
	// we need to traverse the collection
	// we need to visit each node and increment the counter
	public int size() {
		int count = 0;
		Node<T> current = first;
		// we need to be able to get the next node from the current and increment
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	// able to add, remove, search, etc.., objects
	// it's easy to add/remove the last node

	// we would be able to add an object into the LinkedList and we can return void
	public void add(T el) {
		// we have two cases that exist: either the LinkedList empty or not
		if (isEmpty()) {
			first = new Node<T>(el);
			last = first;
		} else {
			// when we have more than one node we should add the new object at the end of
			// the LinkedList
			last.next = new Node<T>(el);
			last = last.next;
		}
	}

	// we need to have a method that can find if a node exists in the LinkedList
	public boolean contains(T target) {
		// remember that just like the size method we should start at the first node and
		// iterate through the collection in our LinkedList
		boolean found = false;

		// do something
		Node<T> current = first;
		while (current != null) { // if current is null, we are at the end of the LinkedList
			// we have to check if the element is the one we are looking for
			if (current.element == target) {
				found = true;
			}
			current = current.next; // this moves to the next element
		}
		return found;
	}

	// we would like to override the toString methods
	@Override
	public String toString() {
		String out = "";
		Node<T> p = first;
		while (p != null) {
			out += " " + p.element;
			p = p.next;
		}
		return out;
	}

	// add an object at a particular index
	public void addIndex(int index, T el) {
		// index does not exist
		if (index < 0 || index > size())
			throw new IndexOutOfBoundsException();
		// index is at least 0
		if (index == 0) {
			// new element goes at the beggining
			first = new Node<T>(el, first);
			//
			if (last == null) {
				last = first;
			}
			return;
		}
	}

	public void addBefore(T target, T element) {
		Node<T> pred = first;
		for (int k = 1; k < ) {

		}
	}

	// we want to remove an element from the LinkedList
	// to do this we need to pass in an element that we would like to remove
	// we would like to return the object that was removed
	public T remove(T el) {
		// we know that we should cater for the reference pointers
		T found = el;
		while ()
		if (contains(el)) {
			// we need to search and remove
			if (first.element == el) {
				if (size() == 1) {
					found = first.element;
					first = null;
					last = first;
				} else {
					first = first.next;
				}
			}
			return found;
		} else {
		}
	}

	public static void main(String[] args) {
		// we are in main...

		// Let's create the empty LinkedList
		LinkedList<String> myList = new LinkedList<>();

		myList.add("apple");
		myList.add("orange");
		myList.add("grape");

		System.out.println(myList);
		System.out.println("There are " + myList.size() + " elements in the list");

		if (myList.contains("apple")) {
			System.out.println("We have an apple");
		} else {
			System.out.println("There are no apples");
		}
	}
}
