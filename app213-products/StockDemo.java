import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Jesse Mwansa
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random random;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        this.random= new Random();
        
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Apple iPhone 12"));
        stock.add(new Product(103, "Google Pixel 4A"));
        stock.add(new Product(104, "Apple iPhone 11"));
        stock.add(new Product(105, "Samsung Galaxy S12"));
        stock.add(new Product(106, "OnePlus 9"));
        stock.add(new Product(107, "Samsung Galaxy Note 20"));
        stock.add(new Product(108, "Huawei GX8"));
        stock.add(new Product(109, "Microsoft 640"));
        stock.add(new Product(110, "Nokia 3310"));
        stock.add(new Product(111, "Sony Experia XZ"));
        stock.add(new Product(112, "Nokia 130"));
        stock.add(new Product(113, "LG G6"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    
    /**
     * This method will buy different amounts of products in stock list 
     */
    private void buyProducts()
    {
        for(int i = 101; i <= 113; i++)
    { 
        stock.buyProduct(i, random.nextInt(1001));
        
    }
    }  

    /*
     * This method will sell different amounts of products in stock list
     */
    private void sellProducts()
    {
        for(int i = 101; i <= 113; i++)
    {
        stock.sellProduct(i, random.nextInt(1001));
        
    }    
    }
}    