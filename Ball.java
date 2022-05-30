import greenfoot.*;

public class Ball extends Item
{
    
    public void act()
    {
        move(10);
    
        if(getX()<5 || getX()>590){
            getWorld().removeObject(this);
        }
    }
}