
/** @author alfi
*   @since 06.10.20
*   @version Don't make me cry
*/
import java.util.List;
import java.util.ArrayList;

public class Pizza extends Food {

    protected List<String> toppings;
    public Pizza() {
        super("Pizza", 45);
        toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        {
            toppings.add(topping);
            price += 10;
        }

    }

    @Override
    public void display() {
        String top = toppings.toString();
       System.out.println(price + " kr " + name + " " + ("{" + top.replace('[',' ').replace(']',' ') + "}"));

    }

    public void setName(String name) {
        super.name = name;
    }
}
