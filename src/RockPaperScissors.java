import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerTurn = random.nextInt(3);
        String computersMove = "";
        final String ROCK = "Rock";
        final String PAPER = "Paper";
        final String SCISSORS = "Scissors";

        System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
        String playerMove = scanner.next();

        switch (playerMove) {
            case "r", "Rock" -> playerMove = ROCK;
            case "p", "Paper" -> playerMove = PAPER;
            case "s", "Scissors" -> playerMove = SCISSORS;
            default -> {
                System.out.println("Invalid input. Please try again...");
                return;
            }
        }
        switch (computerTurn){
            case 1 ->{
                computersMove = ROCK;
                System.out.println("Computer choose the Rock.");
            }
            case 2 ->{
                computersMove = PAPER;
                System.out.println("Computer choose the Paper.");
            }
            case 0 ->{
                computersMove = SCISSORS;
                System.out.println("Computer choose the Scissors.");
            }
        }
        if (playerMove.equals(ROCK) && computersMove.equals(SCISSORS) ||
                playerMove.equals(PAPER) && computersMove.equals(ROCK) ||
                playerMove.equals(SCISSORS) && computersMove.equals(PAPER)){
            System.out.println("You WIN!");
        } else if (playerMove.equals(SCISSORS) && computersMove.equals(ROCK) ||
                playerMove.equals(ROCK) && computersMove.equals(PAPER) ||
                playerMove.equals(PAPER) && computersMove.equals(SCISSORS)){
            System.out.println("You Lose!");
        } else if (playerMove.equals(ROCK) && computersMove.equals(ROCK) ||
                playerMove.equals(PAPER) && computersMove.equals(PAPER) ||
                playerMove.equals(SCISSORS) && computersMove.equals(SCISSORS)) {
            System.out.println("The game is draw.");
        }
    }
}