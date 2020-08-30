import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sa = readInput("Enter first number: ");
        int a = sa.nextInt();
        Scanner sb = readInput("Enter second number: ");
        int b = sb.nextInt();
        Scanner sop = readInput("Enter operation type (+, -, *, /, ^, %): ");
        String op = sop.next();
        System.out.println("Result is: " + getResult(a, b, op));
    }

    private static Scanner readInput(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in);
    }

    private static Boolean isOpValid(String op) {
        String[] opTypes = {"+", "-", "*", "/", "^", "%"};

        for (String opType: opTypes) {
            if (opType.equals(op)) {
                return true;
            }
        }
        return false;
    }

    private static int getResult(int a, int b, String op) {
        if (isOpValid(op)) {
            if (op.equals("+")) {
                return a + b;
            } else if (op.equals("-")) {
                return a - b;
            } else if (op.equals("*")) {
                return a * b;
            } else if (op.equals("/")) {
                return a / b;
            } else if (op.equals("^")) {
                return customPow(a, b);
            } else {
                return a % b;
            }
        }
        return 0;
    }

    private static int customPow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
