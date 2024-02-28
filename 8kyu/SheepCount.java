class Kata {
    public static String countingSheep(int num) {
        if (num == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i + " sheep...");
        }
        return sb.toString();
    }
}