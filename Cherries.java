import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherries extends Food
{
    public Cherries()
    {
        super(4);
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY());
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        

        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.createApple();
        }
    }
}
