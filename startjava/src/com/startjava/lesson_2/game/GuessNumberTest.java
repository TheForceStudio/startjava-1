package com.startjava.lesson_2.game;
import java.time.LocalDateTime;
import java.util.InputMismatchException;

public class GuessNumberTest {
    public static Player player1 = new Player("John");
    public static Player player2 = new Player("Mark");
    private static byte turn = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to GuessNumber game! One of you'll be John, the second will be Mark.");
        System.out.println("I picked the number. Whoever guesses first wins");
        byte pickedNumber = random();
//        byte pickedNumber = 50;

        while (true) {
            turn++;
            try {
                byte inputValue;
                if (isFirstPlayerTurn(turn)) {
                    inputValue = GuessNumber.setup(player1.getName());
                } else {
                    inputValue = GuessNumber.setup(player2.getName());
                }

                if (pickedNumber < inputValue) {
                    System.out.println("Wrong number. Your number is bigger then mine");
                } else if (pickedNumber > inputValue) {
                    System.out.println("Wrong number. Your number is smaller then mine");
                } else {
                    System.out.println("You did it! With " + turn + " tries");
                    if (GuessNumber.shouldContinue()) {
                        System.out.println("I was changed the number. Try to guess again");
                        pickedNumber = random();
                    } else {
                        break;
                    }
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please use only numbers (from 0 to 100)");
            }
        }
    }

    private static byte random() {
        LocalDateTime now = LocalDateTime.now();
        int seconds = now.getSecond();
        if (seconds % 2 == 0) {
            return (byte) (now.getNano() / 10000000);
        } else {
            return (byte) (now.getNano() / 10000000 + 1);
        }
    }

    private static boolean isFirstPlayerTurn(int turnNum) {
        return turnNum % 2 != 0;
    }
}
