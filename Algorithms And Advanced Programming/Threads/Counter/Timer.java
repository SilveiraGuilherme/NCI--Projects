public class Timer {
    public static void main(String[] args) {
        // Thread cu = new Thread(new CountUp(5));
        Thread cd1 = new Thread(new CountDown(10));
        Thread cd2 = new Thread(new CountDown(10));

        // cu.start();
        cd1.start();
        cd2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        try {
            cd1.join();
            cd2.join();
        } catch (InterruptedException e) {
        }

        System.out.println("Count down is completed");
    }
}
