public class Node<T> {
    T element;
    Node<T> next;

    public Node(T elem) {
        element = elem;
        next = null;
    }

    public Node(T elem, Node<T> n) {
        element = elem;
        next = n;
    }

}
