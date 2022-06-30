import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Puncte.
 * 
 * Mitran Ramona
 * 12.01
 */
public class Bonus extends Actor
{
    private int speed;
    /**
     * Constructor. Nothing to do so far.
     */
        public Bonus()
    {
        speed= Greenfoot.getRandomNumber(3)+1;
    }

    /**
     * Float along the bloodstream, slowly rotating.
     */
        public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);
        
            if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}    
