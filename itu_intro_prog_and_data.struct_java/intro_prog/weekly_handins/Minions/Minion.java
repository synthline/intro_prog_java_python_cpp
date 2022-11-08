public class Minion
{

private String name;
private boolean minionStatus;
private int minionPoints;

public Minion(String name)
{
    this.name = name;
    this.minionStatus = true;
    this.minionPoints = 1;
}

public String getName()
{
    return name;
}

public int getMinionPoints()
{
    return minionPoints;
}

public String evilLaugh()
{
    return "Muahahaha";
}

public void printMinionStatus()
{
    if( minionStatus == true ) {
        System.out.println( getName() + " is a minion.");
        System.out.println(evilLaugh()); 
    }   else {
        System.out.println( getName() + " is not a minion... anymore.");
    }
}

public void undoMinion()
{
    minionStatus = false;
    this.minionPoints = 0;
    System.out.println( getName() + " is no longer a minion and has lost all minion privileges.");
}

public void makeMinion()
{
    minionStatus = true;
    minionPoints = 1;
    System.out.println(getName() + " is now a minion.");
}

public void givePoints(int pointers)
{
    if (pointers > 0 && minionStatus == true) {
        this.minionPoints = this.minionPoints + pointers;
    }       
}

public void revokePoints (int pointers)
{
    if (pointers > 0) {
        minionPoints = minionPoints - pointers;
        if ( minionPoints < 0)  {
            undoMinion();
        }
        
     }
    
        
     }
}

