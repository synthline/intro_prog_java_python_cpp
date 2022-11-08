import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Test {
    
    private Map<String, Integer> map;

    public Test() {
        this.map = new HashMap<>();
    }

        int maxWeight = 0; 

        Map<Integer, String> flipped;
    

    public String getKeysString() {

     
        for (String name : map.keySet()) {
            for ( Integer weight : map.values()) {
                flipped.put(weight, name);
            }
        }
        for (int weights : flipped.keySet()) {
            if ( weights == maxWeight) {
                return flipped.get(weights);
            }

        }
        
    }

    public static void main(String[] args) {
        
        DinoDatabase d1 = new DinoDatabase();

        d1.addDino("Alexitozo", 1000);


    }
}
