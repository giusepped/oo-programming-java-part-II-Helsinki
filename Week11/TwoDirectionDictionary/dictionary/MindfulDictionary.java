
package dictionary;

/**
 *
 * @author giuseppedesantis
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MindfulDictionary {
    private HashMap<String, String> dictionaryFromLangA;
    private HashMap<String, String> dictionaryFromLangB;
    private Scanner reader;
    private FileWriter writer;
    
    public MindfulDictionary(){
        this.dictionaryFromLangA = new HashMap<String, String>();
        this.dictionaryFromLangB = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) throws FileNotFoundException, IOException{
        this.dictionaryFromLangA = new HashMap<String, String>();
        this.dictionaryFromLangB = new HashMap<String, String>();
        File fileToRead = new File(file);
        try{
            this.reader = new Scanner(fileToRead);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
    
    public boolean load(){
        if(!this.reader.hasNextLine()){
            return false;
        }else{
            while(this.reader.hasNextLine()){
                String line = reader.nextLine();
                String [] parts = line.split(":");
                this.dictionaryFromLangA.put(parts[0], parts[1]);
                this.dictionaryFromLangB.put(parts[1], parts[0]);
            }
            return true;
        }
    }
    
    public boolean save() throws IOException{
        if(this.dictionaryFromLangA.isEmpty()){
            return false;
        }
        for(String a : this.dictionaryFromLangA.keySet()){
            String line = a + ":" +getKeyByValue(this.dictionaryFromLangA, a);
            this.writer.write(line);
        }
        this.writer.close();
        return true;
    }
    
    public void add(String word, String translation){
        if(!this.dictionaryFromLangA.containsKey(word) && !this.dictionaryFromLangB.containsKey(translation)){
            this.dictionaryFromLangA.put(word, translation);
            this.dictionaryFromLangB.put(translation, word);
        }
    }
    
    public String translate(String word){
        if(this.dictionaryFromLangA.containsKey(word)){
            return this.dictionaryFromLangA.get(word);
        }else if(this.dictionaryFromLangB.containsKey(word)){
            return this.dictionaryFromLangB.get(word);
        }else{
            return null;
        }
    }
    
    public void remove(String word){
        if(this.dictionaryFromLangA.containsKey(word)){
            this.dictionaryFromLangA.remove(word);
            String key = getKeyByValue(this.dictionaryFromLangB, word);
            this.dictionaryFromLangB.remove(key);
        }else if(this.dictionaryFromLangB.containsKey(word)){
            this.dictionaryFromLangB.remove(word);
            String key = getKeyByValue(this.dictionaryFromLangB, word);
            this.dictionaryFromLangA.remove(key);
        }
    }
    
    public <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
