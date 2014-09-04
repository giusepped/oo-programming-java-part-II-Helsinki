
package dungeon;

/**
 *
 * @author giuseppedesantis
 */

import java.util.ArrayList;

public abstract class Character {
    
    String name;
    int length;
    int heigth;
    int x;
    int y;
    
    public Character(String name, int length, int heigth){
        this.name = name;
        this.length = length;
        this.heigth = heigth;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void move(ArrayList<String> moves){
    }
    
    public void move(int moves, boolean vampireMoves){ 
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.x + " " + this.y;
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        Character compared = (Character) object;
        if(this.x == compared.x && this.y == compared.y){
            return true;
        }else{
            return false;
        }
    }
}
