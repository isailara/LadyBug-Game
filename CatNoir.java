import greenfoot.*;

public class CatNoir extends Hero
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

    public CatNoir(){
        setImage("images/catnoir/catmov2.png");
    }

    public void act()
    {
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
                setImage("images/catnoir/catabmov2.png");
            }else if(lastButtonPress==2){
                setImage("images/catnoir/catarrmov2.png");
            }else if(lastButtonPress==3){
                setImage("images/catnoir/catmov2.png");
            }else if(lastButtonPress==4){
                setImage("images/catnoir/catmov2.png");
                getImage().mirrorHorizontally();
            }
        }  
    }

    private void movementLeftRight()
    {
        if(frame==0){
            setImage("images/catnoir/catmov1.png");
        }else if(frame==1){
            setImage("images/catnoir/catmov2.png");
        }else if(frame==2){
            setImage("images/catnoir/catmov3.png");
            frame=0;
            return;
        }
        frame++;
    }

    private void movementUp()
    {
        if(frame==0){
            setImage("images/catnoir/catabmov1.png");
        }else if(frame==1){
            setImage("images/catnoir/catabmov2.png");
        }else if(frame==2){
            setImage("images/catnoir/catabmov3.png");
            frame=0;
            return;
        }
        frame++;
    }

    private void movementDown()
    {
        if(frame==0){
            setImage("images/catnoir/catarrmov1.png");
        }else if(frame==1){
            setImage("images/catnoir/catarrmov2.png");
        }else if(frame==2){
            setImage("images/catnoir/catarrmov3.png");
            frame=0;
            return;
        }
        frame++;
    }
}
