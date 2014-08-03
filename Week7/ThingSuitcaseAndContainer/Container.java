import java.util.ArrayList;

/**
 *
 * @author giuseppedesantis
 */
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((suitcase.totalWeight() + this.totalWeight()) <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Suitcase s : this.suitcases){
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }
    
    public String toString(){
        int numberOfSuitcases = 0;
        for(Suitcase s : this.suitcases){
            numberOfSuitcases++;
        }
        return numberOfSuitcases + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printThings(){
        for(Suitcase s : this.suitcases){
            s.printThings();
        }
    }
    
}
