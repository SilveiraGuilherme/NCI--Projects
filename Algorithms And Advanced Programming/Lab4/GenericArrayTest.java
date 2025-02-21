import java.util.Iterator;

public class GenericArrayTest {
    public static void main(String[] args) {

        // GenericArray<Integer> arrInt = new GenericArray<Integer>();
        // for(int i=0; i<20; i++){
        // arrInt.addItem(i);
        // }
        // System.out.println("Is the number 15 here? " + arrInt.search(100));

        GenericArray<String> arrString = new GenericArray<String>();
        arrString.addItem("Monday");
        arrString.addItem("Tuesday");
        arrString.addItem("Wednesday");
        arrString.addItem("Thursday");
        // System.out.println(arrString.length());

        arrString.bubbleSort(arrString);

        Iterator<String> iter = arrString.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // arrString.printContent();
        // arrString.selectionSort();
        // arrString.printContent();

    }
}
