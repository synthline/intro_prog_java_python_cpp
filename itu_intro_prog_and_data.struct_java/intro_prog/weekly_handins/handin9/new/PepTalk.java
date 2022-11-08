import java.util.regex.*; 
import java.util.ArrayList; 
import java.util.List;  

public class PepTalk{

    private List<String> input; 
    private List<String> output; 

    public PepTalk(){
        input = new ArrayList<>(); 
        output = new ArrayList<>(); 
    }; 

    public void addInput(List<String> input){
        this.input = input; 
    }

    public void translate(){
        for (String word : input){
            translateWord(word); 
        }
    }

    public List<String> getOutput(){
        return output; 
    }
    
    private void translateWord(String word){
        List<String> syllables = splitIntoSyllables(word); 
        String translation = generatePepWord(syllables); 
        output.add(translation); 
    }

    private List<String> splitIntoSyllables(String word){
        List<String> syllables = new ArrayList<String>(); 
        syllables = divideWord(word); 
        for (int i = 1; i < syllables.size(); i++){

            String previousSyllable = syllables.get(i-1);
            String currentSyllable =  syllables.get(i); 

            String consonantCluster = findConsonantCluster(currentSyllable); 

            int previousEnding = consonantCluster.length()/2; 

            String previousCluster = consonantCluster.substring(0, previousEnding); 
            previousSyllable += previousCluster; 
            currentSyllable = currentSyllable.substring(previousEnding); 
            syllables.set(i-1, previousSyllable); 
            syllables.set(i, currentSyllable);
        }
        return syllables; 
    }

    private String findConsonantCluster(String wordPart){
        Pattern p = Pattern.compile("[aeiouAEIOU]+");
        Matcher m = p.matcher(wordPart); 
        m.find(); 
        return "" + wordPart.substring(0, m.start()); 
    }

    private List<String> divideWord(String word){
        List<String> wordParts = new ArrayList<String>();
        Pattern p = Pattern.compile("[^aeiouAEIOU\\d\\W]*[aeiouAEIOU]");
        Matcher m = p.matcher(word); 
       // boolean b = m.matches(); 
       int end = 0; 
       while(m.find()){
           end = m.end(); 
           wordParts.add(word.substring(m.start(), end)); 
       }

       if (end < word.length() && wordParts.size() > 0){
           String lastWord = wordParts.get(wordParts.size()-1) + word.substring(end, word.length()); 
           wordParts.set(wordParts.size()-1, lastWord); 
       }

       if (wordParts.size() == 0){
           wordParts.add(word); 
       }

        return wordParts; 
    }

    private String generatePepWord(List<String> syllables){
        String word = ""; 
        for (String elem : syllables){
            word += elem + "p"; 
            String consonantCluster = findConsonantCluster(elem); 
            int clusterLength = consonantCluster.length();
            if (clusterLength > 0){
                word += elem.substring(clusterLength).toLowerCase();  
            }
            else{
                word +=  elem.toLowerCase();
            }
        }
        return word; 
    }

}