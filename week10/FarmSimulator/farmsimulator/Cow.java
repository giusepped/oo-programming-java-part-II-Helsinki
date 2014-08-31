
package farmsimulator;

/**
 *
 * @author giuseppedesantis
 */
 
 import java.util.Random;
 
public class Cow implements Milkable, Alive{
    private String name;
    private int udder;
    private double amountOfMilk;
    private Random rand = new Random();
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this.udder = 15 + rand.nextInt(40 - 15 + 1);
        int nameIndex = rand.nextInt(NAMES.length);
        this.name = NAMES[nameIndex];
    }
    
    public Cow(String name){
        this.name = name;
        this.udder = 15 + rand.nextInt(40 - 15 + 1);
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udder;
    }
    
    public double getAmount(){
        return this.amountOfMilk;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.amountOfMilk + "/" + this.udder;
    }
    
    @Override
    public double milk(){
        double tempAmountOfMilk = this.amountOfMilk;
        this.amountOfMilk = 0;
        return tempAmountOfMilk;
    }
    
    @Override
    public void liveHour(){
        double milkProduced = Math.ceil(0.7 + (2 - 0.7) * rand.nextDouble());
        if(this.amountOfMilk + milkProduced <= this.udder){
            this.amountOfMilk += milkProduced;
        }
    }
}
