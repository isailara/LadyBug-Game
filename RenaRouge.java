import greenfoot.*;

public class RenaRouge extends Hero
{
    private boolean isAlive = true;
    private double dropSpeedAxisY=-2;
    private double gravity=0.4;
    private static double SPEED=-2;

    public RenaRouge(){
        setImage("images/renarouge/rrmov2.png");
    }

    public void act()
    {
        moveHeroe();
        checkCollision();
    }
    
    public void checkCollision(){
        if(isTouching(Papa.class)){
            removeTouching(Papa.class);
            Counter score = (Counter) getWorld().getObjects(Counter.class).get(0);
            score.add(10);
        }
        
        if(getY()>getWorld().getHeight()){
            Greenfoot.setWorld(new GameOverPage(3));
        }
    }

    public void moveHeroe(){
        setLocation(getX(),(int)(getY()+dropSpeedAxisY));
        
        if(Greenfoot.isKeyDown("space")){
            dropSpeedAxisY=SPEED;
        }
        
        dropSpeedAxisY+=gravity;
    }

    public boolean isTouchTube(){
        for(Tube tube : getWorld().getObjects(Tube.class)){
            if(Math.abs(tube.getX() - getX()) < 48 ){
                if(Math.abs(tube.getY() + 30 - getY()) > 60){
                    isAlive = false;
                }
            }
        }

        return !isAlive;
    }
}