
package boxes;

/**
 *
 * @author giuseppedesantis
 */

import java.util.Collection;
import java.util.LinkedList;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new LinkedList<Thing>();
    }
    
    @Override
    public void add(Thing thing){
        int currentWeight = 0;
        for(Thing t : this.things){
            currentWeight += t.getWeight();
        }
        if(thing.getWeight() + currentWeight <= this.maxWeight){
           this.things.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        for(Thing t : this.things){
            if(t.equals(thing)){
                return true;
            }
        }
        return false;
    }
}
