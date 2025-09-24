import java.util.Scanner;
import java.util.Random;

public class GameV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        int userScore = 0, compScore = 0;

        while (true) {
            System.out.print("Enter r, p, s (or q to quit): ");
            String user = sc.nextLine();

            if (user.equalsIgnoreCase("q")) {
                System.out.println("Final Score - You: " + userScore + " | Computer: " + compScore);
                break;
            }

            String computer = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computer);

            if ((user.equals("r") && computer.equals("scissors")) ||
                (user.equals("p") && computer.equals("rock")) ||
                (user.equals("s") && computer.equals("paper"))) {
                System.out.println("You win!");
                userScore++;
            } else if ((user.equals("r") && computer.equals("paper")) ||
                       (user.equals("p") && computer.equals("scissors")) ||
                       (user.equals("s") && computer.equals("rock"))) {
                System.out.println("Computer wins!");
                compScore++;
            } else if (user.equals("r") || user.equals("p") || user.equals("s")) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
