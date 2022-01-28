
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *      
 *   [Outside]
 *      |
 *   [Church]<--------->[cabin]<--------->[Forest]
 *      |                                    |
 *      |                                 [Bridge]
 *      |                                     |
 *      |                                   |   |
 *      |                                |         |
 *  [Scientific Lab]<----------->[Vamp Cave]     [Death pit]
 *  
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    public static Location outside, church, cabin, forest, bridge, vampcave, deathpit, lab;

    public static Location currentLocation;
    
    public Game game;
    
    public Item item;
    
    public Player player;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createOutside();
        createChurch();
        createCabin();
        createForest();
        createBridge();
        createVampcave();
        createLab();
        createDeathpit();
        

        currentLocation = outside;  // start game in church
    }
    
    /**
     * Create the outside and link it to the
     * church
     */
    private void createOutside()
    {
        outside = new Location("outside the main entrance of the church");
        currentLocation = outside;
    }
    
    
    
    /**
     * Create the church
     */
    private void createChurch()
    {
        church = new Location("in the sacred Church.");
        
        church.setExit("north", outside);
        outside.setExit("south", church);
        
        church.setItem(new Item("Scroll", "Contains sacred scriptures that keep you safe."));
    }
    
    private void createCabin()
    {
        cabin = new Location("cabin full of supplies.");
        
        cabin.setExit("west", church);
        church.setExit("east", cabin);
        
        cabin.setItem(new Item("Enchanted Shotgun", "This has holy water to burn vampires."));
    }
    
    /**
     * Create the forest linked to the vampcave
     */
    private void createForest()
    {
        forest = new Location("in the mystical forest.");
        
        forest.setExit("west", cabin);
        cabin.setExit("east", forest);
        
        forest.setItem(new Item("Medkit", "Boosts health."));
    }
    
    /**
     * Create the bridge and link it to the
     * vampave and deathpit
     */
    private void createBridge()
    {
        bridge = new Location("at the shaky bridge");
        
        bridge.setExit("north", forest);
        forest.setExit("south", bridge);
        
        
    }
    
    /**
     * Create the vampcave linked to the lab
     */
    private void createVampcave()
    {
        vampcave = new Location("in the feared vampcave");
        
        vampcave.setExit("northeast", bridge);
        bridge.setExit("southwest", vampcave);
        
        vampcave.setExit("east", deathpit);

        
    }
    
    private void createDeathpit()
    {
        deathpit = new Location("the deadly pit");
        
        deathpit.setExit("northwest", bridge);
        bridge.setExit("southeast", deathpit);
        
        deathpit.setExit("west", vampcave);
        vampcave.setExit("east", deathpit);
        
    }
    
    /**
     * Create the lab and link it to the church and vampcave
     */
    private void createLab()
    {
        // create the Locations
        lab = new Location("in a scientific lab");
        
        lab.setExit("east", vampcave);
        vampcave.setExit("west", lab);
        
        lab.setItem(new Item("Serum", "Immunity against vampires."));
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
    
    
}

   
    