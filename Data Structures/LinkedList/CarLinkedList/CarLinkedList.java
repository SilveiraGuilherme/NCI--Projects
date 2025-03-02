public class CarLinkedList implements CarList {
    private DLNode<Car> first;
    private DLNode<Car> last;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int size = 0;
        DLNode<Car> current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public int readySize() {
        DLNode<Car> current = first;
        int count = 0;
        while (current != null) {
            if (current.elem.status) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public String currentProblems() {
        DLNode<Car> current = first;
        String notReady = "Cars with problems:\n";
        while (current != null) {
            if (!current.elem.status) {
                notReady += current.elem.regist + ": " + current.elem.pDesc + "\n";
            }
            current = current.next;
        }
        return notReady;
    }

    public double getAverage() {
        DLNode<Car> current = first;
        double avgCost = 0.0;
        int count = 0;
        while (current != null) {
            if (current.elem.fCost != 0) {
                avgCost += current.elem.fCost;
                count++;
            }
            current = current.next;
        }
        avgCost = avgCost / count;
        return avgCost;
    }

    public void add(Car el) {
        if (isEmpty()) {
            first = new DLNode<Car>(el);
            last = first;
        } else {
            last.next = new DLNode<Car>(el, last, null);
            last = last.next;
        }
    }

    public void removeInd(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = first.next;
            first.previous = first;
            if (first == null) {
                last = first;
            }
        } else {
            DLNode<Car> pred = first;
            for (int k = 1; k <= index - 1; k++) {
                pred = pred.next;
            }
            pred.next = pred.next.next;
            if (pred.next == null) {
                last = pred;
            } else {
                pred.next.previous = pred;
                last = pred.next;
            }
        }
    }

    public void remove(String target) {
        // DLNode current = first;
        // int index = 0;
        // while (current != null && !current.elem.regist.equals(target)) {
        // index++;
        // current = current.next;
        // }
        // if (current != null && current.elem.regist.equals(target)) {
        // removeInd(index);
        // }
        DLNode<Car> current = first;
        while (current != null) {
            if (current.elem.regist.equals(target)) {
                if (current.previous == null) {
                    first = current.next;
                    current.next.previous = null;
                } else {
                    current.previous.next = current.next;
                    if (current.next == null) {
                        last = current.previous;
                    } else {
                        current.next.previous = current.previous;
                    }
                }
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        String out = "";
        DLNode<Car> p = first;
        while (p != null) {
            out += p.elem + "\n\n";
            p = p.next;
        }
        return out;
    }
}
