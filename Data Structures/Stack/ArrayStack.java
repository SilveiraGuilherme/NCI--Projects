import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private int maxSize;
    private int top;
    private T[] items;

    public ArrayStack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.items = (T[]) new Object[maxSize];
    }

    // this method adds an element at the top of the stack.
    // if the array is already full (top == maxSize), it throws an error
    public void push(T elem) {
        if (top == maxSize) {
            throw new IndexOutOfBoundsException();
        } else {
            top++;
            items[top] = elem;
        }
    }

    // this method removes the element at the top of the stack and returns it
    public T pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException();
        } else {
            T elem = items[top];
            top--;
            return elem;
        }
    }

    public T peek() {
        return items[top];
    }

    // We need to able to increase the size of the array in case it becomes full
    // This method doubles the size of it
    public void reallocate() {
        maxSize *= 2;
        items = Arrays.copyOf(items, maxSize);
    }

    @Override
    public String toString() {
        String str = "TOP";
        int counter = top;
        while (counter >= 0) {
            str += "\n" + items[counter];
            counter--;
        }
        return str + "\nBOTTOM";
    }

    public static void main(String[] args) {
        ArrayStack<String> list = new ArrayStack<>(10);

        list.push("Apple");
        list.push("Mango");
        list.push("Grape");
        list.push("Pear");
        list.push("Banana");
        list.push("Strawberry");

        list.pop();

        System.out.println(list);
        System.out.println("The top element is: " + list.peek());
    }

}