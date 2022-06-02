import greenfoot.*;

public class LuckyCharmForLevel4 extends LuckyCharm
{
    public LuckyCharmForLevel4(){
        GreenfootImage image = getImage();
        image.scale(25,25);
    }

    public void act()
    {
        move(10);

        if(getX()<5 || getX()>590){
            getWorld().removeObject(this);
        }
    }
}
