public class SaleItem {

    private String name, category;
    private int priceInCents, stock;

    public SaleItem(String name, String category, int priceInCents, int stock) {

        this.name = name;
        this.category = category;
        this.priceInCents = priceInCents;
        this.stock = stock;
    }

    public void setPrice(int price) {

        this.priceInCents = price;

    }

    public boolean checkStock(int count) {

        if (this.stock >= count) {
            return true;
        } else {
            return false;
        }

    }

    public void addToStock(int extra) {

        this.stock += extra;

    }
}
