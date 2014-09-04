
package dungeon;

/**
 *
 * @author giuseppedesantis
 */

import java.util.ArrayList;

public class Characters {
    private ArrayList<Character> characters;
    
    public Characters(int length, int heigth, int vampires){
        characters = new ArrayList<Character>();
        Player player = new Player("@", length, heigth);
        characters.add(player);
        for(int i = 0; i < vampires; i++){
            Vampire v = new Vampire("v", length, heigth);
            if(!characters.contains(v)){
                characters.add(v);
            }
        }
    }
    
    public void PrintCharacters(){
        for(Character c : characters){
            System.out.println(c);
        }
    }
    
    public ArrayList<Character> returnCharacters(){
        return characters;
    }
}
