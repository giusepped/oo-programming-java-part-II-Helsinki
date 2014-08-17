import java.util.Comparator;
/**
 *
 * @author giuseppedesantis
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{
    @Override
    public int compare(Card card1, Card card2){
        if(card1.getSuit() - card2.getSuit() == 0){
            return card1.getValue() - card2.getValue();
        }else{
            return card1.getSuit() - card2.getSuit();
        }
    }
}
