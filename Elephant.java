import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D"))
        {
            move(3);
        }
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
        else if(isTouching(PoisonApple.class))
        {
            removeTouching(PoisonApple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.decreaseScore();
        }
        else if(isTouching(Cherries.class))
        {
            removeTouching(Cherries.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            world.increaseScore();
            world.increaseScore();
        }
    }
    }
