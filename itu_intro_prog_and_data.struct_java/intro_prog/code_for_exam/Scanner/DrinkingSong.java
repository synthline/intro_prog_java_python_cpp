import java.util.Scanner;

public class DrinkingSong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String container = sc.next();
        String of = sc.next();
        String drink = sc.next();

        String one = "One " + container.substring(0, container.length() - 1) + " " + of + " " + drink + " on the wall";
        String one1 = "One " + container.substring(0, container.length() - 1) + " " + of + " " + drink;
        if (n <= 2) {
            container2(container, of, drink, one, one1);
        } else {
            while (n > 2) {
                System.out.println(n + " " + container + " " + of +" " + drink + " on the wall");
                System.out.println(n + " " + container + " " + of +" " + drink);
                System.out.println("Take one down, pass it around");
                n = n - 1;
                System.out.println(n + " " + container + " " + of +" " + drink + " on the wall");
                System.out.println();

                if (n <= 2) {
                    container2(container, of, drink, one, one1);
                }
            }
        }
    }

    private static void container2(String container, String of, String drink, String one, String one1) {
        System.out.println("2 " + container + " " + of +" " + drink + " " + " on the wall");
        System.out.println("2 " + container + " " + of +" " + drink);
        System.out.println("Take one down, pass it around");
        System.out.println(one);
        System.out.println();
        System.out.println(one);
        System.out.println(one1);
        System.out.println("Take one down, pass it around");
        System.out.println("No more " + container + " " + of +" " + drink + " on the wall");
    }
}