import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RenaRouge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RenaRouge extends heroes
{
    private static final int MAX_COUNTER_IMAGE = 10;
    private static final int MAX_COUNTER_MOVEMENT = 3;
    private static final int OFFSET = 10;
    
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int RIGHT = 2;
    private static final int LEFT = 3;
    
    private int currentImage;
    private int counterImage;
    private int offsetX=0;
    private int offsetY=0;
    private int counterMovement;
    private int direction;
    private int frame=0;
    private int lastButtonPress;
    private boolean standingStill;
    
    /**
     * Act - do whatever the CatNoir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public RenaRouge(){
        setImage("images/renarouge/rrmov2.png");
    }
    
    public void act()
    {
        // Add your action code here.
        moveHeroe();
    }
    
    public void moveHeroe()
    {
        counterMovement++;
        
        if(counterMovement < MAX_COUNTER_MOVEMENT){
            return;
        }
        
        int currentX = getX();
        int currentY = getY();
        
        counterMovement=0;
        handleDirection();
        
        setLocation(currentX + offsetX, currentY+offsetY);
        
        offsetY=0;
        offsetX=0;
    }
    
    private void handleDirection()
    {
        standingStill=true;
        if(Greenfoot.isKeyDown("UP"))
        {
            movementUp();
            offsetX=0;
            offsetY=-OFFSET;
            direction=UP;
            lastButtonPress=1;
            standingStill=false;
        }else if(Greenfoot.isKeyDown("DOWN")){
            movementDown();
            offsetX=0;
            offsetY=OFFSET;
            direction=DOWN;
            lastButtonPress=2;
            standingStill=false;
        }else if(Greenfoot.isKeyDown("RIGHT"))
        {
            movementLeftRight();
            offsetY=0;
            offsetX=OFFSET;
            direction=RIGHT;
            lastButtonPress=3;
            standingStill=false;
        }else if(Greenfoot.isKeyDown("LEFT")){
            movementLeftRight();
            getImage().mirrorHorizontally();
            offsetY=0;
            offsetX=-OFFSET;
            direction=LEFT;
            lastButtonPress=4;
            standingStill=false;
        }
        
        if(standingStill==true){
            if(lastButtonPress==1){
                setImage("images/renarouge/rrabmov2.png");
            }else if(lastButtonPress==2){
                setImage("images/renarouge/rrarrmov2.png");
            }else if(lastButtonPress==3){
                setImage("images/renarouge/rrmov2.png");
            }else if(lastButtonPress==4){
                setImage("images/renarouge/rrmov2.png");
                getImage().mirrorHorizontally();
            }
        }  
    }
    
    private void movementLeftRight()
    {
        if(frame==0){
            setImage("images/renarouge/rrmov1.png");
        }else if(frame==1){
            setImage("images/renarouge/rrmov2.png");
        }else if(frame==2){
            setImage("images/renarouge/rrmov3.png");
            frame=0;
            return;
        }
        frame++;
    }
    
    private void movementUp()
    {
        if(frame==0){
            setImage("images/renarouge/rrabmov1.png");
        }else if(frame==1){
            setImage("images/renarouge/rrabmov2.png");
        }else if(frame==2){
            setImage("images/renarouge/rrabmov3.png");
            frame=0;
            return;
        }
        frame++;
    }
    
    private void movementDown()
    {
        if(frame==0){
            setImage("images/renarouge/rrarrmov1.png");
        }else if(frame==1){
            setImage("images/renarouge/rrarrmov2.png");
        }else if(frame==2){
            setImage("images/renarouge/rrarrmov3.png");
            frame=0;
            return;
        }
        frame++;
    }
}
