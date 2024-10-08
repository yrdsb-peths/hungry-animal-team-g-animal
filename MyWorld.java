import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound backgroundSound = new GreenfootSound("Background.noise.mp3");
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

        backgroundSound.play();
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
            appleNum = Greenfoot.getRandomNumber(10);
            if(appleNum <= 7)
            {
                Apple apple = new Apple();
                int x = Greenfoot.getRandomNumber(600);
                addObject(apple, x, 0);            
            }
            else if(appleNum == 8)
            {
                Cherries cherries = new Cherries();
                int x = Greenfoot.getRandomNumber(600);
                addObject(cherries, x, 0);
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
