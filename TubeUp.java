import greenfoot.*;

public class TubeUp extends Actor
{
    public TubeUp(){
        GreenfootImage image = getImage();
        image.scale(500, 900);
    }
    
    public void act()
    {
        // Add your action code here.
        //setLocation(getX()-4,getY());
        setLocation(getX() - 1, getY());
         if(getX() <= 1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
        }
    }
}
