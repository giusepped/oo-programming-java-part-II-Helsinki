
/**
 *
 * @author giuseppedesantis
 */

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;
    
    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }
    
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}
