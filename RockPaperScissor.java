import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String args[])
    {
        System.out.println("------------ ROCK PAPER SCISSOR GAME--------------");
        int userScore=0,compScore=0;
        char response = 'y', userChoice, compChoice;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the following input for the game - ");
        System.out.println("Rock -> R or r");
        System.out.println("Paper -> P or p");
        System.out.println("Scissor -> S or s");
        System.out.println();

        while(response == 'y'){
            System.out.print("Your choice : ");
            userChoice = scanner.next().charAt(0);

            compChoice = ((int) (Math.random() * 3)) == 0 ? ( ((int) (Math.random() * 3)) == 1 ? 'p' : 'r') : 's';

            if ((userChoice == 'r' && compChoice == 's') || (userChoice == 'p' && compChoice == 'r') || (userChoice == 's' && compChoice == 'p')) {
                userScore++;
                System.out.println("You win!!");
            }else {
                compScore++;
                System.out.println("Computer win!! You loose !!");
            }

            System.out.print("Play again (y/n) : ");
            response = scanner.next().charAt(0);
            System.out.println();
        }
        System.out.println("Your score : " + userScore);
        System.out.println("Computer score : " + compScore);

        
    }
}
