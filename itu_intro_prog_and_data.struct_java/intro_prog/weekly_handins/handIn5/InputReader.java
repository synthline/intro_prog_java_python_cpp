import java.util.Scanner;
import java.util.ArrayList;

public class InputReader {
   
    private Scanner reader;

    public InputReader()
    {
        this.reader = new Scanner(System.in);
    }

    public ArrayList<String> getInput()
    {
        System.out.println("Welcome to this amazing Christmas song generator :)");
        System.out.println("All you have to do is insert 3 keywords. The quantity of desired beverage, the type of desired container");
        System.out.println("and the type of beverage of course. Have fun. Ho Ho Ho!");
        System.out.println("> ");
        String inputLine = reader.nextLine().trim().toLowerCase();

        String[] wordArray = inputLine.split(" ");

        ArrayList<String> words = new ArrayList<>();
        for (String word : wordArray)
        {
            words.add(word);
        }
        return words;
    }

}
