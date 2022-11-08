/**
 * @author alfi
 * @since 06.10.20
 * @version Don't make me cry
 */

public class Food {
    protected int price;
    protected String name;

    public Food(String name, int price) {

        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println(price + " kr " + name);

    }

}
