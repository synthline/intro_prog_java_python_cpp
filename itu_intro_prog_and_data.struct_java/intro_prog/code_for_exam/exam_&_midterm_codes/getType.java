import java.util.ArrayList;
import java.util.List;

public class getType{
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("Hello");
        a.add("World!");
        System.out.println(a.iterator().next().getClass().getSimpleName()); 
    }
}



