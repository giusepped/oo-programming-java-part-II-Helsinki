
package file;

/**
 *
 * @author giuseppedesantis
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
    private List<String> lines;
    
    public Analysis(File file) throws Exception{
        Scanner reader = null;
        try{
            reader = new Scanner(file);
        }catch(Exception e){
            System.out.println("we could not find the file");
            return;
        }
        lines = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            lines.add(line);
        }
    }
    
    public int lines(){
        int numberOfLines = 0;
        for(String l : lines){
            numberOfLines++;
        }
        return numberOfLines;
    }
    
    public int characters(){
        int numberOfCharacters = 0;
        for(String l : lines){
            numberOfCharacters += l.length() + 1;
            
        }
        return numberOfCharacters;
    }
}
