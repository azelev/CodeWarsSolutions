public class TotalPoints {

    public static int points(String[] games) {
        int points = 0;
        for (String game : games) {
            String[] scores = game.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScore = Integer.parseInt(scores[1]);
            if (ourScore > opponentScore) {
                points += 3;
            } else if (ourScore < opponentScore) {
                points += 0;
            } else {
                points += 1;
            }
        }
        return points;
    }
}