import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author giuseppedesantis
 */

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Storehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        for(String p : this.prices.keySet()){
            if(p.equals(product)){
                return this.prices.get(p);
            }
        }
        return -99;
    }
    
    public int stock(String product){
        for(String p : this.stocks.keySet()){
            if(p.equals(product)){
                return this.stocks.get(p);
            }
        }
        return 0;
    }
    
    public boolean take(String product){
        for(String p : this.stocks.keySet()){
            if(p.equals(product)){
                if(this.stock(p) > 0){
                    this.stocks.put(p, this.stock(p) - 1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<String>();
        for(String s : this.prices.keySet()){
            products.add(s);
        }
        return products;
    }

}
