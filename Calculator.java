

/**
 *
 * @author giuseppedesantis
 */
public class Calculator {
    private Reader reader;
    private int counter;
    
    public Calculator(){
        this.reader = new Reader();
        this.counter = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum(){
       int values [] = this.readTwoValues();
       int sum = values[0] + values[1];
       System.out.println("sum of the values " + sum);
    }
    
    private void product(){
       int values [] = this.readTwoValues();
       int product = values[0] * values[1];
       System.out.println("product of the values " + product);
    }
    
    private void difference(){
       int values [] = this.readTwoValues();
       int difference = values[0] - values[1];
       System.out.println("difference of the values " + difference);
    }
    
    private int[] readTwoValues() {
        this.counter++;
 
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
 
        return values;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + this.counter);
    }
}
