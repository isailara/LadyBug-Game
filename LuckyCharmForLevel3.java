import greenfoot.*;

public class LuckyCharmForLevel3 extends LuckyCharm
{
    public LuckyCharmForLevel3(){
        GreenfootImage image = getImage();
        image.scale(45,45);
    }
    
    public void act()
    {
        setLocation(getX() - 1, getY());
        if(getX() <= 1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
        }
    }
}
