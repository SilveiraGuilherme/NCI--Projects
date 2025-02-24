// Given the well-known Fibonacci sequence we can calculate the nth number F_n= F_(n-1)+F_(n-2),
// calculate a Tribonacci number such that T_n= T_(n-1)+T_(n-2)+T_(n-3).
// Assume the first 3 numbers are as follows T_0=0, T_1=1, T_2=1. 

public class RecTribonacci {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int tribonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2 || n == 3) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(tribonacci(5));
    }
}