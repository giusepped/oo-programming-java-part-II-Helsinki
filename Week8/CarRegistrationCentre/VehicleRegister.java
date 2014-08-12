import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author giuseppedesantis
 */
public class VehicleRegister {
    private Map<RegistrationPlate, String> register = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner){
        if(this.register.get(plate) == null){
            this.register.put(plate, owner);
            return true;
        }else{
            return false;
        }
    }
    
    public String get(RegistrationPlate plate){
        if(this.register.get(plate) == null){
            return null;
        }else{
            return this.register.get(plate);
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if(this.register.get(plate) == null){
            return false;
        }else{
            this.register.remove(plate);
            return true;
        }
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : this.register.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();
        for(RegistrationPlate plate : this.register.keySet()){
            String owner = this.register.get(plate);
            if(owners.contains(owner) == false){
                owners.add(owner);
            }
        }
        for(String owner : owners){
            System.out.println(owner);
        }
    }
}
