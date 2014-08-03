import java.util.Scanner;

/**
 *
 * @author giuseppedesantis
 */
public class Reader {
    private Scanner reader;
    
    public Reader(){
        this.reader = new Scanner(System.in);
    }
    
    public String readString(){
        String string = this.reader.nextLine();
        return string;
    }
    
    public int readInteger(){
        int input = Integer.parseInt(this.readString());
        return input;
    }
}
