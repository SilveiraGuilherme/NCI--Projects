public class RecursionPower {
    // a) Write a function called Power(int x, int y) which returns the value of x
    // to the power of y.
    // i. Write a recursive version of this function.
    // ii. Write an iterative version of this function.
    public static void main(String[] args) {

        // 2 ^ 0 = 1
        // 3 ^ 2 = 9
        // 2 ^ 10 = 1024
        System.out.println("===Recursive solution===");
        testPowerRec(2, 0);
        testPowerRec(3, 2);
        testPowerRec(2, 10);
        System.out.println("========================");

        System.out.println("===Iterative solution===");
        testPowerIt(2, 0);
        testPowerIt(3, 2);
        testPowerIt(2, 10);
        System.out.println("========================");

    }

    public static void testPowerRec(int x, int y) {
        int powerXY = powerRec(x, y);
        System.out.println(x + "^" + y + "=" + powerXY);
    }

    public static void testPowerIt(int x, int y) {
        int powerXY = powerIt(x, y);
        System.out.println(x + "^" + y + "=" + powerXY);
    }

    // recursively
    // x^y = x * x^(y - 1)
    public static int powerRec(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * powerRec(x, y - 1);
        }
    }

    // iteratively
    public static int powerIt(int x, int y) {
        int result = 1;
        while (y > 0) {
            result = result * x;
            y--;
        }
        return result;
    }
}