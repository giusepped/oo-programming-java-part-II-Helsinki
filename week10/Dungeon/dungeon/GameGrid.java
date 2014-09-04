
package dungeon;

/**
 *
 * @author giuseppedesantis
 */

import java.util.ArrayList;

public class GameGrid {
    private Characters characters;
    private ArrayList<String> gameGrid;
    private int length;
    private int heigth;
    private boolean vampiresMove;
    
    public GameGrid(int length, int heigth, int Vampires, boolean vampiresMove){
        characters = new Characters(length, heigth, Vampires);
        this.gameGrid = new ArrayList<String>();
        this.length = length;
        this.heigth = heigth;
        this.vampiresMove = vampiresMove;
    }
    
    public void createGrid(){
        gameGrid.clear();
        ArrayList<Character> players = characters.returnCharacters();
        for(int y = 0; y < length; y++){
            ArrayList<Character> playersOnY = new ArrayList<Character>();
            for(Character c : players){
                if(c.getY() == y){
                    playersOnY.add(c);
                }
            }
            String line = "";
            for(int x = 0; x < length; x++){
                boolean containsPlayer = false;
                for(Character c : playersOnY){
                    if(x == c.getX()){
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
    
    public ArrayList<Character> returnCharacters(){
        return characters.returnCharacters();
    }
    
    public void printGameGrid(){
        System.out.println();
        this.characters.PrintCharacters();
        System.out.println();
        this.createGrid();
        for(String g : this.gameGrid){
            System.out.println(g);
        }
        System.out.println();
    }
    
    public void moveAndRemoveCharacters(ArrayList<String> moves){
        characters.moveAndRemoveCharacters(moves, vampiresMove);
    }
}
