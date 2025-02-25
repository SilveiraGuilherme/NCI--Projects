public class Node<T> {
    T element;
    Node<T> next;

    public Node(T el) {
        element = el;
        next = null;
    }

    public Node(T el, Node<T> n) {
        element = el;
        next = n;
    }

    @Override
    public String toString() {
        return "<element: " + element + ">";
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(1);
        System.out.println(n1);
    }
}