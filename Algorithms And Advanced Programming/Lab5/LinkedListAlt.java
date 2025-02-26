import java.util.LinkedList;

public class LinkedListAlt<T> extends LinkedList<T> {
    Node<T> first;
    Node<T> last;

    public LinkedListAlt() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addNode(Node<T> elem) {
        if (isEmpty()) {
            first = elem;
            last = first;
        } else {
            Node<T> oldLast = last;
            last = elem;
            oldLast.next = last;
        }
    }

}
