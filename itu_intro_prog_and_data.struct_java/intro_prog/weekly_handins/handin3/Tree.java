public class Tree
{
    private int age;
    private double height;
    private double growthPct;

    public void Tree(double growthPct);
    
    

}

/* 
Create a public method growOneYear(), which increases the age by one,
 and increases the height of the tree according to the formula height * (1 + growthPct / 100).

Modify the growOneYear() method such that a tree will stop growing once it reaches a height of 20 meters.

Create a class Forest

Add a private field trees that stores a List of Tree

Create a constructor for the class Forest(). The constructor must initialize the List.

Create a public addTree(int growthPct) that adds a Tree to the List.

Create a public toString() method that returns a String with the format: "Forest(Tree(age = 1, height = 0.25)Tree(age = 1, height = 0.25)Tree(age = 1, height = 0.25))", where the data reflects the actual state of each tree.

Create a growOneYear() method that causes all the trees in the forrest to grow by one year. */ */