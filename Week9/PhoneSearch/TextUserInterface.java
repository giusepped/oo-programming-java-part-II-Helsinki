
/**
 *
 * @author giuseppedesantis
 */

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Contacts contacts;
    
    public TextUserInterface(){
        this.reader = new Scanner(System.in);
        this.contacts = new Contacts();
    }
    
    public void launch(){
        initialCommands();
        program();
    }
    
    public void initialCommands(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }
    
    public void program(){
        while(true){
            System.out.println();
            System.out.println("command: ");
            String input = reader.nextLine();
            if(input.equals("x")){
                break;
            }else if(input.equals("1")){
                addNumber();
            }else if(input.equals("2")){
                searchNumber();
            }else if(input.equals("3")){
                searchByNumber();
            }else if(input.equals("4")){
                addAddress();
            }else if(input.equals("5")){
                searchPersonalInfo();
            }else if(input.equals("6")){
                removePerson();
            }else if(input.equals("7")){
                filteredListing();
            }
        }
    }
    
    public void addNumber(){
        System.out.println("whose number: ");
        String name = reader.nextLine();
        System.out.println("number: ");
        String number = reader.nextLine();
        if(contacts.containsPersonByName(name)){
            contacts.addNumber(name, number);
        }else{
            Person toBeAdded = new Person(name);
            toBeAdded.addNumber(number);
            contacts.addContact(toBeAdded);
        }
    }
    
    public void searchNumber(){
        System.out.println("whose number: ");
        String name = reader.nextLine();
        if(contacts.containsPersonByName(name)){
            System.out.println(contacts.getNumberBasedOnName(name));
        }else{
            System.out.println("not found");
        }
        
    }
    
    public void searchByNumber(){
        System.out.println("number: ");
        String number = reader.nextLine();
        System.out.println(contacts.getNameBasedOnNumber(number));
    }
    
    public void addAddress(){
        System.out.println("whose address: ");
        String name = reader.nextLine();
        if(contacts.containsPersonByName(name)){
            System.out.println("street: ");
            String street = reader.nextLine();
            System.out.println("city: ");
            String city = reader.nextLine();
            contacts.addAddress(name, street, city);
        }else{
            System.out.println("street: ");
            String street = reader.nextLine();
            System.out.println("city: ");
            String city = reader.nextLine();
            Person toBeAdded = new Person(name);
            toBeAdded.addAddress(street, city);
            contacts.addContact(toBeAdded);
        }
    }
    
    public void searchPersonalInfo(){
        System.out.println("whose information: ");
        String name = reader.nextLine();
        if(contacts.containsPersonByName(name)){
            System.out.println(contacts.getPersonalInformation(name));
        }else{
            System.out.println("not found");
        }
    }
    
    public void removePerson(){
        System.out.println("whose information: ");
        String name = reader.nextLine();
        if(contacts.containsPersonByName(name)){
            contacts.removePerson(name);
        }else{
            System.out.println("not found");
        }
    }
    
    public void filteredListing(){
        System.out.println("keyword (if empty, all listed) : ");
        String keyword = reader.nextLine();
        contacts.filteredListing(keyword);
    }
    
}
