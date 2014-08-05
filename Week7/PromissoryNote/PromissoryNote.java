

/**
 *
 * @author giuseppedesantis
 */
public class PromissoryNote {
  private HashMap<String, double> loans;
  
  
  public PromissoryNote(){
    this.loans = new HashMap<String, double>();
  }
  
  public void setLoan(String toWhom, double value){
    this.loans.put(toWhom, value);
  }
  
  public double howMuchIsTheDebt(String whose){
    if(this.loans.containsKey(whose){
      return this.loans.get(whose);
    }
    
    return 0;
  }


}
