import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Food extends Actor implements Destructable
{
    int speed;

    public Food(int speed)
    {
        this.speed = speed;
    }
    
    public void destory()
    {
        getWorld().removeObject(this);
    }
}
