import greenfoot.*;  


public class Hawkmoth extends Villain
{
    private int xPosition;
    private int horizontalMove=3;
    
    public Hawkmoth()
    {
        setImage("images/hawkmoth/hmmov4.png");
    }
    
    public void act(){
        move();
        checkCollision();
    }
    
    public void move(){
        xPosition=getX();
        
        if((xPosition > 590) || (xPosition < 15)){
            getImage().mirrorHorizontally();
            horizontalMove *= -1;
        }
        
        setLocation(xPosition - horizontalMove,getY());
    }

    public void checkCollision(){
        
        if(isTouching(Ball.class)){
            removeTouching(Ball.class);
            Counter lifevillain = (Counter) getWorld().getObjects(Counter.class).get(1);
            lifevillain.add(-1);
        }
    }
}



