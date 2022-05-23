import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ball extends Actor
{
    
    public void act()
    {
        move(10);
    
        if(getX()<5 || getX()>590){
            getWorld().removeObject(this);
        }
    }
}
