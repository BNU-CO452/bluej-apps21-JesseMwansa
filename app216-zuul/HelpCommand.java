import java.util.ArrayList;
/**
 * Write a description of class HelpCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelpCommand extends ZuulCommand
{
    public HelpCommand(Game zuul)
    {
        super(zuul);
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and
     * a list of the command words.
     */
    public void execute()
    {
        System.out.println(" You are church awaiting the priests instructions.");
        System.out.println(" The priest soon tells you to travel to the vampire cave.");        
        System.out.println(" There you are to kill a vampire and collect it's blood.");
        System.out.println("This blood will be used to create a vaccine against vampire bites.");
        System.out.println(" Your command words are: go, yes and no");
        System.out.println();
        
        for(CommandWords command : CommandWords.values())
        {
            System.out.println(" " + command.word + 
                               "\t  : " + command.description);                        
        }   
        System.out.println();
        System.out.println(" e.g. go west, take shotgun");
        System.out.println();
        System.out.println(zuul.MAP.getCurrentLocation().getLongDescription());
    }
}
