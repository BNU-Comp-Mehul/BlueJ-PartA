import java.util.Date;
/**
 * This class will store information about a ticket 
 * including the journey destination, price and the 
 * date and time purchased
 * 
 * @author Mehul Patel
 * @version 1.0 16.10.2020
 */
public class Ticket
{
    //Fields, attributes, variables 
    
    private String destination; 
    
    //This is the price of the ticket in pence
    private int price;
    
    //Date and time the ticket was issued
    private Date dateTime;

    /**
     * Constructor for objects of class Ticket
     * This method will set values for the fields 
     */
    public Ticket(String destination, int price)
    {
        this.price = price;
        this.destination = destination;
        dateTime = new Date();
    }
    
    public int getPrice()
    {
        return price; 
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public void print()
    {
       System.out.print("Ticket to" + destination);
       System.out.print(" " + price + "pence");
       System.out.print(dateTime);
    }
    
    

    
}
