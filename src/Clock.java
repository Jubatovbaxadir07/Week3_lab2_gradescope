import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Seconds: ");
            int sec = input.nextInt();
            for (int i = 0; i < sec+1; i++) {
                int hour = (i/3600)%24;
                int minutes = (i%3600)/60;
                int seconds = i%60;
                System.out.printf("%02d:%02d:%02d%n", hour, minutes, seconds);
            }
    }
}
