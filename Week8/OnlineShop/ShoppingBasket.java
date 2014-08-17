import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author giuseppedesantis
 */
public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket(){
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(this.purchases.containsKey(product)){
            this.purchases.get(product).increaseAmount();
        }else{
            Purchase newp = new Purchase(product, 1, price);
            this.purchases.put(product, newp);
        }
    }
    
    public int price(){
        int totalPrice = 0;
        for(Purchase p : this.purchases.values()){
            totalPrice += p.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for(Purchase p : this.purchases.values()){
            System.out.println(p.toString());
        }
    }
}
