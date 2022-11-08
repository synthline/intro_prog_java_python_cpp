import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responseList;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        this.randomGenerator = new Random();
        this.responseList = new ArrayList<>();
        fillResponses();
       // int index = randomGenerator.nextInt(101);
        //System.out.println(index);
    }

    public String generateResponse()
    {
        int index = randomGenerator.nextInt(responseList.size());
        return responseList.get(index);

    }

    private void fillResponses()
    {
        responseList.add("That sounds odd. Could you describe this in more detail?");
        responseList.add("robot don't know");
        responseList.add("English madafraka, do you speak it?");
        responseList.add("Bro, do you even code?");
        responseList.add("yes!");
        responseList.add("Habunga Dunga");
        responseList.add("I also like chocolate. This is not working at all is it?");
        responseList.add("I'm not a robot. Your mom's a robot!");
    }
    

    


}