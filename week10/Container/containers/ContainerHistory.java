
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
        List<Double> fluctuations = new ArrayList<Double>();
        double greatestFluctuation = 0;
        if(values.isEmpty() || values.size() == 1){
            return greatestFluctuation;
        }else{
            for(int i = values.size() - 1; i >= 1; i--){
                double fluctuation = Math.abs(values.get(i) - values.get(i-1));
                fluctuations.add(fluctuation);
            }
        }
        for(double f : fluctuations){
            if(greatestFluctuation < f){
                greatestFluctuation = f;
            }
        }
        return greatestFluctuation;
    }
    
    public double variance(){
        double varianceSum = 0;
        if(values.isEmpty() || values.size() == 1){
            return varianceSum;
        }else{
            for(double v : values){
                varianceSum += (v - this.average())*(v - this.average());
            }
        }
        double variance = varianceSum/(values.size() - 1);
        return variance;
    }
}
