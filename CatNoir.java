import greenfoot.*;

public class CatNoir extends Hero
{
    private int counter = 0;
    private int jumpCounter = 0;
    private int minCounter = 0;
    private boolean isOnGround = true;
    private boolean leftFoot = true;
    private boolean pressingJump = false;
    private boolean start = true;
    private boolean pressed;
    private boolean down;
    static public boolean alive = true;
    private int jumpSpeed;
    
    public CatNoir()
    {
        setImage("images/catnoir/catmov2.png");
        setLocation(120,300);
        setRotation(270);
    }
    
    public void act() 
    {
        moveHeroe();
        checkCollision();
    }
    
    public void moveHeroe(){
        if(start)
        {
            alive=true;
            start=false;
        }
        if (pressed && (Greenfoot.mouseDragEnded(null) || Greenfoot.mouseClicked(null))){
            pressed = false;
        }
        if (!pressed && Greenfoot.mousePressed(null)) {
            pressed= true;
        }
        if(alive)
        {
            if(isOnGround)
            {
                counter++;
                jumpCounter=0;
                minCounter=0;
                if(counter>=3)
                {
                    counter=0;
                    if(leftFoot)
                    {
                        leftFoot=false;
                    }
                    else
                    {
                        leftFoot=true;
                    }
                }
                    setLocation(120,300);
                    if(jumpButton() && !pressingJump)
                    {
                        move(5);
                        jumpSpeed = 5;
                        isOnGround=false;
                        pressingJump = true;
                    }
                    else
                    {
                        if(!jumpButton())
                        {
                            pressingJump=false;
                        }
                        if(leftFoot)
                        {
                            setImage("images/catnoir/catmov1.png");
                        }
                        else
                        {
                            setImage("images/catnoir/catmov3.png");
                        }
                    }
            }
            else
            {
                minCounter++;
                if((pressingJump&&jumpButton() && jumpCounter<=12) || minCounter<8)
                {
                    jumpCounter++;
                    move(6);
                }
                else
                {
                    jumpCounter = 20;
                    jumpSpeed--;
                    move(jumpSpeed);
                    if(getY()>=295)
                    {
                        setLocation(120,300);
                        isOnGround=true;
                    }
                }
            }
            if(getOneIntersectingObject(Obstacle.class)!=null)
            {
                
                alive = false;
            }
            else
            {
                alive=true;
            }
        }
        else
        {
            Greenfoot.setWorld(new GameOverPage(2));
        }
    }
    
    
    public void checkCollision(){
        if(isTouching(LuckyCharmForLevel2.class)){
            removeTouching(LuckyCharmForLevel2.class);
            Counter score = (Counter) getWorld().getObjects(Counter.class).get(0);
            score.add(5);
        }
    }
    
    private boolean jumpButton()
    {
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space")||Greenfoot.mousePressed(null))
        {
            return true;
        }
        if(pressed){return true;}
        return false;
    }
}
