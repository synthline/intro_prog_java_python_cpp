import java.util.*;

public class ShoppingBasket {
    private SaleItem item;
    private int numberOfItems;
    private List<SaleItem> listOfItems;

    public ShoppingBasket() {

    }
    public void addItem(SaleItem item) {
listOfItems.add(item);
    }


    public void addItem(SaleItem item,int numberOfItems) {
for (int i = 0 ; i<= numberOfItems ; i++)
{
    listOfItems.add(item);
}
    }

    public int total() {
        return sum;
    }

    public boolean checkStock() {

    }

    public final void finalizePurchase() {

    }

    public void printReceipt() {

    }
}
