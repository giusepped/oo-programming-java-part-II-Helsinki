
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giuseppedesantis
 */
public class PromissoryNote {
    
    private HashMap<String, Double> loans;
  
  
    public PromissoryNote(){
        this.loans = new HashMap<String, Double>();
    }
  
    public void setLoan(String toWhom, double value){
        this.loans.put(toWhom, value);
    }
  
    public double howMuchIsTheDebt(String whose){
        if(this.loans.containsKey(whose)){
            return this.loans.get(whose);
        }
    
    return 0;
    }

}
