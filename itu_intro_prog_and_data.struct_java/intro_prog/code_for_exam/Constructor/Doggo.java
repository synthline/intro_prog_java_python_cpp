public class Doggo {

    private final String name;
    private boolean goodBoi;

    public Doggo(String name) {
        this.name = name;
        this.goodBoi = false;
    }

    public String getName() {
        return name;
    }

    public void makeBark() {
        System.out.println(name + " said: Woof woof");
    }

    public void makeGoodBoi() {
        goodBoi = true;
    }

    public boolean isGoodBoi() {
        return goodBoi;
    }

    public void whosAGoodBoi() {
        if (goodBoi) {
            System.out.println(name + " is such a goood boii");
        } else {
            System.out.println(name + " is not a good boi :(");
        }

    }
}