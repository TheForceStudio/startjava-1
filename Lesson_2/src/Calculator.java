import java.util.Scanner;

public class Calculator {
    public static Scanner readInput(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in);
    }

    private static Boolean isOpValid(String op) {
        String[] opTypes = {"+", "-", "*", "/", "^", "%"};

        for (String opType : opTypes) {
            if (opType.equals(op)) {
                return true;
            }
        }
        return false;
    }

    public static int getResult(int a, int b, String op) {
        if (isOpValid(op)) {
            switch(op) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": return a / b;
                case "^": return customPow(a, b);
                case "%": return a % b;
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
