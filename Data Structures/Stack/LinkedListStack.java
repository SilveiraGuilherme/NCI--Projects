public class LinkedListStack<T> implements Stack<T> {
    // variables
    private Node<T> top;

    // constructor
    public LinkedListStack() {
        this.top = null;
    }

    // methods
    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node<T> current = top;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public void push(T elem) {
        top = new Node<T>(elem, top);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            T el = top.element;
            top = top.next;
            return el;
        }
    }

    public T peek() {
        return top.element;
    }

    @Override
    public String toString() {
        String out = "-----------TOP------------";
        Node<T> el = top;
        while (el != null) {
            out += "\n" + el.element;
            el = el.next;
        }
        return out + "\n----------BOTTOM----------";
    }

    public static void main(String[] args) {
        LinkedListStack<String> list = new LinkedListStack<String>();

        list.push("Apple");
        list.push("Mango");
        list.push("Grape");
        list.push("Pear");
        list.push("Banana");
        list.push("Strawberry");

        list.push("Tomato");
        list.pop();
        list.pop();

        System.out.println(list);
        System.out.println("The element at the top of the stack is: " + list.peek());
    }
}
