public class Kata {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num = 10;
        String result = evenOrOdd(num);
        System.out.println(num + " is " + result);
    }

}