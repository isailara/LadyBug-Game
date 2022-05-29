import greenfoot.*;

public class Tube extends Actor
{
    public Tube(){
        GreenfootImage image = getImage();
        image.scale(500, 900);
    }

    public void act() 
    {
        setLocation(getX() - 1, getY());
        if(getX() <= 1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
        }
    } 
}
