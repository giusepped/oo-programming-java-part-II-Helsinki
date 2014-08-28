
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
    
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount){
        if(amount <= this.howMuchFreeSpace()){
            this.volume += amount;
        }else{
            this.volume = this.capacity;
        }
    }
    
    public double takeFromTank(double amount){
        if(amount >= this.volume){
            this.volume = 0;
            return this.volume;
        }else{
            return this.volume - amount;
        }
    }
    
    @Override
    public String toString(){
        
    }
}
