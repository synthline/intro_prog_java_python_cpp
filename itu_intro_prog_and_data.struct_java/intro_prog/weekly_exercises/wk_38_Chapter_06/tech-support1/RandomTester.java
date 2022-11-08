import java.util.*;

public class RandomTester {
    
    private Random randomGenerator;

    public RandomTester()
    {
    randomGenerator = new Random();
    int index = randomGenerator.nextInt(6);
    if (index > 1)
        {
         System.out.println(index);
        }
    }

    // exercise 6.20 

    public void sixMethod(int max)
    {
    randomGenerator = new Random();
    int index = randomGenerator.nextInt(max);
    if (index > 1)
     {
     System.out.println(index);
     }
    
    }
    







}
   







