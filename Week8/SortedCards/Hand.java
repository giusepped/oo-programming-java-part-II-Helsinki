import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author giuseppedesantis
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card c : this.cards){
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }
    
    public int totalValue(){
        int totalValue = 0;
        for(Card c : this.cards){
            totalValue += c.getValue();
        }
        return totalValue;
    }
    
    @Override
    public int compareTo(Hand hand){
        return this.totalValue() - hand.totalValue();
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
