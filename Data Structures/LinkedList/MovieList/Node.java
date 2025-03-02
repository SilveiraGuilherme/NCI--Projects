public class Node<T> { // This is a generic Node that accepts elements of any type
    // variables
    T element;
    Node<T> next;

    // constructors
    public Node(T el, Node<T> n) {
        this.element = el;
        this.next = n;
    }

    public Node(T el) {
        this.element = el;
        this.next = null;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
