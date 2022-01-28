import java.util.Scanner;

/**
 * This command transfers the player from
 * one location to another location provided the
 * two locations are linked by a valid exit
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public class GoCommand extends ZuulCommand
{
    String direction;
    //variable for player
    Player player;
    //variable for item
    Item item;
    Scanner reader;
    Map MAP;
    
    public GoCommand(Game zuul, String direction)
    {
        super(zuul);
        this.direction = direction;
        reader = new Scanner(System.in);
        player = new Player("Jesse", 100);
    }    

    public void execute()
  {
        String ans;
        if(direction == null) 
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        Map map = zuul.MAP;
        
        // Try to leave current room.
        Location currentLocation = map.getCurrentLocation();
        Location nextLocation = currentLocation.getExit(direction);

        if (nextLocation == null) 
        {
            System.out.println("There is no exit in this direction!");
        }
        else 
        {
            map.enterLocation(nextLocation);
            System.out.println(map.getCurrentLocation().getLongDescription());
            
             if(map.currentLocation == map.church)
           {
             System.out.println("You have picked up a scroll."); 
             System.out.println("Do you want to read it. Yes or no?"); 
             System.out.print(" > ");
             ans = reader.nextLine().toLowerCase();
             
             if (ans.equals("yes"))
             {
               System.out.println("You will now be protected by the scriptures."); 
               System.out.println("Your score has been increased by:" + player.setPlayerHP(player.getScore()+ 30) );
               System.out.println("Move to the next location."); 
             }
            
             else if (ans.equals("no"))
             {
                System.out.println("You will not be protected.");
                System.out.println("Your HP is now: " + player.setPlayerHP(player.getPlayerHP() - 20));
                System.out.println("Move to the next location.");
             }
            }             
            
              else if(map.currentLocation == map.forest)
           {
             System.out.println("You walk into the mystical forest.");
             System.out.println("As you're walking, the mist you inhale puts you under a trance.");
             System.out.println("You touch the surface of a smooth tree which is actually a poisonous material.");
             System.out.println("Your HP  reduces by 20 and is now :" + player.setPlayerHP(player.getPlayerHP() - 20));
             System.out.println("Luckily, you have collected a medkit in the forest.");
             System.out.println("Do you want to use it. Yes or no?");
             System.out.print(" > ");
             ans = reader.nextLine().toLowerCase();
             
             if (ans.equals("yes"))
             {
               System.out.println("Your health will be boosted."); 
               player.setPlayerHP(player.getPlayerHP() + 10);
               System.out.println("Current HP: " + player.setPlayerHP(player.getPlayerHP()));
               System.out.println("Move to the next location.");
             }
            
             else if (ans.equals("no"))
             {
                System.out.println("Your insides are slowly getting damaged by the toxins.");
                player.setPlayerHP(player.getPlayerHP() - 20);
                System.out.println("Current HP: " + player.setPlayerHP(player.getPlayerHP()));
                System.out.println("Move to the next location.");
             }
           } 
           
           else if (map.currentLocation == map.bridge)
           {
             System.out.println("As you're walking on the bridge, a goblin appears.");
             System.out.println("It comically throws a stone and injures your eye.");
             System.out.println("Your HP has been reduced to: " + player.setPlayerHP(player.getPlayerHP() - 20));
             System.out.println("The enchanted shotgun you picked up at the cabin can now be put to use.");
             System.out.println("Do you want to use it to kill the goblin? Yes or no.");
             
             System.out.print(" > ");   
             ans = reader.nextLine().toLowerCase();  
             
             if (ans.equals("yes"))
             {
               System.out.println("You have killed the goblin with a headshot.");
               System.out.println("Your score has been increased by:" + player.getScore()+10 );
               player.setScore(player.getPlayerHP()+10);
               System.out.println("Current HP: " + player.setPlayerHP(player.getPlayerHP()));
               System.out.println("Move to the next location.");
             }
            
             else if (ans.equals("no"))
             {
                System.out.println("You have been killed by the goblin!");
                System.out.println("Your HP has been decreased by: " + (player.getPlayerHP() - 60));
                System.out.println("Current HP: " + player.setPlayerHP(player.getPlayerHP()));
               
               if (player.getPlayerHP() <=40)
               {
                 System.out.println(" You Lost the Fight!");
                 System.out.println("The game has ended.");
                 System.exit(0);
               }
             } 
             
            }
             
             else if (map.currentLocation == map.vampcave)
          {
             System.out.println("This is the moment you've been waiting for."); 
             System.out.println("You are to attack a vampire and collect its blood.");
             System.out.println("For a weapon, you will use an enchanted shotgun." );
             System.out.println("A vampire approaches you with vicious intent.");
             System.out.println("Do you want to kill it and collect its blood? Yes or no?"); 
             
             
             System.out.print(" > ");
             ans = reader.nextLine().toLowerCase();
             
             if (ans.equals("yes"))
             {
               System.out.println("You managed to shoot the vampire and have now collected the blood."); 
               System.out.println("Your score has been increased by:" + player.setPlayerHP(player.getScore()+ 40));
               System.out.println("Move to the next location."); 
             }
            
             else if (ans.equals("no"))
             {
                System.out.println("You were biten by the vampire and turned into a vampire.");
                System.out.println("Your HP has been decreased by: " + (player.getPlayerHP() - 60));
                
                if (player.getPlayerHP() <=40)
                {
                 System.out.println(" You have failed the mission and let your people down.");
                 System.out.println("The game has ended.");
                 System.exit(0);
                }
             }
          }      
           else if (map.currentLocation == map.deathpit)
           {
                System.out.println(" You fell into a pit full of traps.");
                System.out.println("You have died.");
                System.out.println("The game has ended.");
                System.exit(0);
           }
           
           else if (map.currentLocation == map.lab)
           {
             System.out.println("After fighting tirelessly, it is time to give the scientist the blood."); 
             System.out.println("Hand him the blood.");
             System.out.println("Will you give it to him?");
             System.out.println("Yes or no?");
             System.out.print(" > ");
             ans = reader.nextLine().toLowerCase();
             
             if (ans.equals("yes"))
             {
               System.out.println("After various tests, the serum was finally made and will distribued to the public."); 
               System.out.println("Your score has been increased by:" + player.setPlayerHP(player.getScore()+ 40)); 
               
               if (player.getPlayerHP() >=40)
                {
                 System.out.println(" You have won the game!.");
                 System.out.println("The game has ended.");
                 System.exit(0);
                }
             }
            
             else if (ans.equals("no"))
             {
                System.out.println("You denied the public a chance of being safe against vampires.");
                System.out.println("You will be exiled.");
                System.out.println("Your HP has been decreased by: " + (player.getPlayerHP() - 60));
                System.out.println("You have lost the game:(");
                 System.out.println("The game has ended.");
                 System.exit(0);
             }
           }
             
        }
        }             
             
    }
  
 

