public class myClass {

    public static int a = 42;
    public int b = 142;

    public myClass(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public static void main(String[] args) {

        myClass x = new myClass();
        myClass y = new myClass();

        x.a += 1;

    }
}