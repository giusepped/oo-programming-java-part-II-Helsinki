
package containers;

/**
 *
 * @author giuseppedesantis
 */
public class ProductContainer extends Container{
    
    private String productName;
    
    public ProductContainer(String productName, double capacity){
        super(capacity);
        this.productName = productName;
    }
    
    public String getName(){
        return this.productName;
    }
    
    public void setName(String newName){
        this.productName = newName;
    }
    
    @Override
    public String toString(){
        return this.productName + ": " + super.toString();
    }
}
