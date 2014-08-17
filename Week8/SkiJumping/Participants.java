import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author giuseppedesantis
 */
public class Participants {
    private List<Jumper> participants;
    private Random random = new Random();
    
    public Participants(){
        this.participants = new ArrayList<Jumper>();
    }
    
    public void add(Jumper jumper){
        this.participants.add(jumper);
    }
    
    public void play(){
        for(Jumper j : this.participants){
            int jumpLength = random.nextInt(120 - 60 + 1) + 60;
            j.addJump(jumpLength);
            List<Integer> evaluations = new ArrayList<Integer>();
            for( int i = 0; i < 5; i++){
                int eval = random.nextInt(20 - 10 + 1) + 10;
                evaluations.add(eval);   
            }
            System.out.println("  " + j.getName());
            System.out.println("    length: " + jumpLength);
            System.out.println("    judge votes: " + evaluations);
            Collections.sort(evaluations);
            evaluations.remove(0);
            evaluations.remove(evaluations.size() - 1);
            int sumOfEvaluations = 0;
            for(int i : evaluations){
                sumOfEvaluations = sumOfEvaluations + i;
            }
            int points = jumpLength + sumOfEvaluations;
            j.addPoints(points);
        }
    }
    
    public void print(){
        for(Jumper j : this.participants){
            System.out.println(j);
        }
    }
    
    public void printInOrder(){
        for(int i = 0; i < this.participants.size(); i++){
            int counter = i + 1;
            System.out.println("  " + counter + ". " + this.participants.get(i));
        }
    }
    
    public void printResults(){
        System.out.println("Position    Name");
        int counter = 1;
        for(Jumper j : this.participants){
            System.out.println(counter + "           " + j);
            j.printJumpLengths();
            counter++;
            System.out.println();
        }
    }
    
    public void sort(){
        Collections.sort(this.participants);
    }
    
    public void reverse(){
        Collections.reverse(this.participants);
    }
}
