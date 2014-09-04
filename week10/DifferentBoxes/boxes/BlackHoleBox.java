
package boxes;

/**
 *
 * @author giuseppedesantis
 */

import java.util.Collection;
import java.util.LinkedList;

public class BlackHoleBox extends Box{
    private Collection<Thing> things;
    
    public BlackHoleBox(){
        this.things = new LinkedList<Thing>();
    }
    
    public void add(Thing thing){
        this.things.add(thing);
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        return false;
    }
}
