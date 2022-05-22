import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LadyBugLevel4 extends Hero
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
    private int speed=0;
    private int aceleration=2;

    public LadyBugLevel4()
    {
        setImage("images/ladybug/mov2.png");
    }
    
    public void act()
    {
        moveHeroe();
        checkFall();
        checkCollision();
        
    }
    
    public void checkCollision(){
        if(isTouching(LuckyCharm.class)){
            removeTouching(LuckyCharm.class);
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(5);
        }
        if(isTouching(Papa.class)){
            removeTouching(Papa.class);
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(10);
        }
    }

    public void moveHeroe()
    {
        if(Greenfoot.isKeyDown("up")){
            jump();
        }
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
        
        Actor wall = getOneIntersectingObject(Wall.class);
        if(wall!=null){
            setLocation(currentX + offsetX, currentY+offsetY);
        }
    }
    
    
    private void handleDirection()
    {
        standingStill=true;
        if(Greenfoot.isKeyDown("RIGHT"))
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
                setImage("images/ladybug/abmov2.png");
            }else if(lastButtonPress==2){
                setImage("images/ladybug/arrmov2.png");
            }else if(lastButtonPress==3){
                setImage("images/ladybug/mov2.png");
            }else if(lastButtonPress==4){
                setImage("images/ladybug/mov2.png");
                getImage().mirrorHorizontally();
            }
        }  
    }
    
    public void jump(){
        speed= -5;
        fall();
    }
    public void checkFall(){
        if(onFlat()){
            speed=0;
        }else{
            fall();
        }
    }
    
    public boolean onFlat(){ 
        Actor flat = getOneIntersectingObject(flat.class);
        return flat != null;
    }
    
    public void fall(){
        setLocation ( getX(), getY() + speed);
        speed = speed + aceleration;
    }
    private void movementLeftRight()
    {
        if(frame==0){
            setImage("images/ladybug/mov1.png");
        }else if(frame==1){
            setImage("images/ladybug/mov2.png");
        }else if(frame==2){
            setImage("images/ladybug/mov3.png");
            frame=0;
            return;
        }
        frame++;
    }
}
