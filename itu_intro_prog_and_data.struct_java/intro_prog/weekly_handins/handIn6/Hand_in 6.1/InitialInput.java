/** @author alfi
*   @since 29.10.20
*/

import java.util.Scanner;
import java.util.ArrayList;

public class InitialInput
{
    private Scanner reader;

    public InitialInput()
    {
        this.reader = new Scanner(System.in);
        var N = reader.nextLine().trim().toLowerCase();
        reader.close();
        String[] wordArray = N.split(" ");

        ArrayList<String> words = new ArrayList<>();
        for (String word : wordArray)
        {
            words.add(word);
        }

        if ( 0 < wordArray.length )
        {
          for(int i = 0; i < wordArray[0].length(); i++) {    
            System.out.println(wordArray[0].length());   
                i++;    
        }    
        }


    }


    

}