
package farmsimulator;

/**
 *
 * @author giuseppedesantis
 */

import java.util.Collection;

public class CowHouse {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public CowHouse(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.robot == null){
            throw new IllegalStateException("The milking robot hasn't been installed");
        }else{
            this.robot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.robot == null){
            throw new IllegalStateException("The milking robot hasn't been installed");
        }else{
            for(Cow c : cows){
                this.robot.milk(c);
            }
        }
    }
    
    @Override
    public String toString(){
        return this.tank.toString();
    }
}
