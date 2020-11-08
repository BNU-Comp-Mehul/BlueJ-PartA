import java.util.ArrayList;

/**
 * Manages the stock. 
 * The stock is described by zero or more products.
 * 
 * Author Mehul Patel  
 * Modified on 05.11.2020
 */
public class StockManager
{
    //Provides a list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialises the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Adds a product to list. 
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receives delivery of a product and increases product quantities.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        
        System.out.println("Deliver Product" + id);
        product.increaseQuantity(amount);
        printProduct(id);
        
        if(product != null)
            product.increaseQuantity(amount);
        
        else
            System.out.println("Invalid Product ID = " + id);
    }
    
    /**
     * Selling products and showing product status.
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            if(quantity > product.getQuantity())
                quantity = product.getQuantity();
                
            printProduct(id);
            
            for(int count = 0; count <= quantity; count++)
            {
                product.sellOne();
            }

            printProduct(id);
        }
    }
    
    /**
     * Finding a product and its ID. 
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
               return product; 
            }
        }
        
        return null;
    }
    
    /**
     * Searching for products based on part of their name.
     */
    public void searchProducts(String name)
    {
        for(Product product : stock)
        {
            if(product.getName().contains(name))
            {
                System.out.println(product);
            }
        }
    }
    
    /**
     * Checking for a product in stock. 
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Printing details of product once found. 
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Printing details of each product in stock. 
     */
    public void printAllProducts()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }
    }
    
    /**
     * Printing of heading. 
     */
    public void printHeading()
    {
        System.out.println("========================");
        System.out.println("Mehul Patel's Stock List");
        System.out.println("========================");
        System.out.println();
    }
}