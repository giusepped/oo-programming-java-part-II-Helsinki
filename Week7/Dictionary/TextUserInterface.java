import java.util.Scanner;

/**
 *
 * @author giuseppedesantis
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statements:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface");
        System.out.println();
        while(true){
            System.out.println("Statament:");
            String command = this.reader.nextLine();
            if(command.equals("quit")){
                System.out.println("Cheers");
                break;
            }
            else if(command.endsWith("add")){
                System.out.println("In Finnish: ");
                String word = this.reader.nextLine();
                System.out.println("Translation: ");
                String translation = this.reader.nextLine();
                this.dictionary.add(word, translation);
                System.out.println();
            }else if(command.equals("translate")){
                System.out.println("Give a word: ");
                String word = this.reader.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(word));
                System.out.println();
            }else{
                System.out.println("Unknown statement");
            }
        }
    }
}
