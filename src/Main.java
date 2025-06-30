import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Rock Paper Scissors Game

        // Declaration of variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // Get Choice from the user
            System.out.print("Enter your choice (Rock, Paper, Scissors):");
            playerChoice = scanner.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Get Random Choice from the computer
            int computerIndex = random.nextInt(3);
            computerChoice = choices[computerIndex].toLowerCase();
            System.out.println("Computer chose: " + computerChoice);

            // Check win Conditions
            if (computerChoice.equals(playerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                    (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Ask to Play Again ?
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while(playAgain.equals("yes"));

        // GoodBye Message
        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}