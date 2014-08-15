import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author giuseppedesantis
 */

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> things;
    private double maximumWeight;
    
    public class Box(double maximumWeight){
        this.maximumWeight = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
    }
    
    public void addThing(ToBeStored thing){
        if(this.weight() + thing.weight() < maximumWeight){
            this.things.add(thing);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored thing : this.things){
            weight =+ thing;
        }
        return weight;
    }
    
    @Override
    public void toString(){
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";
    }
}
