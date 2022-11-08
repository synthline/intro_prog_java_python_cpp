import java.util.Scanner;

public class TwoStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String alice = "Alice";
        String bob = "Bob";
        String currentPlayer = alice;

        while (n > 1) {
            n -= 2;
            if (currentPlayer == alice) {
                currentPlayer = bob;
            } else {
                currentPlayer = alice;
            }
        }
        if (n % 2 == 1) {
            System.out.println(alice);
        } else {
            System.out.println(bob);
        }
    }
}

