import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Food
{
    public Apple()
    {
        super(2);
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
            world.gameOver();
            world.removeObject(this);
        }
    }
    public void destroy()
    {
        
    }
}
