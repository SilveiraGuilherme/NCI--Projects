public interface Stack<T> {
    // this method adds an element at the top of the stack.
    // if the array is already full (top == maxSize), it throws an error
    public void push(T elem);

    // this method removes the element at the top of the stack and returns it
    public T pop();

    // TODO: create method peek()
}