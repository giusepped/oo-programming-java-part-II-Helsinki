
package dictionary;

/**
 *
 * @author giuseppedesantis
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> dict;
    
    public PersonalMultipleEntryDictionary(){
        this.dict = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry){
        if(!this.dict.containsKey(word)){
            this.dict.put(word, new HashSet<String>());
        }
        
        Set<String> translations = this.dict.get(word);
        translations.add(entry);
    }
    
    @Override
    public Set<String> translate(String word){
        Set<String> translations = this.dict.get(word);
        return translations;
    }
    
    @Override
    public void remove(String word){
        this.dict.remove(word);
    }
}
