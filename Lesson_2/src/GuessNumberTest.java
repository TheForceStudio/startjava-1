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
//        GuessNumber.setup(player1.getName()))

        while (true) {
            turn++;
            if (turn > 1) {
                turn = 0;
            }
            try {
                byte inputValue = 0;
                if (turn == 0) {
                    inputValue = GuessNumber.setup(player1.getName());
                } else {
                    inputValue = GuessNumber.setup(player2.getName());
                }

                if (pickedNumber < inputValue) {
                    System.out.println("Wrong number. Your number is bigger then mine");
                } else if (pickedNumber > inputValue) {
                    System.out.println("Wrong number. Your number is smaller then mine");
                } else {
                    System.out.println("You did it!");
                    break;
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
}