
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
        // gauss's formula sum = n(n + 1)/2
        // sum even numbers -> (n / 2) * ((n / 2) + 1); (n - n%2) to make sure n is even
        long k = (n - (n % 2)) / 2;
        long num = (k * (k + 1));
        return num;
    }

    public static String concatDigits(int n) {
        StringBuilder sb = new StringBuilder("");
        // int nComb = (n + 1) * (n + 1);

        for (int i = n; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                sb.append(i).append(j).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // to be implemented
    public static String plateNumber() {
        return "";
    }

    // to be implemented
    public String eliminateHalf(int n) {
        return "";
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        // long sumPosN = sumConstTime(829087498);
        String digSeq = concatDigits(9);
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println(digSeq);
        System.out.println("The elapsed time to perform this operation was " + elapsedTime + " nanoseconds.");
    }
}