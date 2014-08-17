
package moving.domain;

/**
 *
 * @author giuseppedesantis
 */
public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;
    
    public Item(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public int getVolume(){
        return this.volume;
    }
    
    @Override
    public int compareTo(Item otherItem){
        return this.volume - otherItem.volume;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.volume + " dm^3)";
    }
    
    
}
