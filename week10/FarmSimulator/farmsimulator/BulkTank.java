
package farmsimulator;

/**
 *
 * @author giuseppedesantis
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
}
