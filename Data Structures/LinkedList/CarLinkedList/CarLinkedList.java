public class CarLinkedList<T> implements CarList<T> {
    DLNode<Car> first;
    DLNode<Car> last;

    public boolean isEmpty() {
        return first == null;
    }

    public int readySize() {
        if (isEmpty()) {
            return 0;
        } else {
            DLNode<Car> current = first;
            int count = 0;
            while (current != null) {
                if (current.element.isReady(current.element.status)) {
                    count++;
                }
                current = current.next;
            }
            return count;
        }
    }

    public String currentProblems() {
        if (isEmpty()) {
            return "There are no cars with problems.";
        } else {
            DLNode<Car> current = first;
            String notReady = "";
            while (current != null) {
                if (!current.element.isReady(current.element.status)) {
                    notReady += current.element.regist + ": " + current.element.pDesc + "\n";
                }
                current = current.next;
            }
            return "Cars with problems:\n" + notReady;
        }
    }

    public double getAverage() {
        DLNode<Car> current = first;
        int totalFCost = 0;
        int count = 0;
        while (current != null) {
            totalFCost += current.element.fCost;
            count++;
            current = current.next;
        }
        double average = totalFCost / count;
        return average;
    }

    public void add(Car el) {
        if (isEmpty()) {
            first = new DLNode<Car>(el, null, null);
            last = first;
        } else {
            last.next = new DLNode<Car>(el, last, null);
            last = last.next;
        }
    }

    public void remove(String target) {
        DLNode<Car> current = first;
        while (current != null) {
            if (current.element.regist.equals(target)) {
                current.previous.next = current.next;
                if (current.next == null) {
                    last = current.previous;
                } else {
                    current.next.previous = current.previous;
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
            out += p.element + "\n\n";
            p = p.next;
        }
        return out;
    }

    public static void main(String[] args) {
        Car car1 = new Car("19-D-21", "Keith Maycock", "The car only had 3 wheels", 100, "Ready for collection");
        Car car2 = new Car("19-D-22", "Jane Maycock", "The car is broken", 2000, "On Maintenance");
        Car car3 = new Car("19-D-23", "Jhon Maycock", "The car does not have seats", 500, "Ready for collection");
        Car car4 = new Car("19-D-24", "Kassia Maycock", "The car is ugly", 5000, "On Maintenance");
        Car car5 = new Car("19-D-25", "Billy Maycock", "The car is noisy", 50, "Ready for collection");

        CarLinkedList<Car> carList = new CarLinkedList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        System.out.println(carList);

        carList.remove("19-D-22");
        carList.remove("19-D-25");

        int numReady = carList.readySize();
        String notReady = carList.currentProblems();
        double avgCost = carList.getAverage();

        System.out.println(carList);
        System.out.println(numReady);
        System.out.println(notReady);
        System.out.println(avgCost);

        // System.out.println(car1.regist);
        // System.out.println(car2.regist);
        // System.out.println(car3.regist);
        // System.out.println(car4.regist);
        // System.out.println(car5.regist);
    }
}
