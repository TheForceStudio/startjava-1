import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private static Scanner input;

    public static byte setup(String name) {
        System.out.println("" + name + "'s turn: ");
        input = new Scanner(System.in);
        return input.nextByte();
    }
}



