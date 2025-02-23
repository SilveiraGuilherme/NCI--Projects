// Write a recursive function that prints all the values from a linked list.

import java.util.LinkedList;

public class RecLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        list.add("Melon");
        list.add("Watermelon");
        list.add("Fig");
        list.add("Passionfruit");
        list.add("Strawberry");
        list.add("Orange");
        list.add("Pineapple");

        printList(list);
    }

    public static void printList(LinkedList<String> list) {
        if (list.isEmpty()) {
            return;
        }
        System.out.println(list.getFirst());
        printList(new LinkedList<>(list.subList(1, list.size())));
    }
}
