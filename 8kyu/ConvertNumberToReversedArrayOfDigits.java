public class Kata {
    public static int[] digitize(long n) {
        if (n == 0) {
            return new int[] { 0 };
        }

        int digitsCount = (int) Math.floor(Math.log10(n)) + 1;
        int[] digits = new int[digitsCount];
        int i = 0;

        while (n > 0) {
            digits[i++] = (int) (n % 10);
            n /= 10;
        }

        return digits;
    }
}