
/**
 *
 * @author giuseppedesantis
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Contacts {
    private Map<String, Person> nameContacts;
    private Map<Set<String>, Person> phoneContacts;
    private Map<String, Person> addressContacts;
    private List<Person> contacts;
    
    public Contacts(){
        this.contacts = new ArrayList<Person>();
        this.nameContacts = new HashMap<String,Person>();
        this.phoneContacts = new HashMap<Set<String>, Person>();
        this.addressContacts = new HashMap<String, Person>();
    }
    
    public void addContact(Person person){
        this.contacts.add(person);
        this.nameContacts.put(person.getName(), person);
        this.phoneContacts.put(person.getNumbers(), person);
        this.addressContacts.put(person.getAddress(), person);   
    }
    
    public boolean containsPersonByName(String name){
        for(Person p : contacts){
            if(p.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public void addNumber(String name, String number){
        for(Person p : contacts){
            if(p.getName().equals(name)){
                p.addNumber(number);
                this.phoneContacts.put(p.getNumbers(), p);
            }
        }
    }
    
    public void addAddress(String name, String street, String city){
        for(Person p : contacts){
            if(p.getName().equals(name)){
                p.addAddress(street, city);
                this.addressContacts.put(p.getAddress(), p);
            }
        }
    }
    
    public String getNameBasedOnNumber(String number){
        for(Person p : contacts){
            Set<String> numbersOfContact = p.getNumbers();
            for(String s : numbersOfContact){
                if(s.equals(number)){
                    return " " + p.getName();
                }
            }
        }
        return " not found";
    }
    
    public String getNumberBasedOnName(String name){
        return nameContacts.get(name).getNumbers().toString()
                                                  .replace("[", "")
                                                  .replace(", ", "\n")
                                                  .replace("]", "");
    }
    
    public Person getPersonalInformation(String name){
        return nameContacts.get(name);
    }
    
    public void removePerson(String name){
        Person toBeRemoved = new Person("");
        for(Person p : this.contacts){
            if(p.getName().equals(name)){
                toBeRemoved = p;
            }
        }
        this.nameContacts.remove(name);
        this.phoneContacts.remove(toBeRemoved.getNumbers());
        this.addressContacts.remove(name);
        this.contacts.remove(toBeRemoved);
    }
    
    public void filteredListing(String keyword){
        Collection<Person> newList = new ArrayList<Person>();
        Collections.sort(contacts);
        for(Person p : contacts){
            if(keyword.isEmpty() || p.getAddress().contains(keyword) || p.getName().contains(keyword)){
                newList.add(p);
            }
        }
        if(newList.isEmpty()){
            System.out.println("not found");
        }else{
            for(Person p : newList){
                System.out.println(p.getName());
                System.out.println(p);
            }
        }
    }
}
