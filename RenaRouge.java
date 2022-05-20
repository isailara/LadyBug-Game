import greenfoot.*;

public class RenaRouge extends Hero
{
    double dy=0;
    double g=2;

    public RenaRouge(){
        setImage("images/renarouge/rrmov2.png");
    }
    
    public void act()
    {
        moveHeroe();
    }
    
    public void moveHeroe(){
        setLocation(getX(),(int)(getY()+dy));
        if(Greenfoot.isKeyDown("space")==true){
            dy=-10;
        }
        dy=dy+g;
    }
}
