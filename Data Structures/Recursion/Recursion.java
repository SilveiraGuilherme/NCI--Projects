public class Recursion {
    // recursive method to calculate factorial
    public static int recFac(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recFac(n - 1);
    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    public static String removeX(String str) {
        if (str.substring(0).equals("")) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return removeX(str.substring(1));
        } else {
            return str.charAt(0) + removeX(str.substring(1));
        }
    }

    public static boolean containsMPair(int index, int[] arr) {
        if (index + 1 == (arr.length - 1)) {
            return false;
        } else if (arr[index + 1] == arr[index] * 10) {
            return true;
        } else {
            return containsMPair(index + 1, arr);
        }
    }

    public static void main(String[] args) {
        System.out.println(recFac(5));
        System.out.println(countHi("jkbsdhiasdhidasdhiadhi")); // should return 4
        System.out.println(removeX("axbxcxd")); // should return abcd
        int[] arr = { 5, 7, 1, 2, 3, 4, 5, 8, 100 };
        System.out.println(containsMPair(0, arr));
    }
}