import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giuseppedesantis
 */
public class FlightDatabase {
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;
    private HashMap<Plane, ArrayList<Flight>> database;
    
    public FlightDatabase(){
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
        this.database = new HashMap<Plane, ArrayList<Flight>>();
    }
    
    public void addPlane(String id, int capacity){
        Plane plane = new Plane(id, capacity);
        this.planes.add(plane);
    }
    
    public void addFlight(String id, String depart, String arriv){
        Plane plane = new Plane("",0);
        for(Plane p : this.planes){
            if(p.getPlane().equals(id)){
                plane = p;
            }
        }
        Flight flight = new Flight(depart, arriv);
        this.flights.add(flight);
        this.database.put(plane, flights);
    }
    
    public void printPlanes(){
        for(Plane p : this.planes){
            System.out.println(p);
        }
    }
    
    public void printFlights(){
        
    }
    
    public void printOnePlane(String id){
        for(Plane p : this.planes){
            if(p.getPlane().equals(id)){
                System.out.println(p);
            }
        }
    }
    
}
