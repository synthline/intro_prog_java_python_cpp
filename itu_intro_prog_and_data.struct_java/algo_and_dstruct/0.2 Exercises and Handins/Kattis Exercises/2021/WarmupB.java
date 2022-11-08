import java.util.*;

public class WarmupB {
 
    public static void main(String[] args) {
        
        var scan = new Scanner(System.in);
        // ArrayList<Integer> results = new ArrayList<>();  
        while(scan.hasNext()) {

            var N = scan.nextLine().trim();
            String[] numbers = N.split(" ");

            ArrayList<String> words = new ArrayList<>(); 
            for (String word : numbers)
            {
                words.add(word);
            }
            
        long i = Long.parseLong(numbers[0]);
        long j = Long.parseLong(numbers[1]);

        long result = j - i;
        System.out.println(Math.abs(result));

        // results.add(result);   
     }

    // for (Integer number : results)
    // {
    //     System.out.println(number);
    // }

    

    }
}