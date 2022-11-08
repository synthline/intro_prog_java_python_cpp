import java.util.ArrayList;


public class Forest {
        

    private final ArrayList<Tree> trees;

public Forest()
{

    this.trees = new ArrayList<Tree>();
}


public void addTree(double growthPct)
{
    trees.add(new Tree(growthPct));
}

public String toString()
{
  String forito = "Forest(";
    
    for(Tree tree : trees) 
    {
    forito = forito + tree.toString();
    }
    return forito + ")";
}





// public void growOneYear()
// {
//     for(Tree tree : trees) {
//        tree.growOneYear();
//     }

// }
    
}


