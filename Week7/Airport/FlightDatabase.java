
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
    private Map<Plane, ArrayList<Flight>> database;
    
    public FlightDatabase(){
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
        this.database = new HashMap<Plane, ArrayList<Flight>>();
    }
    
    public void addPlane(String id, int capacity){
        ArrayList<Flight> init = new ArrayList<Flight>();
        Plane plane = new Plane(id, capacity);
        this.planes.add(plane);
        this.database.put(plane, init);
    }
    
    public void addFlight(String id, String depart, String arriv){
        Plane plane = new Plane("",0);
        for(Plane p : this.planes){
            if(p.getPlane().equals(id)){
                plane = p;
            }
        }
        Flight flight = new Flight(depart, arriv);
        this.database.get(plane).add(flight);
    }
    
    public void printPlanes(){
        for(Plane p : this.planes){
            System.out.println(p);
        }
    }
    
    public void printFlights(){
        for(Plane p : this.database.keySet()){
            ArrayList<Flight> flights = this.database.get(p);
            for(Flight f : flights){
                System.out.println(p + " " + f);
            }
        }
    }
    
    public void printPlaneInfo(String id){
        for(Plane p : this.planes){
            if(p.getPlane().equals(id)){
                System.out.println(p);
            }
        }
    }
    
}
