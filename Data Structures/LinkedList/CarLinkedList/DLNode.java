public class DLNode<T> {
    T element;
    DLNode<T> previous;
    DLNode<T> next;

    public DLNode(T el, DLNode<T> prev, DLNode<T> next) {
        this.element = el;
        this.previous = prev;
        this.next = next;
    }

    public DLNode(T el) {
        this.element = el;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return element.toString();
    }

}