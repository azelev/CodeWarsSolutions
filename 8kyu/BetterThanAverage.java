public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int points : classPoints) {
            sum += points;
        }

        sum += yourPoints;

        double average = (double) sum / (classPoints.length + 1);

        return yourPoints > average;
    }

    public static void main(String[] args) {
        int[] classPoints = { 70, 80, 90 };
        int yourPoints = 85;
        System.out.println(betterThanAverage(classPoints, yourPoints));
    }
}