
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{    
    String name;
    String description;
    int id;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description)
    {
        this.name= name;
        this.description = description;
    }
    
    public String getName()
    {
        return name;
    }
    
    /**
     *Used to display name of item and description
     */
    public void getShortDescription()
    {
        System.out.println(name + " "+ description);
    }
}
