public class Triangle {

    public void printTriangle(int n) {
        if (n == 1) {
            System.out.println(1);
        } else if (n != 1) {

            int topHalf = n;
            for (int i = 1; i <= n; i++)
                System.out.print(i);
            System.out.println();
            topHalf = System.out.print(i);
            System.out.println(i - 1);
            System.out.println();
            topHalf--;
            // for (int i = 1; i <= n; i++)
            // System.out.print(i);
            // System.out.print(topHalf - 1);
        }

    }

    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.printTriangle(2);

    }

}