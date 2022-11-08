public class Minion {
    private String name;
    private boolean minionStatus;
    private int minionPoints;

    public Minion(String name) {
        this.name = name;
        this.minionStatus = true;
        this.minionPoints = 1;
    }

    public String getName(){
        return this.name;
    }

    public int getMinionPoints(){
        return minionPoints;
    }

    public String evilLaugh(){
        return "Muahahaha";
    }

    public void printMinionStatus() {
        if (minionStatus) {
            System.out.println(name + " is a minion.");
            System.out.println(evilLaugh());
        } else {
            System.out.println(name + " is not a minion... anymore.");
        }
    }

    public void undoMinion() {
        minionStatus = false;
        minionPoints = 0;
        System.out.println(name + " is no longer a minion and has lost all minion privileges.");
    }

    public void makeMinion() {
        minionStatus = true;
        minionPoints = 1;
        System.out.println(name + " is now a minion.");
    }

    public void givePoints(int points) {
        if (minionStatus && points >= 0) {
            this.minionPoints += points;
        }
    }

    public void revokePoints(int points) {
        if (points > 0) {
            this.minionPoints -= points;
        } if (minionPoints < 1) {
            undoMinion();
        }
    }
}
