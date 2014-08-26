
package containers;

/**
 *
 * @author giuseppedesantis
 */

import java.util.List;
import java.util.ArrayList;

public class ContainerHistory {
    private List<Double> values;
    
    public ContainerHistory(){
        this.values = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.values.add(situation);
    }
    
    public void reset(){
        this.values.clear();
    }
    
    @Override
    public String toString(){
        return this.values.toString();
    }
    
    public double maxValue(){
        double maxValue = 0;
        if(this.values.isEmpty()){
            return maxValue;
        }else{
            for(double v : this.values){
                if(v >= maxValue){
                    maxValue = v;
                }
            }
        }
        return maxValue;
    }
    
    public double minValue(){
        double minValue = 0;
        if(this.values.isEmpty()){
            return minValue;
        }else{
            minValue = this.maxValue();
            for(double v : this.values){
                if(v < minValue){
                    minValue = v;
                }
            }
        }
        return minValue;
    }
    
    public double average(){
        double average = 0;
        for(double v : this.values){
            average += v;
        }
        average = average/values.size();
        return average;
    }
    
    public double greatestFluctuation(){
        double greatestFluctuation = 0;
        if(values.isEmpty() || values.size() == 1){
            return greatestFluctuation;
        }else{
            
        }
        return greatestFluctuation;
    }
    
    public double variance(){
        double variance = 0;
        if(values.isEmpty() || values.size() == 1){
            return variance;
        }else{
            
        }
        return variance;
    }
    
    
}
