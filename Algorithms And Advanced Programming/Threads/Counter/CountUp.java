public class CountUp implements Runnable {
    int times;

    CountUp(int times) {
        this.times = times;
    }

    public void run() {
        for (int i = 0; i <= times; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("Uptimer: \t" + i);
        }
    }
}