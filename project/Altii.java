import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * oameni exact ca noi.
 * 
 * Mitran Ramona
 * 12.01
 */
public class Altii extends Actor
{
    /**
     * Act - do whatever the Altii wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act() 
    {
        setLocation(getX()-3, getY());
            if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}
