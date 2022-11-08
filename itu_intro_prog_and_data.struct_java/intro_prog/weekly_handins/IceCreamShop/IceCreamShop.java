import java.util.*;

public class IceCreamShop {

    public String shopName;
    public ArrayList<String> variants;

    public IceCreamShop(String shopName) {
        this.shopName = shopName;
        this.variants = new ArrayList<>();
    }

    public String getName() {
        return shopName;
    }

    public ArrayList<String> getVariants() {
        return variants;
    }

    public void addFlavours(String flavour) {
        if (!variants.contains(flavour)) {
            variants.add(flavour);
        }

    }

    public void removeFlavours(String flavour) {
        if (variants.contains(flavour)) {
            variants.remove(flavour);
        }
    }

    public int amountOfVariants() {
        return variants.size();
    }

    public void printFlavours() {
        System.out.println(getName() + " has " + amountOfVariants() + " different flavours:");
        for (String flavour : variants) {
            System.out.println(flavour);
        }

    }
}