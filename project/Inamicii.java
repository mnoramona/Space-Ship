import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ozn-uri.
 * 
 * Mitran Ramona
 * 12.01
 */
public class Inamicii extends Actor
{
    /**
     * Act - do whatever the Inamicii wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act() 
    {
        setLocation(getX()-4, getY());
            if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}
