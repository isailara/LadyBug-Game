import greenfoot.*;

public class RenaRouge extends Hero
{
    private boolean isAlive = true;
    private double dy=-2;
    private double gravity=0.5;
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
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(10);
        }
        
        if(isTouchTube()){
            isAlive = false;
        }
        
        if(getY()>getWorld().getHeight()){
            Greenfoot.stop();
        }
        
        if(!isAlive){
            //Greenfoot.setWorld(new GameOverPage(3));
            Greenfoot.stop();
        }
    }

    public void moveHeroe(){
        setLocation(getX(),(int)(getY()+dy));
        
        if(Greenfoot.isKeyDown("space")){
            dy=SPEED;
        }
        
        dy=dy+gravity;
    }

    public boolean isTouchTube(){
        for(Tube tube : getWorld().getObjects(Tube.class)){
            if(Math.abs(tube.getX() - getX()) < 60 ){
                if(Math.abs(tube.getY() + 30 - getY()) > 37){
                    isAlive = false;
                }
            }
        }
        return !isAlive;
    }
}
