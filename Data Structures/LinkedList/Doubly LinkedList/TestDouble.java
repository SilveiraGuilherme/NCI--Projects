public class TestDouble {

  public static void main(String[] args) {
    System.out.println("testing double");

    MyDoublyLinkedList<String> linked = new MyDoublyLinkedList<>();

    linked.add("apple");
    linked.add("orange");
    linked.add("pear");

    System.out.println(linked);
    System.out.println("----------------------------");
    linked.remove("pear");
    System.out.println(linked);
    linked.prepend("banana");
    System.out.println(linked);
    linked.add(2, "grape");
    System.out.println(linked);

  }
}
