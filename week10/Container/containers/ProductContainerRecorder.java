
package containers;

/**
 *
 * @author giuseppedesantis
 */
public class ProductContainerRecorder extends ContainerHistory{
    private ProductContainer productContainer;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        this.productContainer = new ProductContainer(productName, capacity);
        this.productContainer.addToTheContainer(initialVolume);
        super.add(initialVolume);
    }
    
    public String history(){
        return super.toString();
    }
    
    public void addToTheContainer(double amount){
        this.productContainer.addToTheContainer(amount);
        super.add(this.productContainer.getVolume());
    }
    
    public void takeFromTheContainer(double amount){
        this.productContainer.takeFromTheContainer(amount);
        super.add(this.productContainer.getVolume());
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.productContainer.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + super.maxValue());
        System.out.println("Smallest product amount: " + super.minValue());
        System.out.println("Average: " + super.average());
        System.out.println("Greatest change: " + super.greatestFluctuation());
        System.out.println("Variance: " + super.variance());
    }
    
}
