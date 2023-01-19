import java.util.Random;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number - between 1 and 100!");
        int userInput = parseInt(sc.nextLine());


        while (userInput != secretNumber) {
            if (userInput < secretNumber) {
                System.out.println("Too Low!");
            } else if (userInput > secretNumber) {
                System.out.println("Too High!");
            }
            System.out.println("You suck. Guess again!");
            userInput = sc.nextInt();
        }

        System.out.println("Finally... well done.");

    }
}
