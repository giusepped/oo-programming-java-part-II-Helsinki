
package application;

/**
 *
 * @author giuseppedesantis
 */
import java.util.Random;

public class Thermometer implements Sensor{
    private Random random;
    private boolean status;
    
    public Thermometer(){
        this.random = new Random();
        this.status = false;
    }
    
    @Override
    public boolean isOn(){
        return this.status;
    }
    
    @Override
    public void on(){
        this.status = true;
    }
    
    @Override
    public void off(){
        this.status = false;
    }
    
    @Override
    public int measure(){
        int measure = -30 + random.nextInt(30 - (-30) + 1);
        return measure;
    }
}
