import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PoisonApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PoisonApple extends Food
{
    public PoisonApple()
    {
        super(3);
    }
    /**
     * Act - do whatever the PoisonApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
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
