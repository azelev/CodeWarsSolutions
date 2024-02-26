public class Clock {
    public static int Past(int h, int m, int s) {
        int hoursInMillis = h * 60 * 60 * 1000;
        int minutesInMillis = m * 60 * 1000;
        int totalMillis = hoursInMillis + minutesInMillis + s * 1000;

        return totalMillis;
    }
}