
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @Jesse Mwansa
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            int id =reader.getInt("Please enter a product id>");
            String name= reader.getString("Please enter the name of the product:");
            Product product= new Product(id, name);
            stock.remove(product);
            stock.print();
            System.out.println("Product"+ product.getID()+","+ product.getName() + " has been removed");
            
        }
        
        
        else if(choice.equals("buy"))
        {
          int id =reader.getInt("Please enter a product id>");
            String name= reader.getString("Please enter the name of the product:");
            Product product= new Product(id, name);
            for(int productID = 0; productID <= 0;productID++)
            stock.print();
            System.out.println("Product"+ product.getID()+","+ product.getName() + " has been bought");         
        }
    
        
        return false;
    }
    
    
    
    /*
     * This will remove the product
     */
    private void removeProduct()
    {
     {
       System.out.println("Removing a product");
       System.out.println();
       
       int id =reader.getInt("Please enter a product id>");
       String name = reader.getString("Please enter the product name>");
       
       Product product = new Product(id, name);
       
       stock.print();
        }
    }   
    
     private void addProduct()
     {
       System.out.println("Adding a new product");
       System.out.println();
       
       int id =reader.getInt("Please enter a product id>");
       String name = reader.getString("Please enter the product name>");
       
       Product product = new Product(id, name);
       stock.add(product);
       stock.print();
        }
        
       
        
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buy a product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Jesse Mwansa");
        System.out.println("********************************");
    }
}