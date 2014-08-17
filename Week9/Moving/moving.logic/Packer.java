
package moving.logic;

import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author giuseppedesantis
 */
public class Packer {
    private Box box;
    private List<Box> boxes;
    
    public Packer(int boxesVolume){
        this.box = new Box(boxesVolume);
        this.boxes = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things){
        
        
        return this.boxes;
    }
}
