
/**
 *
 * @author giuseppedesantis
 */

public class MilitaryService implements NationalService{
    private int daysLeft;
  
  public MilitaryService(int daysLeft){
    this.daysLeft = daysLeft;
    }
  
  public int getDaysLeft(){
    return this.daysLeft;
    }
  
  public void work(){
    if(this.daysLeft >= 1){
      this.daysLeft--;
      }
    }
}
