
package tools;

/**
 *
 * @author giuseppedesantis
 */

import java.util.Set;
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> entries;
    private int numberOfDuplicates;
    
    public PersonalDuplicateRemover(){
        this.numberOfDuplicates = 0;
        this.entries = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString){
        if(!entries.contains(characterString)){
            entries.add(characterString);
        }else{
            numberOfDuplicates++;
        }
    }
    
    @Override
    public int getNumberOfDetectedDuplicates(){
        return numberOfDuplicates;
    }
    
    @Override
    public Set<String> getUniqueCharacterStrings(){
        return entries;
    }
    
    @Override
    public void empty(){
        entries.clear();
        numberOfDuplicates = 0;
    }
}
