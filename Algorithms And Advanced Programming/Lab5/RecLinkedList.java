// Write a recursive function that prints all the values from a linked list.

public class RecLinkedList {
    public static void main(String[] args) {
        LinkedListAlt<String> list = new LinkedListAlt<String>();

        list.addNode(new Node<String>("Apple"));
        list.addNode(new Node<String>("Banana"));
        list.addNode(new Node<String>("Grape"));
        list.addNode(new Node<String>("Melon"));
        list.addNode(new Node<String>("Watermelon"));
        list.addNode(new Node<String>("Fig"));
        list.addNode(new Node<String>("Passionfruit"));
        list.addNode(new Node<String>("Strawberry"));
        list.addNode(new Node<String>("Orange"));
        list.addNode(new Node<String>("Pineapple"));

        printNode(list.first);
    }

    public static void printNode(Node<String> current) {
        System.out.println(current.element);
        if (current.next == null) {
            return;
        } else {
            printNode(current.next);
        }
    }

    public static void printList(LinkedListAlt<String> list) {
        if (list.isEmpty()) {
            return;
        }
        System.out.println(list.getFirst());
    }
}
