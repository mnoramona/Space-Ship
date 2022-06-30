import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pietre.
 * 
 * Mitran Ramona
 * 12.01
 */
public class Meteorit extends Actor
{
    /**
     * Act - do whatever the Meteorit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act() 
    {
        setLocation(getX()-4, getY());
        turn(5);
            if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}
