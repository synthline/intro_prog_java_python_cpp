public class Doggo {
    
    private String name;
    private boolean goodBoi;

    public Doggo(String name)
    {
        this.name = name;
        this.goodBoi = false;
    }

    public String getName()
    {
        return name;
    }

    public void makeBark()
    {
    System.out.println(name + " said: Woof woof");
    }

    public void makeGoodBoi()
    {
        this.goodBoi = true;
    }


    public boolean isGoodBoi()
    {
        return goodBoi;
    }   



    public void whosAGoodBoi()
    {
        if ( goodBoi == true)    {
            System.out.println( getName() + " is such a goood boii");
        } else {
            System.out.println( getName()+ " is not a good boi :(");
        } 
            

    

    }


}