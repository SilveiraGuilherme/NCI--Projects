
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
        Patient patient1 = new Patient("John", "121 Main Street, Dublin", 123456789, "Feeling headaches");
        DLNode<Patient> patient = new DLNode<Patient>(patient1);

        System.out.println(patient);
    }
}
