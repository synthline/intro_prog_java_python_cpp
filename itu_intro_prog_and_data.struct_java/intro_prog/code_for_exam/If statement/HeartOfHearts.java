import java.util.Scanner;

public class HeartOfHearts {
    private static final String W = "♡";
    private static final String B = "♥";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("♥♡♥");
            System.out.println("♡♥♡");
        } else {
            topHalf(n);
            bottomPart(n);
        }
    }

    public static void topHalf(int n) {
        int whiteHeart1 = n-1;
        int blackHeart1 = n;
        int whiteHeart2 = n;
        for (int line = 1; line < n; line++) {
            for (int i = 0; i < whiteHeart1; i++) {
                System.out.print(W);
            }
            int bH1 = whiteHeart2 >= 0 ? blackHeart1 : blackHeart1 + whiteHeart2;
            for (int i = 0; i < bH1; i++) {
                System.out.print(B);
            }
            for (int i = 0; i < whiteHeart2; i++) {
                System.out.print(W);
            }
            for (int i = 0; i < blackHeart1; i++) {
                System.out.print(B);
            }
            for (int i = 0; i < whiteHeart1; i++) {
                System.out.print(W);
            }
            System.out.println();
            whiteHeart1--;
            blackHeart1 += 2;
            whiteHeart2 -= 2;
        }
    }


    public static void bottomPart(int n) {
        int whiteHeart1 = 0;
        for (int blackHeart = 5 * n - 2; blackHeart >= 1; blackHeart -= 2) {
            for (int i = 0; i < whiteHeart1; i++) {
                System.out.print(W);
            }
            for (int i = 0; i < blackHeart; i++) {
                System.out.print(B);
            }
            for (int i = 0; i < whiteHeart1; i++) {
                System.out.print(W);
            }
            System.out.println();
            whiteHeart1++;
        }
    }
}
