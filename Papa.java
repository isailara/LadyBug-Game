import greenfoot.*;

public class Papa extends Item
{
    public void act()
    {
        setLocation(getX() - 1, getY());
        if(getX() <= 1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
        }
    }
}
