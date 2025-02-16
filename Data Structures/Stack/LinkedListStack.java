public class LinkedListStack<T> implements Stack<T> {
    // variables
    private DLNode<T> top;
    private DLNode<T> bottom;

    // constructor
    public LinkedListStack() {
        this.top = null;
        this.bottom = null;
    }

    // methods
    public int size() {
        int count = 0;
        while (top != null) {
            top = top.prev;
            count++;
        }
        return count;
    }

    public void push(T elem) {
        if (bottom == null) {
            top = new DLNode<T>(elem);
            bottom = top;
        } else {
            top.next = new DLNode<T>(elem, top, null);
            top = top.next;
        }
    }

    public T pop() {
        if (top == null) {
            throw new IndexOutOfBoundsException();
        } else {
            T el = top.element;
            top = top.prev;
            top.next = null;
            return el;
        }
    }

    public T peek() {
        return top.element;
    }

    @Override
    public String toString() {
        String out = "-----------TOP------------";
        DLNode<T> el = top;
        while (el != null) {
            out += "\n" + el.element;
            el = el.prev;
        }
        return out + "\n----------BOTTOM----------";
    }

    public static void main(String[] args) {
        LinkedListStack<String> list = new LinkedListStack<>();

        list.push("Apple");
        list.push("Mango");
        list.push("Grape");
        list.push("Pear");
        list.push("Banana");
        list.push("Strawberry");

        list.pop();
        list.push("Tomato");

        System.out.println(list);
        System.out.println("The element at the top of the stack is: " + list.peek());
    }
}
