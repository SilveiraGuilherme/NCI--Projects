public class LinkedQueue<T> implements Queue<T> {
    // Variables
    Node<T> first;
    Node<T> last;

    // constructor
    public LinkedQueue() {
        first = null;
        last = null;
    }

    // methods
    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int size = 0;
            Node<T> current = first;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        } else {
            return first.element;
        }
    }

    public void enqueue(T el) {
        Node<T> oldLast = last;
        last = new Node<T>(el);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        T target = first.element;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return target;
    }

    @Override
    public String toString() {
        String output = "";
        if (isEmpty()) {
            output = output + "There are no elements in the LinkedQueue";
        } else {
            Node<T> curr = first;
            while (curr != null) {
                output = output + curr.element + " : ";
                curr = curr.next;
            }
        }
        return output;
    }
}
