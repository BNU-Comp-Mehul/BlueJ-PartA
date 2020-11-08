import java.util.Random;
   
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * Author Mehul Patel
 * Modified on 05.11.2020
 */
public class StockDemo
{
    //Used for stock manager 
    private StockManager manager;
    //Used for product selection.
    private Random randomGenerator;
    
    /**
     * Creating stock manager. 
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();
        
        manager.addProduct(new Product(101, "Bluetooth headphones"));
        manager.addProduct(new Product(102, "Bluetooth speaker"));
        manager.addProduct(new Product(103, "Smartwatch"));
        manager.addProduct(new Product(104, "Smartphone"));
        manager.addProduct(new Product(105, "Tablet"));
        manager.addProduct(new Product(106, "Television"));
        manager.addProduct(new Product(107, "Camera"));
        manager.addProduct(new Product(108, "Printer"));
        manager.addProduct(new Product(109, "MP4 player"));        
        manager.addProduct(new Product(110, "Games console"));
    }
    
    /**
     * Enables demo to run. 
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
    }
    
    /**
     * Used for product deliveries. 
     */
    private void demoDeliverProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(8);
            manager.deliverProduct(id, quantity);
        }
    }
    
    /**
     * Used for selling products. 
     */
    private void demoSellProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(4);
            manager.sellProduct(id, quantity);
        }
    }
    
}