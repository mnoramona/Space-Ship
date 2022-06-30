import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Eu.
 * 
 * Mitran Ramona
 * 12.01
 */
public class Me extends Actor
{
  private int score;
    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() 
  {
        checkKeyPress();
  }
   
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
  {
      checkKeys();
        checkCollision();
         if(Greenfoot.isKeyDown("left")){
            move(-5);
    }
    
        if(Greenfoot.isKeyDown("right")){
            move(5);
    }
    
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() -5);
    }
    
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() +5);
    }       
  }
   
    public void checkKeys()
  {
        if(Greenfoot.isKeyDown("space"))
        {
            shoot();
        }
  }
  
    public void shoot()
  {
        getWorld()  .addObject(new Bum(), getX(), getY());
  }

    private void checkCollision()
  {
        if (isTouching(Bonus.class))
        {
            removeTouching(Bonus.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(20);
        }
        
        if (isTouching(AltBonus.class))
        {
            removeTouching(AltBonus.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(200);
        }
        
        if (isTouching(Meteorit.class))
        {
            removeTouching(Meteorit.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(-50);
        }
        
           if (isTouching(Virus.class))
        {
            removeTouching(Virus.class);
            Acasa space = (Acasa)getWorld();
            space.addScore(-20);
        }
        
    }
}
