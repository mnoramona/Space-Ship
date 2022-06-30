import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Beeper.
 * 
 * Mitran Ramona
 * 12.01
 */
public class Bum extends Actor
{
    /**
     * Act - do whatever the Bum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act() 
    {
            move(13); 
            if (isTouching(Altii.class))
        {
            removeTouching(Altii.class);
            removeTouching(Bum.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(-70); 
        }
        
            if (isTouching(Virus.class))
        {
            removeTouching(Virus.class);
            removeTouching(Bum.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(10);
        }
        
            if (isTouching(Inamicii.class))
        {
            removeTouching(Inamicii.class);
            removeTouching(Bum.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(10);
        }
        
            if (isTouching(Meteorit.class))
        {
            removeTouching(Meteorit.class);
            removeTouching(Bum.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(10);
        }
        
            if (isTouching(Bonus.class))
        {
            removeTouching(Bum.class);
            Acasa space = (Acasa)getWorld();
        }    
        
            if (isTouching(AltBonus.class))
        {
            removeTouching(Bum.class);
            Acasa space = (Acasa)getWorld();
        }  
        
            if (getX() > 700)
        {
            getWorld().removeObject(this);
        }
    }
}
