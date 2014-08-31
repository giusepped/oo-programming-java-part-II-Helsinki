
package farmsimulator;

/**
 *
 * @author giuseppedesantis
 */

import java.util.LinkedList;

public class Farm {
    private String owner;
    private CowHouse cowHouse;
    private LinkedList<Cow> cowList;
    
    public Farm(String owner, CowHouse cowHouse){
        this.owner = owner;
        this.cowHouse = cowHouse;
        this.cowList = new LinkedList<Cow>();
    }
    
    @Override
    public String toString(){
        return "Farm owner: " + this.owner + 
                "\nCowhouse bulk tank: " + this.cowHouse +
                "\n" + this.cowListString();
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void addCow(Cow cow){
        this.cowList.add(cow);
    }
    
    public String cowListString(){
        if(this.cowList.isEmpty()){
            return "No cows.";
        }else{
            String cowListString = "Animals:";
            for(Cow c : this.cowList){
                cowListString += "\n        " + c.toString();
            }
            return cowListString;
        }
    }
    
    public void liveHour(){
        for(Cow c : this.cowList){
            c.liveHour();
        }
    }
    
    public void manageCows(){
        this.cowHouse.takeCareOf(this.cowList);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.cowHouse.installMilkingRobot(milkingRobot);
    }
}
