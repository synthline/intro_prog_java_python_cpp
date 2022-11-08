public class Main {

    public static void main(String[] args) {

        Food burger = new Food("Burger", 56);
        Food wrap = new Food("Wrapper", 100);
        Food pasta = new Food("Pastalicious", 10000);


        Pizza f1 = new Pizza();

        f1.addTopping("xtra");

        f1.addTopping("bananas");

        f1.addTopping("water");

        f1.setName("Habidi");
        
        Order order1 = new Order();

        order1.addFood(burger);
        order1.addFood(f1);
        order1.addFood(wrap);
        order1.addFood(pasta);

    
        order1.display();
    }
}
