package personnel;

/**
 *
 * @author giuseppedesantis
 */
public class Person {
    private String name;
    private Education education;
    
    public Person (String name, Education education){
        this.name = name;
        this.education = education;
    }
    
    @Override
    public String toString() {
        return name + ", " + education;
    }
    
    public Education getEducation(){
        return education;
    }
    
}
