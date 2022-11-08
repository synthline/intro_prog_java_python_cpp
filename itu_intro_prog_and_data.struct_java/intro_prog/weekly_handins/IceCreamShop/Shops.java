import java.util.ArrayList;

public class Shops {
    private ArrayList<IceCreamShop> shopsArray;

    public Shops() {
        this.shopsArray = new ArrayList<>();
    }

    public void getIceCreamShops() {
        // return ArrayList(IceCreamShops) shopsArray;
        shopsArray.toString();
    }

    public void addShop(IceCreamShop favShopNames) {
        if (!shopsArray.contains(favShopNames)) {
            shopsArray.add(favShopNames);
        }
    }

    public void removeShop(IceCreamShop favShopNames) {
        if (shopsArray.contains(favShopNames)) {
            shopsArray.remove(favShopNames);
        }
    }

    public int amountOfShops() {
        return shopsArray.size();
    }

    public ArrayList<IceCreamShop> shopsWithFlavour(IceCreamShop favFlavour) {
        ArrayList<IceCreamShop> flavourList = new ArrayList<>();
        for (IceCreamShop favShopNames : shopsArray) {
            if (favShopNames.contains(favFlavour)) {
                flavourList.add(favShopNames);
            }
        }
        return flavourList;


        // HashMap here me tinks
       // :p

    }

    public void printShops(String favFlavour) {
        for (IceCreamShop favShopNames : shopsArray) {
            if (!shopsArray.contains(favFlavour)) {
                System.out.println("Oh no, there are no shops with the " + favFlavour + " variant");
            } else {
                System.out.println("These are the shops that have the " + favFlavour + " variant:");
              //  System.out.println(Iterator<flavourList>.iterate());
            }
        }
    }


    // public void printShops(String favFlavour) {
    //     for (IceCreamShop favShopNames : shopsArray) {
    //         if (!shopsArray.contains(favFlavour)) {
    //             System.out.println("Oh no, there are no shops with the " + favFlavour + " variant");
    //         } else {
    //             System.out.println("These are the shops that have the " + favFlavour + " variant:");
    //             System.out.println(Iterator<flavourList>.iterate());
    //         }
    //     }
    // }

}
