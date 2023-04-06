public class Exercises {
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int last = n % 10;
            reversed = reversed * 10 + last;
            n = n / 10;
        }

        return reversed;
    }

    public static int reverseNumberRecursive(int n) {
        // 3468
        if (n / 10 == 0) {
            return n % 10;
        }
        return Integer.valueOf("" + n % 10 + reverseNumberRecursive(n / 10));
    }

    public static void main(String[] args) {
        int n = 1234;
        int reversedN = reverseNumber(n);

        System.out.println(" n = " + n + "\n" + "reversed = " + reversedN);
        System.out.println(reverseNumberRecursive(9823));
    }
}
