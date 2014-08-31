
package farmsimulator;

/**
 *
 * @author giuseppedesantis
 */
public class MilkingRobot {
    private BulkTank bulkTank;
    
    public MilkingRobot(){
        
    }
    
    public BulkTank getBulkTank(){
        if(this.bulkTank == null){
            return null;
        }else{
            return this.bulkTank;
        }
    }
    
    void setBulkTank(BulkTank tank){
        this.bulkTank = tank;
    }
    
    void milk(Milkable milkable){
        if(this.getBulkTank() == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }else{
            this.bulkTank.addToTank(milkable.milk());
        }
    }
}
