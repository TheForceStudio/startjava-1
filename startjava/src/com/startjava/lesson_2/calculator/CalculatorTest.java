package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean end;
        do {
            launch();
            end = end();
        } while (end);
    }

    private static void launch() {
        Scanner sa = Calculator.readInput("Enter first number: ");
        int a = sa.nextInt();
        Scanner sop = Calculator.readInput("Enter operation type (+, -, *, /, ^, %): ");
        String op = sop.next();
        Scanner sb = Calculator.readInput("Enter second number: ");
        int b = sb.nextInt();
        System.out.println("Result is: " + Calculator.getResult(a, b, op));
    }

    private static boolean end() {
        Scanner answer = Calculator.readInput("Do you want to continue? Type \"yes\" or \"no\": ");
        switch (answer.next()) {
            case "yes":
                return true;
            case "no":
                return false;
            default:
                end();
                return false;
        }
    }
}
