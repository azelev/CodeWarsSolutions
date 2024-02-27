public class Kata {
    public static int rentalCarCost(int d) {
        if (d < 3) {
            return d * 40; // No discount for less than 3 days
        } else if (d < 7) {
            return d * 40 - 20; // Discount of $20 for 3-6 days
        } else {
            return d * 40 - 50; // Discount of $50 for 7 or more days
        }
    }
}