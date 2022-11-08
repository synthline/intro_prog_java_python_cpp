import java.util.Scanner;
import java.util.ArrayList; 
import java.util.List;  

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        List<String> input = new ArrayList<>(); 
        while (sc.hasNext()){
            input.add(sc.next()); 
        }
        sc.close(); 

        PepTalk pep = new PepTalk();
        pep.addInput(input); 
        pep.translate(); 
        List<String> output = pep.getOutput(); 
        for (String elem : output){
            System.out.print(elem + " ");
        }
    }
}
