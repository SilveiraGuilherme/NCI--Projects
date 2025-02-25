public class testQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("The size of the queue is " + queue.size());

        queue.dequeue();
        queue.dequeue();

        System.out.println("The size of the queue is " + queue.size());
    }
}
