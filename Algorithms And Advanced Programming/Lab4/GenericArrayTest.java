import java.util.Iterator;

public class GenericArrayTest {
    public static void main(String[] args) {
        GenericArray<Staff> staff = new GenericArray<Staff>();

        staff.addItem(new Staff(1, "William", 21, 160));
        staff.addItem(new Staff(2, "John", 30, 190));
        staff.addItem(new Staff(3, "Mathew", 18, 170));
        staff.addItem(new Staff(4, "Mark", 70, 180));
        staff.addItem(new Staff(5, "Luke", 41, 165));

        Staff.setSortingChoice(4);
        staff.selectionSort();

        Iterator<Staff> iter = staff.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

    }
}
