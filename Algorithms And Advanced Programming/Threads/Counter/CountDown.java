public class CountDown implements Runnable {
    int times;

    CountDown(int times) {
        this.times = times;
    }

    public void run() {
        for (int i = times; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I was interrupted, but not finished");
                return;
            }
            System.out.println("Downtimer: \t" + i);
        }
    }
}