import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class DinoDatabase {

    private Map<String, Integer> map;

    public DinoDatabase() {
        this.map = new HashMap<>();
    }

    public int entryNo() {
        return map.size();
    }

    public void addDino(String name, int weight) {

        if (!map.containsKey(name)) {
            map.put(name, weight);
            System.out.println(name + " added. Weight: " + weight + "kg");
        } else {
            System.out.println(name + " cannot be added. It is alrready in the database!");
        }
    }

    public void updateDino(String name, int newWeight) {

        if (map.containsKey(name)) {
            int weight = newWeight;
            map.replace(name, weight, newWeight);
            System.out.println(name + " updated. Weight " + newWeight + "kg");
        } else {
            System.out.println(name + " cannot be updated. It is not in the database!");
        }
    }

    public void removeDino(String name) {
        if (map.containsKey(name)) {
            map.remove(name);
            System.out.println(name + " removed");
        } else {
            System.out.println(name + " cannot be removed. It is not in the database!");
        }
    }

    public int getWeight(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            System.out.println(name + " cannot be found in the database!");
            return 0;
        }
    }

    public void getDinoNames() { // do it with java.util.set
        System.out.println(map.toString());
    }

    public int getHeaviest() {
        // heaviest dino
        
        // return empty string if no dino in database
      //  for(Set() s : map.keySet) intList.add(Integer.valueOf(s));
        //    return max(Integer.parseInt(map.keySet())); 
    }

    public static void main(String[] args) {

        DinoDatabase d1 = new DinoDatabase();

        d1.addDino("Alexitozo", 1000);

        d1.addDino("Alex", 2000);

        d1.addDino("Babarusous", 4000);

        d1.entryNo();

        d1.updateDino("Alex", 2500);

        d1.updateDino("buzuu", 48485);

        d1.removeDino("Alexitozo");

        d1.removeDino(" uzuukd");

        d1.getWeight("Alex");

        d1.getDinoNames();
    }
}