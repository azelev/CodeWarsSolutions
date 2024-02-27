public class BasicOperations {

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                if (v2 == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
                return v1 / v2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }
}