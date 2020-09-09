package com.startjava.lesson_2.game;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner input = new Scanner(System.in);

    public static byte setup(String name) {
        System.out.println("" + name + "'s turn: ");
        return input.nextByte();
    }

    public static boolean shouldContinue() {
        System.out.println("Do you want to continue? Type \"yes\" or \"no\"");
        String answer = input.next();
        switch (answer) {
            case "yes":
                return true;
            case "no":
                return false;
            default:
                shouldContinue();
                return false;
        }
    }
}



