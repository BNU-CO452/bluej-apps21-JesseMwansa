
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *      
 *  [Outside]
 *      |
 *  [Church]<------------>[Theatre]
 *      |                     |
 *  [Scientific Lab]<---->[Vamp Cave]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location outside, church, forest, vampcave, lab;

    private Location currentLocation;

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
        createChurch();
        createForest();
        createVampcave();
        createLab();

        currentLocation = outside;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * church
     */
    private void createOutside()
    {
        outside = new Location("outside the main entrance of the church");
        
    }
    
    /**
     * Create the church
     */
    private void createChurch()
    {
        church = new Location("in the sacred Church.");
        
        church.setExit("east", forest);
        outside.setExit("south", church);
    }
    
    /**
     * Create the forest linked to the vampcave
     */
    private void createForest()
    {
        forest = new Location("in the mystical forest.");
        
        forest.setExit("south", vampcave);
        vampcave.setExit("north", forest);
    }
    
    /**
     * Create the vampcave linked to the lab
     */
    private void createVampcave()
    {
        vampcave = new Location("in the feared vampcave");
        
        vampcave.setExit("west", lab);
        lab.setExit("east", vampcave);
        
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
        
        lab.setExit("north", church);
        church.setExit("south", lab);
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
