import java.util.Scanner;

public class GuessNumber {
    void main() {
        int ran = (int)(Math.random()*100);
        int score = 100;
        System.out.print("Guess the number: ");
        while (true) {
            if (score == 0) {
                System.out.print("You lose");
                break;
            }
            int gues;
            Scanner input = new Scanner(System.in);
            gues = input.nextInt();
            if (gues > ran) {
                System.out.println("Lower");
                score -= 10;
            }
            else if (gues < ran) {
                System.out.println("Higher");
                score -= 10;
            }
            else {
                System.out.println("Correct!");
                System.out.print("Your score is " + score);
                break;
            }
        }
    }
}
