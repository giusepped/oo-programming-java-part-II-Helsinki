
public class Smileys {

    public static void main(String[] args) {
        
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        int strlen = characterString.length();
        String smiley = ":)";
        if(strlen % 2 == 0){
            int topBottomRow = (strlen + 6)/2;
            printTopBottomRow(topBottomRow, smiley);
            System.out.println(smiley+" "+characterString+" "+smiley);
            printTopBottomRow(topBottomRow, smiley);
        }else{
            int topBottomRow = (strlen + 7)/2;
            printTopBottomRow(topBottomRow, smiley);
            System.out.println(smiley+" "+characterString+"  "+smiley);
            printTopBottomRow(topBottomRow, smiley);
        }        
    }
    
    private static void printTopBottomRow(int rowLength, String smiley){
        for(int i = 0; i < rowLength; i++){
            System.out.print(smiley);
        }
        System.out.println();
    }
}
