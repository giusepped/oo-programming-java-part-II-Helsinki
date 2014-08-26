
package movable;

/**
 *
 * @author giuseppedesantis
 */

import java.util.List;
import java.util.ArrayList;

public class Group implements Movable{
    private List<Movable> movables;
    
    public Group(){
        this.movables = new ArrayList<Movable>();
    }
    
    @Override
    public String toString(){
        String listString = "";
        for(Movable m : this.movables){
            listString += m.toString() + "\n";
        }
        return listString;
    }

    
    public void addToGroup(Movable movable){
        this.movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable m : this.movables){
            m.move(dx, dy);
        }
    }
}
