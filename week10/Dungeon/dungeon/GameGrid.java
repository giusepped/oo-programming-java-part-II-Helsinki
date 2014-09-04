
package dungeon;

/**
 *
 * @author giuseppedesantis
 */

import java.util.ArrayList;

public class GameGrid {
    private Characters characters;
    private ArrayList<String> gameGrid;
    
    public GameGrid(int length, int heigth, int Vampires){
        characters = new Characters(length, heigth, Vampires);
        ArrayList<Character> players = characters.returnCharacters();
        this.gameGrid = new ArrayList<String>();
        for(int x = 0; x < length; x++){
            ArrayList<Character> playersOnX = new ArrayList<Character>();
            for(Character c : players){
                if(c.getX() == x){
                    playersOnX.add(c);
                }
            }
            String line = "";
            for(int y = 0; y < length; y++){
                boolean containsPlayer = false;
                for(Character c : playersOnX){
                    if(y == c.getY()){
                        line += c.getName();
                        containsPlayer = true;
                    }
                }
                if(containsPlayer == false){
                    line += ".";
                }
            }
            gameGrid.add(line);
        }
    }
    
    public void printGameGrid(){
        this.characters.PrintCharacters();
        System.out.println();
        for(String g : this.gameGrid){
            System.out.println(g);
        }
    }
}
