
/**
 *
 * @author giuseppedesantis
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.amount * this.unitPrice;
    }
    
    public String product(){
        return this.product;
    }
    
    public void increaseAmount(){
        this.amount++;
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.amount;
    }
}
