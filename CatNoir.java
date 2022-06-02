import greenfoot.*;

public class CatNoir extends Hero
{
    private int counter = 0;
    private int jumpCounter = 0;
    private boolean isOnGround = true;
    private boolean leftFoot = true;
    private boolean start = true;
    public static boolean alive = true;
    private int jumpHeight;

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
        if(alive)
        {
            if(isOnGround)
            {
                counter++;
                jumpCounter=0;
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
                if(jumpButton()) 
                {
                    jumpHeight = 7;
                    isOnGround=false;
                }
                else
                {
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
                if((jumpButton() && jumpCounter<=12)) 
                {
                    jumpCounter++;
                    move(7);
                }
                else
                {
                    jumpCounter = 20;
                    jumpHeight--;
                    move(jumpHeight);
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
            score.add(10);
        }
    }

    private boolean jumpButton()
    {
        if(Greenfoot.isKeyDown("space")) 
        {
            return true;
        }
        return false;
    }
}