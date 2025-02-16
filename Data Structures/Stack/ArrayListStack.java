import java.util.*;

public class ArrayListStack<T> implements Stack<T> {
    // variables
    private int top;
    private ArrayList<T> list;

    // constructor
    public ArrayListStack() {
        this.top = -1;
        this.list = new ArrayList<T>();
    }

    // methods
    public void push(T elem) {
        top++;
        list.add(top, elem);
    };

    public T pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException();
        } else {
            T target = list.get(top);
            list.remove(top);
            top--;
            return target;
        }
    }

    public T peek() {
        return list.get(top);
    }

    @Override
    public String toString() {
        String output = "----------TOP-----------";
        int curr = top;
        while (curr >= 0) {
            output += "\n" + list.get(curr);
            curr--;
        }
        return output + "\n----------BOTTOM----------";
    }

    public static void main(String[] args) {
        ArrayListStack<String> list = new ArrayListStack<>();

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
