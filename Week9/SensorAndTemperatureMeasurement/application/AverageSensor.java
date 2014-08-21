
package application;

/**
 *
 * @author giuseppedesantis
 */

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    @Override
    public boolean isOn(){
        for(Sensor s : this.sensors){
            if(s.isOn()){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void on(){
        for(Sensor s : this.sensors){
            s.on();
        }
    }
    
    @Override
    public void off(){
        for(Sensor s: this.sensors){
            s.off();
        }
    }
    
    @Override
    public int measure(){
        if(this.sensors.isEmpty() || this.isOn() == false){
            throw new IllegalStateException("No sensors or average sensor is off");
        }else{
            int sum = 0;
            for(Sensor s : this.sensors){
                sum += s.measure();
            }
            int average = sum/sensors.size();
            this.readings.add(average);
            return average;
        }
    }
    
    public List<Integer> readings(){
        return readings;
    }
}

