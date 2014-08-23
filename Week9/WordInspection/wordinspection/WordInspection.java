
package wordinspection;

/**
 *
 * @author giuseppedesantis
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class WordInspection {
    private List<String> words;
    private final String vowels = "aeiouyäö";
    
    public WordInspection(File file) throws Exception{
        Scanner reader = null;
        try{
            reader = new Scanner(file, "UTF-8");
        }catch(Exception e){
            System.out.println("we could not find the file");
            return;
        }
        words = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            words.add(line);
        }
    }
    
    public int wordCount(){
        int wordCount = 0;
        for(String w : words){
            wordCount++;
        }
        return wordCount;
    }
    
    public List<String> wordsContainingZ(){
        List<String> wordsContainingZ = new ArrayList<String>();
        for(String w : words){
            if(w.contains("z")){
                wordsContainingZ.add(w);
            }
        }
        return wordsContainingZ;
    }
    
    public List<String> wordsEndingInL(){
        List<String> wordsEndingInL = new ArrayList<String>();
        for(String w : words){
            int lastIndex = w.length() - 1;
            if(w.substring(lastIndex).equals("l")){
                wordsEndingInL.add(w);
            }
        }
        return wordsEndingInL;
    }
    
    public List<String> palindromes(){
        List<String> palindromes = new ArrayList<String>();
        for(String word : words){
            if(word.equals(reverse(word))){
                palindromes.add(word);
            }
        }
        return palindromes;
    }
    
    private String reverse(String word){
        String reverse = "";
        int length = word.length() - 1;
        for(int i = length; i >= 0; i--){
            reverse += word.charAt(i);
        }
        return reverse;
    }
    
    public List<String> wordsWhichContainAllVowels(){
        List<String> returnedString = new ArrayList<String>();
        for(String word : words){
            if(containsAllVowels(word)){
                returnedString.add(word);
            }
        }
        return returnedString;
    }
    
    private boolean containsAllVowels(String word){
        for(char vowel : this.vowels.toCharArray()){
            if(!word.contains(""+vowel)){
                return false;
            }
        }
        return true;
    }

}
