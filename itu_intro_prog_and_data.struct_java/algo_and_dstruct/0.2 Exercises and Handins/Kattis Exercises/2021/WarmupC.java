import java.util.*;

public class WarmupC {
    
    public static void main(String[] args) {
        
        var scan = new Scanner(System.in);

        ArrayList<Integer> words = new ArrayList<>();
 
        var N = scan.nextLine().trim();
        String[] firstNumbers = N.split(" ");

        for (String word : firstNumbers)
        {
             words.add(Integer.parseInt(word));
        }

        var N2 = scan.nextLine().trim();
        String[] secondNumbers = N2.split(" ");

        scan.close();

        Integer[] A = new Integer[words.get(0)];

        for (int j = 0; j <= A.length - 1 ; j++ ) {
            A[j] = Integer.parseInt(secondNumbers[j]);
        }

        switch(words.get(1)) {

            case 1:
            System.out.println("7");
            break;

            case 2:
            if (A[0] > A[1]) {
                System.out.println("Bigger");;
            } else if (A[0] == A[1]) {
                System.out.println("Equal");
            } else {
                System.out.println("Smaller");
            }
            break;

            case 3:
            // if (A[0] > A[1] && A[1] > A[2]) {
            //     System.out.println(A[0]);
            // } else if (A[0] < A[1] && A[1] > A[2]) {
            //     System.out.println(A[1]);
            // } else if (A[0] < A[1] && A[1] < A[2]) {
            //     System.out.println(A[2]);
            // }
            if (A[0] > A[1]) 

            break;

            case 4:
            int sum = 0;
            for (int numbers : A) {
                sum = sum + numbers;
            }
            System.out.println(sum);
            break;

            case 5:
            int sum2 = 0;
            for (int numbers : A) {
                if (numbers % 2 == 0) { 
                sum2 = sum2 + numbers;
                }    
            }
            System.out.println(sum2);
            break;

            case 6:
            Integer[] B = new Integer[A.length];

            for (int k = 0 ; k < A.length ; k++) {
                if (A[k] < 26) {
                    B[k] =  A[k];    
                } else {
                B[k] =  A[k] % 26; 
                }
            }

            String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            HashMap<Integer, String> lMap = new HashMap<>();
            for (int i= 0; i < A.length; i++) {
                lMap.put(B[i],abc[B[i]]);
            }
            
            ArrayList<String> result = new ArrayList<String>();

            for (int j=0; j< A.length; j++) {
                result.add(lMap.get(B[j]));
            }

            System.out.println(result.toString().replace(",","").replace("[","").replace("]",""));
            break;

            case 7:
            int index = 0;
            
            if (index > A.length) {
                System.out.println("Out");
            } else if (index == A.length) {
                System.out.println("Done");
            } else if (index < A.length) {
                index = A[index++];
                if (A[index++] < A[index] ) {
                    System.out.println("Cyclic");
                break;
                }
            } 
            break;



        }

    }
}
