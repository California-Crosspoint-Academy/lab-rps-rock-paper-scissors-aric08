import java.util.Scanner;
import java.util.Random;

public class GameV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            System.out.print("Enter rock, paper, scissors (or quit): ");
            String user = sc.nextLine();

            if (user.equalsIgnoreCase("quit")) {
                System.out.println("Game over!");
                break;
            }

            String computer = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computer);

            if (user.equalsIgnoreCase(computer)) {
                System.out.println("It's a tie!");
            } else if ((user.equalsIgnoreCase("rock") && computer.equals("scissors")) ||
                       (user.equalsIgnoreCase("paper") && computer.equals("rock")) ||
                       (user.equalsIgnoreCase("scissors") && computer.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}
