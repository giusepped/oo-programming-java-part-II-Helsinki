
package movable;

/**
 *
 * @author giuseppedesantis
 */
public class Organism implements Movable{
    private int x;
    private int y;
    
    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "x: " + this.x + "; y: " + this.y;
    }
    
    @Override
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
}
