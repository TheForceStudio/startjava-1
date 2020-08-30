import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        byte guess = random();
//        byte guess = 12;
        Scanner input;
        System.out.println("I guess a random number from 0 to 100. What's it? ");
        byte userInput = 0;
        int triesNumber = 0;
        do {
            triesNumber++;
            input = new Scanner(System.in);
            try {
                userInput = input.nextByte();
                if (guess < userInput) {
                    System.out.println("Wrong number! Your value is greater than my. Try again: ");
                } else if (guess > userInput) {
                    System.out.println("Wrong number! Your value is less than my. Try again: ");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please use only numbers (from 0 to 100)");
            }

        } while (guess != userInput);
        System.out.println("Good job, you found it! With " + triesNumber + " tries");
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
}
