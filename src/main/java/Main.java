import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Random randomNumber = new Random();
        int number = randomNumber.nextInt((100 - 1) + 1) + 1;

        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100.");
        int initialInput = scanner.nextInt();
        //int secondaryInput = initialInput;

        while (initialInput < 1 || initialInput > 100) {
            System.out.println("Your guess is not between 1 and 100, please try again.");
            initialInput = scanner.nextInt();
        }
        int secondaryInput = initialInput;

        int guessCounter = 1;

        while (!(secondaryInput == number)) {

            if (secondaryInput < number) {
                System.out.println("Your guess is too small. Guess again.");
            } else {
                System.out.println("Your guess is too big. Guess again.");
            }

            secondaryInput = scanner.nextInt();
            while (secondaryInput < 1 || secondaryInput > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again.");
                secondaryInput = scanner.nextInt();
            }
            if (secondaryInput != initialInput) {
                guessCounter++;
            }
            initialInput = secondaryInput;
        }

        System.out.println("Congradulations!! It took you " + guessCounter + " guess(es).");
    }


}
