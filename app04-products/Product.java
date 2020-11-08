/**
 * Details of products. 
 * 
 * Author Mehul Patel
 * Modified on 05.11.2020
 */
public class Product
{
    //Identifying a number for each product.
    private int id;
    //Used for naming a product.
    private String name;
    //Used for searching the quantity of a product. 
    private int quantity;

    /**
     * Constructor for objects of class. 
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * Returns the ID of a product. 
     */
    public int getID()
    {
        return id;
    }

    /**
     * Returns the name of a product. 
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the quantity of a product.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Returns the name, ID and quantity in stock. 
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }
    
    /**
     * Increases the quantity of a product. 
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0)
        {
            quantity += amount;
        }
        
        else
        {
            System.out.println("Attempt to restock" + name 
                               + "with a non-positive amount:" + amount);
        }
    }

    /**
     * Sell a product or an error will appear if none are in stock. 
     */
    public void sellOne()
    {
        if(quantity > 0) 
        {
            quantity--;
        }
        
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
}