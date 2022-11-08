
/** @author alfi
*   @since 06.10.20
*   @version Don't make me cry
*/

import java.util.List;
import java.util.ArrayList;

public class Order {

    protected List<Food> ordered;

    public Order() {
        ordered = new ArrayList<>();

    }

    public void addFood(Food food) { // has to be a Food Type

        ordered.add(food);

    }

    public int total() {

        int foodPrice = 0;

        for (Food food : ordered) {
            food.getPrice();
            foodPrice += food.getPrice();
        }
        return foodPrice;
    }

    public void display() {
        for (Food food : ordered) {
            food.display();
        }
        System.out.println(total() + " kr TOTAL");
    }

    public boolean payWith(CreditCard card) {

        if (card.withdraw(total())) {
            return true;
        }
        System.out.println("ERROR: Payment failed");
        return false;
    }

}
