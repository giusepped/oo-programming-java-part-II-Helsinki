
/**
 *
 * @author giuseppedesantis
 */

import java.util.Scanner;
import java.io.File;

public class Printer {
    private File textFile;
    private Scanner reader;
    
    public Printer(String fileName) throws Exception{
        this.textFile = new File(fileName);
        this.reader = new Scanner(this.textFile, "UTF-8");
    }
    
    public void printLinesWhichContain(String word){
        if(word == ""){
            System.out.println(this.textFile);
        }else{
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                if(line.contains(word)){
                    System.out.println();
                }
            }
        }
    }
    
}
