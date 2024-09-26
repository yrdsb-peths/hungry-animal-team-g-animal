import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int score = 0;
    Label scoreLabel;
    int appleNum = 0;
    int firstApple = 0;
   
    public MyWorld()
    {  
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 350);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    public void gameOver()
    {   
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
    }
    
    public void createApple()
    {   
        if(firstApple == 0)
        {
            Apple apple = new Apple();
            int x = Greenfoot.getRandomNumber(600);
            addObject(apple, x, 0);
            firstApple = 1;
        }
        else
        {
            appleNum = Greenfoot.getRandomNumber(5);
            if(appleNum <= 3)
            {
                Apple apple = new Apple();
                int x = Greenfoot.getRandomNumber(600);
                addObject(apple, x, 0);            
            }
            else
            {
                PoisonApple poisonApple = new PoisonApple();
                int x = Greenfoot.getRandomNumber(600);
                addObject(poisonApple, x, 0);
            }
        }
    } 
}
