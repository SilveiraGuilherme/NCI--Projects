public class DLNode<T> {
    T element;
    DLNode<T> previous;
    DLNode<T> next;

    public DLNode(T el, DLNode<T> prev, DLNode<T> succ) {
        this.element = el;
        this.previous = prev;
        this.next = succ;
    }

    public DLNode(T el) {
        this.element = el;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "DLNode{" + "element=" + element + "}";
    }

    public static void main(String[] args) {
        DLNode<String> node1 = new DLNode<>("Keith");
        System.out.println(node1);
        DLNode<String> node2 = new DLNode<>("Jack", null, node1);
        System.out.println(node2.next);
        node1.previous = node2;
        System.out.println(node1.previous);
    }
} // end of the DLNode class
