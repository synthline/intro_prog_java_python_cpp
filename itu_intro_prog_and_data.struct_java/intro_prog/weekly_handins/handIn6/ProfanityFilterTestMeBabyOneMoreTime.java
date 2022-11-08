/** @author alfi
*   @since 28.11.20
*   @version Don't make me cry
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;



public class ProfanityFilterTestMeBabyOneMoreTime
 {
    
    public static void main(final String[] args)
  {
    HashMap<String, String> filterMap = new HashMap<>();



     var scan = new Scanner(System.in);
     var M = scan.nextLine().toLowerCase();
     
      String[] cussingWords = M.split(" ");

      String replacementModel = "*&#$%";

      String[] filteredWords = new String[cussingWords.length];
      
      for (int i = 0 ;  i < cussingWords.length ; i++)
     {
        filteredWords[i] = "";
        {
          int k = 0;
          for ( int j = 0 ; j < cussingWords[i].length() ; j++)
          { 
          if (  k >= 5)
          {
          k= 0;
          }
          filteredWords[i] += replacementModel.charAt(k);
          k++;
          }
        }
      } 

    for (int l = 0 ; l < cussingWords.length ; l++)
      {
      filterMap.put(cussingWords[l], filteredWords[l]);
      }

           /* System.out.println(filterMap);   */


      while ( scan.hasNext())
      {
        var N = scan.nextLine();
      
        var O = N.toLowerCase();
        String[] sentence = N.split("\\b");
        String [] lowerCaseSentence = O.split("\\b");
        ArrayList<String> tempSentenceArray = new ArrayList<>();
        ArrayList<String> sentenceArray = new ArrayList<>();
      
        for (String lowerCaseWords : lowerCaseSentence) // POPULATES THE MIRROR-VERSION OF SentenceArray ArrayList, BUT WITH LOWER CASES. 
        {
          tempSentenceArray.add(lowerCaseWords);
        }

        for (String word : sentence) // POPULATES THE ARRAY WITH WORD TO CENSOR.
        {
            sentenceArray.add(word);
        }

        /* System.out.println(sentenceArray.size()); */
      

        for (String lowerCaseWords : tempSentenceArray)
        {
            for (String keyString : filterMap.keySet())
            {
                if (lowerCaseWords.equals(keyString))
                { 
                sentenceArray.add(sentenceArray.indexOf(lowerCaseWords), filterMap.get(keyString)); // issues here WITH LOWERCLASSES I THINK
                sentenceArray.remove(sentenceArray.indexOf(lowerCaseWords));    
                }
            }

        }
        System.out.println(String.join(" ", sentenceArray));















      }
  }
 }