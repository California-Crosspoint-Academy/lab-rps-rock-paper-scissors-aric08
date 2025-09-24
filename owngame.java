import java.util.Scanner;
import java.util.Random;

public class owngame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1; // 1–100
        int guess = 0;
        int tries = 0;

        System.out.println("Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            tries++;

            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + tries + " tries.");
            }
        }
    }
}
