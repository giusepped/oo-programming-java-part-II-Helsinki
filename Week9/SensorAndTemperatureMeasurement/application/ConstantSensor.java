
package application;

/**
 *
 * @author giuseppedesantis
 */
public class ConstantSensor implements Sensor{
    private int measure;
    
    public ConstantSensor(int measure){
        this.measure = measure;
    }
    
    @Override
    public boolean isOn(){
        return true;
    }
    
    @Override
    public void on(){
        
    }
    
    @Override
    public void off(){
        
    }
    
    @Override
    public int measure(){
        return this.measure;
    }
}
