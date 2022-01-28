import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/**
 * This is a class used to create a player and its various atributes.
 *
 * @author (Jesse Mwansa)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    public String name;
    public Item item;
    public Map MAP;
    public Game game;
    public int playerHP = 100;
    public int score = 0;
    
    

    /**
     * Constructor for objects of class Player
     */
    public Player (String name, int playerHP)
    {
        this.name = name;
        playerHP = 100;
        
    }

    /**
     * 
     */
    public String getName()
    {
        return name;
    }
    
     public void increaseScore(int amount)
    {
        score += amount;
    }
    
    public void decreaseScore(int amount)
    {
        score -= amount;
    }
    
    public int getScore()
    {
     return score;
    }
    
    public int setScore( int amount)
    {
     return score = amount;
    }    
    
    public void increasePlayerHP(int amount)
    {
        playerHP += amount;
    }
    
    public void decreasePlayerHP(int amount)
    {
        playerHP -= amount;
    }
    
    public int getPlayerHP()
    {
     return playerHP;
    }
    
    public  int setPlayerHP(int amount)
    {
     return playerHP = amount;
    }
    
    
}
