public class Kata {

    public static int makeNegative(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            return number;
        }
        return -number;
    }

    public static void main(String[] args) {
        int num1 = -1;
        int num2 = -5;
        int num3 = 0;

        System.out.println(makeNegative(num1));
        System.out.println(makeNegative(num2));
        System.out.println(makeNegative(num3));
    }

}