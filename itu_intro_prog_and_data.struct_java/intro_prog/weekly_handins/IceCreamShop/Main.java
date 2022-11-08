public class Main {
public static void main(String[] args) {
    
IceCreamShop ice = new IceCreamShop("ice1");
IceCreamShop ice2 = new IceCreamShop("ice2");
IceCreamShop ice3 = new IceCreamShop("ice3");

ice.addFlavours("Vanilla");
ice2.addFlavours("Vanilla");
ice2.addFlavours("Choco");
ice3.addFlavours("Berry");
ice3.addFlavours("Choco");


Shops s1 = new Shops();

s1.addShop(ice);
s1.addShop(ice2);
s1.addShop(ice3);

s1.amountOfShops();

System.out.println(s1.amountOfShops());

}
}
