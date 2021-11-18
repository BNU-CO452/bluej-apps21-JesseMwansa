
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

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
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
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 400);
        stock.buyProduct(103, 600);
        stock.buyProduct(104, 200);
        stock.buyProduct(105, 60);
        stock.buyProduct(106, 80);
        stock.buyProduct(107, 100);
        stock.buyProduct(108, 300);
        stock.buyProduct(109, 450);
        stock.buyProduct(110, 350);
        stock.buyProduct(111, 260);
        stock.buyProduct(112, 370);
        stock.buyProduct(113, 170);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 300);
        stock.sellProduct(102, 200);
        stock.sellProduct(103, 250);
        stock.sellProduct(104, 360);
        stock.sellProduct(105, 400);
        stock.sellProduct(106, 500);
        stock.sellProduct(107, 260);
        stock.sellProduct(108, 150);
        stock.sellProduct(109, 250);
        stock.sellProduct(110, 480);
        stock.sellProduct(111, 140);
        stock.sellProduct(112, 550);
        stock.sellProduct(113, 330);
    }    
}