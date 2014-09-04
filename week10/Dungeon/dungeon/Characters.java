
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
        while(characters.size() <= vampires){
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
    
    public void moveAndRemoveCharacters(ArrayList<String> moves, boolean vampiresMove){
        ArrayList<Character> vampiresMoved = new ArrayList<Character>();
        Character player = new Player("", 0, 0);
        for(Character c : characters){
            if(c.getName().equals("@")){
                c.move(moves);
                player = c;
            }else{
                c.move(moves.size(), vampiresMove);
                if(!vampiresMoved.contains(c)){
                    vampiresMoved.add(c);
                }
                
            }
        }
        ArrayList<Character> toBeRemoved = new ArrayList<Character>();
        for(Character vamp : vampiresMoved){
            if(vamp.equals(player)){
                toBeRemoved.add(vamp);
            }
        }
        vampiresMoved.removeAll(toBeRemoved);
        characters.clear();
        characters.add(player);
        characters.addAll(vampiresMoved);
    }
}
