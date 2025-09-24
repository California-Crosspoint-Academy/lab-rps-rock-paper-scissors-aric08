import java.util.Scanner;

public class V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rock, Paper, Scissors!");
        System.out.print("Enter your choice: ");
        String user = sc.nextLine();

        String computer = "rock"; // fixed choice
        System.out.println("Computer chose: " + computer);

        if (user.equalsIgnoreCase(computer)) {
            System.out.println("It's a tie!");
        } else if (user.equalsIgnoreCase("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
