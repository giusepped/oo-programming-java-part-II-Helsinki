
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(this.getClass() != object.getClass()){
            return false;
        }
        Bird compared = (Bird) object;
        if(this.latinName == null || !this.latinName.equals(compared.latinName)){
            return false;
        }
        if(this.ringingYear != compared.ringingYear){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        if(this.latinName == null){
            return 7;
        }
        
        return this.ringingYear + this.latinName.hashCode();
    }
}


