import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sa = calculator.readInput("Enter first number: ");
        int a = sa.nextInt();
        Scanner sop = calculator.readInput("Enter operation type (+, -, *, /, ^, %): ");
        String op = sop.next();
        Scanner sb = calculator.readInput("Enter second number: ");
        int b = sb.nextInt();
        System.out.println("Result is: " + calculator.getResult(a, b, op));
    }
}
