
public class Lab2 {
    public static int sum(int n) {
        // int num = 0;
        // for (int i = 0; i <= n; i++) {
        // num += i;
        // }
        int num = (n * (n + 1)) / 2;
        return num;
    }

    public static long sumConstTime(int n) {
        long num = ((n - (n % 2)) * ((n - (n % 2)) + 2)) / 4;
        return num;
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        long sumPosN = sumConstTime(328472853);
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println(sumPosN);
        System.out.println("The elapsed time to perform this operation was " + elapsedTime + " nanoseconds.");
    }
}