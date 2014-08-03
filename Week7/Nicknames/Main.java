
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<String, String>();
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");
        
        String nick = nicknames.get("mikael");
        System.out.println(nick);
    }

}
