import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String args[]) {
        Random r = new Random();
        int NumbertoGuess = r.nextInt(100);
        int tries = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("NUMBER GUESSING GAME:-");

        System.out.println("Guess a number between 1 to 100:");
        boolean match = false;

        while (!match == true) {
            System.out.println("Enter your guess:");
            int Guess = sc.nextInt();
            tries++;

            if (Guess == NumbertoGuess) {
                match = true;
            } else if (Guess > NumbertoGuess) {
                System.out.println("Your guess is too high! try again");
            } else {
                System.out.println("Your guess is too low! try again ");
            }
        }

        System.out.println("Congratulations!!! You guessed the number in " + tries + " attempts");

    }
}