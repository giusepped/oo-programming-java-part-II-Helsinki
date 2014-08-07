
/**
 *
 * @author giuseppedesantis
 */


public class Flight {
    private String depart;
    private String arriv;
    
    public Flight(String depart, String arriv){
        this.depart = depart;
        this.arriv = arriv;
    }
    
    public String toString(){
        return "(" + this.depart + "-" + this.arriv + ")";
    }
    
    
}
