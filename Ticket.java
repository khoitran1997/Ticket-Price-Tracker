
package Labs.Lab7.Project6;
/*
 * Ticket
 * This class will define the ticket characteristic
 * Khoi Tran
 * 11/06/2020
 * CMSC 255/ Section 002
 */
public class Ticket {
    private Location location;
    private Food_Option food;
    private Drink_Option drink;
    private Discount discount;

    public Ticket(){
        location = Location.FRONT;
        food = Food_Option.NONE;
        drink = Drink_Option.NONE;
        discount = Discount.NONE;
    }

    /**
     * set parameters just for location and default values for the rest of the parameters
     * @param aLocation
     */
    public Ticket(Location aLocation){
        location = aLocation;
        food = Food_Option.NONE;
        drink = Drink_Option.NONE;
        discount = Discount.NONE;
    }

    /**
     * getter method for location
     * @return
     */
    public Location getLocation(){
        return location;
    }
    /**
     * setter method for location
     * @return
     */
    public void setLocation(Location aLocation){
        location = aLocation;
    }
    /**
     * getter method for foodOption
     * @return
     */
    public Food_Option getFood(){
        return food;
    }
    /**
     * setter method for foodOption
     * @return
     */
    public void setFood(Food_Option aFood){
        food = aFood;
    }
    /**
     * getter method for drinkOption
     * @return
     */
    public Drink_Option getDrink(){
        return drink;
    }
    /**
     * setter method for drinkOption
     * @return
     */
    public void setDrink(Drink_Option aDrink){
        drink = aDrink;
    }
    /**
     * getter method for discount
     * @return
     */
    public Discount getDiscount(){
        return discount;
    }
    /**
     * setter method for discount
     * @return
     */
    public void setDiscount(Discount aDiscount){
        discount = aDiscount;
    }

    /**
     * a toString method to display the location, foodOption, drinkOption and discount from the ticket
     * @return
     */
    public String toString(){
        String str = "";
        str = "\n\t" + location + "\n\t" + food + "\n\t" + drink + "\n\t" + discount + "\n";
        return str;
    }
}
