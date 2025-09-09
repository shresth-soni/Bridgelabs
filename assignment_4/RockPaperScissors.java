import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0;
        
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Best of 10 rounds. Enter your choice: rock, paper, or scissors");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Round " + i + " - Enter your choice: ");
            String userChoice = sc.nextLine().toLowerCase();
            
            // Validate user input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
                i--; // Don't count this round
                continue;
            }
            
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            
            String winner = getWinner(userChoice, computerChoice);
            
            if (winner.equals("User")) {
                userWins++;
                System.out.println("You win this round!");
            } else if (winner.equals("Computer")) {
                compWins++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a draw!");
            }
            
            System.out.println("Score - You: " + userWins + ", Computer: " + compWins);
            System.out.println();
        }
        
        // Final results
        System.out.println("=== FINAL RESULTS ===");
        System.out.println("Your wins: " + userWins);
        System.out.println("Computer wins: " + compWins);
        
        if (userWins > compWins) {
            System.out.println("Congratulations! You won the game!");
        } else if (compWins > userWins) {
            System.out.println("Computer wins! Better luck next time!");
        } else {
            System.out.println("It's a tie game!");
        }
        
        sc.close();
    }
}