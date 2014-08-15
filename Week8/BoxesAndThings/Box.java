import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author giuseppedesantis
 */

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> things;
    private double maximumWeight;
    
    public Box(double maximumWeight){
        this.maximumWeight = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored t){
        if(this.weight() + t.weight() < maximumWeight){
            this.things.add(t);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored t : this.things){
            weight += t.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";
    }
}
