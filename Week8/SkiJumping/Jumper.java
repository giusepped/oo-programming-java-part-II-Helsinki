import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author giuseppedesantis
 */
public class Jumper implements Comparable<Jumper>{
    private String name;
    private int totalPoints;
    private List<Integer> jumps;

    
    public Jumper(String name){
        this.name = name;
        this.totalPoints = 0;
        this.jumps = new ArrayList<Integer>();
    }
    
    public void addPoints(int points){
        this.totalPoints += points;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addJump(int jump){
        this.jumps.add(jump);
    }
    
    @Override
    public int compareTo(Jumper jumper){
        return jumper.totalPoints - this.totalPoints;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.totalPoints + " points)";
    }
    
    public void printJumpLengths(){
        String formattedString = this.jumps.toString().replace("[", "").replace(",", " m,").replace("]", " m");
        System.out.print("            jump lengths: " + formattedString);
    }
}
