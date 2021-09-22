
package Labs.Lab7.Project6;

import java.util.ArrayList;
/*
 * Customer
 * This program will represent the customer in the movie theater
 * Khoi Tran
 * 11/06/2020
 * CMSC 255/ Section 002
 */
public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private ArrayList<Ticket> tickets;

    /**
     * Set constructors for all variables
     */
    public Customer(){
        firstName = "";
        lastName = "";
        age = 0;
        email = "";
        tickets = new ArrayList<>();
    }

    /**
     * Set all parameters
     * @param aLastName
     * @param aFirstName
     * @param aAge
     * @param aEmail
     */
    public Customer(String aLastName, String aFirstName, int aAge, String aEmail){
        firstName = aFirstName;
        lastName = aLastName;
        age = aAge;
        email = aEmail;
        tickets = new ArrayList<>();
    }

    /**
     * getter for firstName
     * @return
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * setter for firstName
     * @return
     */
    public void setFirstName(String aFirstName){
        firstName = aFirstName;
    }
    /**
     * getter for lastName
     * @return
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * setter for lastName
     * @return
     */
    public void setLastName(String aLastName){
        lastName = aLastName;
    }

    /**
     * getter for age
     * @return
     */
    public int getAge(){
        return age;
    }
    /**
     * setter for lastName
     * @return
     */
    public void setAge(int aAge){
        age = aAge;
    }
    /**
     * getter for email
     * @return
     */
    public String getEmail(){
        return email;
    }
    /**
     * setter for email
     * @return
     */
    public void setEmail(String aEmail){
        email = aEmail;
    }
    /**
     * a method for purchaseTicket
     */
   public void purchaseTicket(Ticket t){
        //Ticket t = new Ticket();
        tickets.add(t);
   }
    /**
     * a getNumTicket to return the number tickets
     * @return
     */
   public int getNumTickets(){
        return tickets.size();
   }
    /**
     * a method to return the array size
     */
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    /**
     * toString to print out the result
     */
    public String toString(){
        String str = "";
        str = firstName + " " + lastName + "\n" + age + "\n" + email + "\n";
        str += "Ticket Order:\n";
        for(int i = 0; i < tickets.size(); i++){
            str += tickets.get(i).toString();;
        }
        return str;
    }
}
