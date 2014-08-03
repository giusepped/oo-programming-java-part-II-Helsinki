import java.util.ArrayList;

/**
 *
 * @author giuseppedesantis
 */
public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing){
        if((thing.getWeight() + this.totalWeight()) <= this.maxWeight){
            this.things.add(thing);
        }
    }    
    
    public String toString(){
        int numberOfThings = 0;
        int totalWeight = 0;
        for(Thing t : this.things){
            numberOfThings++;
            totalWeight += t.getWeight();
        }
        if(numberOfThings == 0){
            return "empty (0 kg)";
        }
        else if(numberOfThings == 1){
            return numberOfThings + " thing (" + totalWeight + " kg)"; 
        }else{
            return numberOfThings + " things (" + totalWeight + " kg)";
        }
    }
    
    public void printThings(){
        for(Thing t : this.things){
            System.out.println(t);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Thing t : this.things){
            totalWeight += t.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        int heaviest = 0;
        Thing heaviestThing = new Thing("", 0);
        if(this.things.isEmpty()){
            return null;
        }else{
            for(Thing t : this.things){
                if(t.getWeight() > heaviest){
                    heaviest = t.getWeight();
                    heaviestThing = t;
                }
            }
            return heaviestThing;
        }

    }
}
