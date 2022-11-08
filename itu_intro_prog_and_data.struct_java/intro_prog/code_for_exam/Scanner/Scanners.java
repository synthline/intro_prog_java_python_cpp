import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }
}
