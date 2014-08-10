import java.util.Scanner;

/**
 *
 * @author giuseppedesantis
 */
public class TextUserInterface {
    private Scanner reader;
    private FlightDatabase flightDatabase;
    
    public TextUserInterface(Scanner reader, FlightDatabase flightDatabase){
        this.reader = reader;
        this.flightDatabase = flightDatabase;
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.println(">");
            String input = reader.nextLine();
            if(input.equals("x")){
                break;
            }else if(input.equals("1")){
                System.out.println("Give plane ID:");
                String id = reader.nextLine();
                System.out.println("Give plane capacity:");
                int capacity = Integer.parseInt(reader.nextLine());
                flightDatabase.addPlane(id, capacity);
            }else if(input.equals("2")){
                System.out.println("Give plane ID:");
                String id = reader.nextLine();
                System.out.println("Give departure airport code:");
                String depart = reader.nextLine();
                System.out.println("Give destination airport code:");
                String arriv = reader.nextLine();
                this.flightDatabase.addFlight(id, depart, arriv);
            }
        }
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();

        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print flight info");
            System.out.println("[x] Quit");
            System.out.println(">");
            String input = reader.nextLine();
            if(input.equals("x")){
                break;
            }else if(input.equals("1")){
                flightDatabase.printPlanes();
            }else if(input.equals("2")){
                flightDatabase.printFlights();
            }else if(input.equals("3")){
                System.out.println("Give plane ID:");
                String id = reader.nextLine();
                flightDatabase.printPlaneInfo(id);
            }
        }
        
    }
}
