import java.util.*;

public class DrinkSongGen {
    
public static void main(String[] args) {
    
    var reader = new Scanner(System.in);
    var N = reader.nextLine().trim().toLowerCase();
    reader.close();

     String[] wordArray = N.split(" ");

     ArrayList<String> words = new ArrayList<>();
        for (String word : wordArray)
        {
            words.add(word);
        }
    
        int i = Integer.parseInt(wordArray[0]);

        while (i != 1 && i !=2)     
        {
            System.out.print( i + " " + wordArray[1] + " " + wordArray[2] + " " + wordArray[3] + " on the wall");
            System.out.println();
            System.out.print( i  + " " + wordArray[1] + " " + wordArray[2] + " " + wordArray[3]);
            System.out.println();
            System.out.println("Take one down, pass it around");
            System.out.println( i - 1 + " "+ wordArray[1] + " " + wordArray[2] + " " + wordArray[3] + " on the wall");
            System.out.println(); 
        
            --i;
        }
            if(i == 2)
            {
                System.out.print( i + " " + wordArray[1] + " " + wordArray[2] + " " + wordArray[3] + " on the wall");
                System.out.println();
                System.out.print( i  +" "+ wordArray[1] + " " + wordArray[2] + " " + wordArray[3]);
                System.out.println();
                System.out.println("Take one down, pass it around");
                System.out.println( "One "+ wordArray[1].replace("s"," ")+ " " + wordArray[2] + " " + wordArray[3] + " on the wall");
                System.out.println(); 

            } 
            
            System.out.println("One "   + wordArray[1].replace("s"," ") + " " + wordArray[2] + " " + wordArray[3] + " on the wall");   
            System.out.println("One "   + wordArray[1].replace("s"," ") + " " + wordArray[2] + " " + wordArray[3]);
            System.out.println("Take one down, pass it around");
            System.out.println("No more " + wordArray[1] + " " + wordArray[2] + " " + wordArray[3] + " on the wall");
            
        
            if(i == 1)
            {
            System.out.println("One "   + wordArray[1].replace("s"," ") + " " + wordArray[2] + " " + wordArray[3] + " on the wall");   
            System.out.println("One "   + wordArray[1].replace("s"," ") + " " + wordArray[2] + " " + wordArray[3]);
            System.out.println("Take one down, pass it around");
            System.out.println("No more " + wordArray[1] + " " + wordArray[2] + " " + wordArray[3] + " on the wall");
            }


    }

}