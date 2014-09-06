
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        ArrayList<String> readFile = new ArrayList<String>();
        Scanner reader = new Scanner(new File(file));
        
        while(reader.hasNextLine()){
            readFile.add(reader.nextLine());
        }
        return readFile;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for(String line : texts){
            writer.write(line);
            writer.write("\n");
        }
        writer.close();
    }
}
