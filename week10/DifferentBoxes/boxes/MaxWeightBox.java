
package boxes;

/**
 *
 * @author giuseppedesantis
 */

import java.util.Collection;
import java.util.LinkedList;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private int currentWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.things = new LinkedList<Thing>();
    }
    
    @Override
    public void add(Thing thing){
        if(thing.getWeight() + this.currentWeight <= this.maxWeight){
            this.things.add(thing);
            this.currentWeight += thing.getWeight();
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
