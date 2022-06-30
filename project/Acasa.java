import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * E doar spatiu.
 * 
 * Mitran Ramona 
 * 12.01
 */
public class Acasa extends World
{
    /**
     * Constructor for objects of class Acasa.
     * 
     */
    private int score;
    private int time;
    /**
     * Constructor: Set up the staring objects.
     */
    public Acasa()
    {    
        super(1010, 800, 1); 
        setPaintOrder(scor.class);
        time = 3000;
        score = 0;
        showTime();
        showScore(); 
        prepare();  
    }

        public void act()
    {
        
        if (Greenfoot.getRandomNumber(100) < 3)
           {addObject(new Bonus(), 999, Greenfoot.getRandomNumber(800));
            addObject(new Meteorit(), 999, Greenfoot.getRandomNumber(800));
            addObject(new Inamicii(), 999, Greenfoot.getRandomNumber(800));
            addObject(new Altii(), 999, Greenfoot.getRandomNumber(800));
            addObject(new Virus(), 999, Greenfoot.getRandomNumber(800));
            addObject(new AltBonus(), 999, Greenfoot.getRandomNumber(100));
  
        }
        countTime(); 
    }
        
        public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < 0)
        {
            Greenfoot.stop();
            showText("You lose... Loser. Final Score: " + score, 500, 400);
        }
    }
    
    /**
     * Method showScore
     *
     */
       private void showScore()
    {
        showText("score:" + score, 100, 30);
    }

        public void countTime()
    { 
        time--;
        showTime();
        if (time==0)
        {
            showEndMessage();
            Greenfoot.stop();
        }
    }

        private void showTime()
    {
        showText("Time: " + time, 900, 30);
    }

        private void showEndMessage()
    { 
        showText("You WIN!! Final Score: " + score, 500, 400);
    }
     /**
     * Create new floating objects at irregular intervals.
     */

    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        Me me = new Me();
        addObject(me,100,400);
    }
  
}
