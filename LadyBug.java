import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LadyBug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LadyBug extends heroes
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
    
    //private LadyBug ladybug;
    
    /*private GreenfootImage []images;
    private GreenfootImage []images2;
    private GreenfootImage []images3;
    private GreenfootImage []images4;*/
    
    /**
     * Act - do whatever the LadyBug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public LadyBug()
    {
        /*images = new GreenfootImage[3];
        images[0]= new GreenfootImage("images/mov1.png");
        images[1]= new GreenfootImage("images/mov2.png");
        images[2]= new GreenfootImage("images/mov3.png");
        
        images2 = new GreenfootImage[3];
        images2[0]= new GreenfootImage("images/mov1a.png");
        images2[1]= new GreenfootImage("images/mov2a.png");
        images2[2]= new GreenfootImage("images/mov3a.png");
            
        images3 = new GreenfootImage[3];
        images3[0]= new GreenfootImage("images/abmov1.png");
        images3[1]= new GreenfootImage("images/abmov2.png");
        images3[2]= new GreenfootImage("images/abmov3.png");
        
        images4 = new GreenfootImage[3];
        images4[0]= new GreenfootImage("images/arrmov1.png");
        images4[1]= new GreenfootImage("images/arrmov2.png");
        images4[2]= new GreenfootImage("images/arrmov3.png");*/
        //this.ladybug=ladybug;
        setImage("images/mov2.png");
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
        
        //setLocation(currentX + offsetX, currentY+offsetY);
        
        /*Actor wall = getWallOnTheWay();
        
        if(wall==null)
        {
            setLocation(currentX + offsetX, currentY+offsetY);
        }*/
    }
    
    private void handleDirection()
    {
        standingStill=true;
        if(Greenfoot.isKeyDown("UP"))
        {
            movementLadyBugUp();
            offsetX=0;
            offsetY=-OFFSET;
            direction=UP;
            lastButtonPress=1;
            standingStill=false;
        }else if(Greenfoot.isKeyDown("DOWN")){
            movementLadyBugDown();
            offsetX=0;
            offsetY=OFFSET;
            direction=DOWN;
            lastButtonPress=2;
            standingStill=false;
        }else if(Greenfoot.isKeyDown("RIGHT"))
        {
            movementLadyBugLeftRight();
            offsetY=0;
            offsetX=OFFSET;
            direction=RIGHT;
            lastButtonPress=3;
            standingStill=false;
        }else if(Greenfoot.isKeyDown("LEFT")){
            movementLadyBugLeftRight();
            getImage().mirrorHorizontally();
            offsetY=0;
            offsetX=-OFFSET;
            direction=LEFT;
            lastButtonPress=4;
            standingStill=false;
        }
        
        if(standingStill==true){
            if(lastButtonPress==1){
                setImage("images/abmov2.png");
            }else if(lastButtonPress==2){
                setImage("images/arrmov2.png");
            }else if(lastButtonPress==3){
                setImage("images/mov2.png");
            }else if(lastButtonPress==4){
                setImage("images/mov2.png");
                getImage().mirrorHorizontally();
            }
        }  
    }
    
    private void movementLadyBugLeftRight()
    {
        if(frame==0){
            setImage("images/mov1.png");
        }else if(frame==1){
            setImage("images/mov2.png");
        }else if(frame==2){
            setImage("images/mov3.png");
            frame=0;
            return;
        }
        frame++;
        /*counterImage++;
        if(counterImage==MAX_COUNTER_IMAGE)
        {
            counterImage=0;
            setImage(images[currentImage]);
            currentImage = (currentImage+1)%images.length;
        }*/
    }
    
    private void movementLadyBugUp()
    {
        if(frame==0){
            setImage("images/abmov1.png");
        }else if(frame==1){
            setImage("images/abmov2.png");
        }else if(frame==2){
            setImage("images/abmov3.png");
            frame=0;
            return;
        }
        frame++;
        /*counterImage++;
        if(counterImage==MAX_COUNTER_IMAGE)
        {
            counterImage=0;
            setImage(images3[currentImage]);
            currentImage = (currentImage+1)%images3.length;
        }*/
    }
    
    private void movementLadyBugDown()
    {
        if(frame==0){
            setImage("images/arrmov1.png");
        }else if(frame==1){
            setImage("images/arrmov2.png");
        }else if(frame==2){
            setImage("images/arrmov3.png");
            frame=0;
            return;
        }
        frame++;
        /*counterImage++;
        if(counterImage==MAX_COUNTER_IMAGE)
        {
            counterImage=0;
            setImage(images4[currentImage]);
            currentImage = (currentImage+1)%images4.length;
        }*/
    }
}
