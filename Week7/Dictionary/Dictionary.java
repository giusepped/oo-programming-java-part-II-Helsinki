import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author giuseppedesantis
 */
public class Dictionary {
    private HashMap<String, String> dictionary;
    
    public Dictionary(){
        this.dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.dictionary.size();
    }
    
    public List<String> translationList(){
        List<String> translationList = new ArrayList<String>();
        for(String key : this.dictionary.keySet()){
            String translation = key + " = " + this.translate(key);
            translationList.add(translation);
        }
        return translationList;
    }
    
}
