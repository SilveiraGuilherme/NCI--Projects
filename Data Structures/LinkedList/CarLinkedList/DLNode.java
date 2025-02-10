public class DLNode {
    Car car;
    DLNode previous;
    DLNode next;

    public DLNode(Car car, DLNode prev, DLNode next) {
        this.car = car;
        this.previous = prev;
        this.next = next;
    }

    public DLNode(Car car) {
        this.car = car;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return car.toString();
    }

}