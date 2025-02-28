public class DLNode<T> {
    T elem;
    DLNode<T> previous;
    DLNode<T> next;

    public DLNode(T elem, DLNode<T> prev, DLNode<T> next) {
        this.elem = elem;
        this.previous = prev;
        this.next = next;
    }

    public DLNode(T elem) {
        this.elem = elem;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return elem.toString();
    }

    public static void main(String[] args) {
        Car car1 = new Car("defdef", "dedfwe", "wedfwd");
        DLNode<Car> car = new DLNode<Car>(car1);

        System.out.println(car);
    }
}