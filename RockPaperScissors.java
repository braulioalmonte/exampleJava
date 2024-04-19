import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                int computer = random.nextInt(3);
                String computerChoice = "";

                System.out.print("Rock, Paper, or Scissors: ");
                String playerChoice = scanner.nextLine();

                if (computer == 0) {
                    computerChoice = "Rock";
                } else if (computer == 1) {
                    computerChoice = "Paper";
                } else if (computer == 2) {
                    computerChoice = "Scissors";
                }

                if (computerChoice.equalsIgnoreCase(playerChoice)) {
                    System.out.println("It's a tie");
                } else if (computerChoice.equalsIgnoreCase("Rock") && playerChoice.equalsIgnoreCase("Paper")) {
                    System.out.println("You win");
                } else if (computerChoice.equalsIgnoreCase("Rock") && playerChoice.equalsIgnoreCase("Scissors")) {
                    System.out.println("You lose");
                    throw new IllegalArgumentException("Wrong choice, Rock beats Scissors");
                } else if (computerChoice.equalsIgnoreCase("Scissors") && playerChoice.equalsIgnoreCase("Rock")) {
                    System.out.println("You win");
                } else if (computerChoice.equalsIgnoreCase("Scissors") && playerChoice.equalsIgnoreCase("Paper")) {
                    System.out.println("You lose");
                    throw new IllegalArgumentException("Wrong choice, Scissors beats Paper");
                } else if (computerChoice.equalsIgnoreCase("Paper") && playerChoice.equalsIgnoreCase("Scissors")) {
                    System.out.println("You win");
                } else if (computerChoice.equalsIgnoreCase("Paper") && playerChoice.equalsIgnoreCase("Rock")) {
                    System.out.println("You lose");
                    throw new IllegalArgumentException("Wrong choice, Paper beats Rock");
                }

                System.out.print("Do you want to continue playing? (yes/no): ");
                String decision = scanner.nextLine().toLowerCase();
                if (decision.equalsIgnoreCase("no")) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
