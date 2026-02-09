import java.util.Scanner;

public class HailStone {
    void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int n = input.nextInt();
        while (n != 1) {
            System.out.print(n + " -> ");
            if (n %2 == 0) n /= 2;
            else if (n%2 != 0) n = 3*n+1;
        }
        System.out.print(n);
    }
}
