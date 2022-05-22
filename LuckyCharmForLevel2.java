import greenfoot.*;  

public class LuckyCharmForLevel2 extends LuckyCharm
{
    private boolean start = true;
    private int counter = 0;
        
    public void act()
    {
        if(CatNoir.alive)
        {
            counter++;
            if(start)
            {
                start = false;
                setLocation(599, 300);
                if(Greenfoot.getRandomNumber(1)==0 || Greenfoot.getRandomNumber(6)==0 || Greenfoot.getRandomNumber(20)==0)
                {
                    setImage("images/luckycharm.png");
                }
            }
            move(-6-Level2.difficulty);
           
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
        else
        {
            Greenfoot.delay(10);
            Greenfoot.setWorld(new GameOverPage(2));
        }
    }
    
    /*private int counter = 0;
    private int x;
    private int y;
    public void act()
    {
        if(CatNoir.alive)
        {
            counter++;
            move(-6-Level2.difficulty);
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
    }
    protected void addedToWorld(World world)
    {
        setLocation(x,y);
        int rand = Greenfoot.getRandomNumber(2);
        setImage("images/dirt1.png");
        if(Greenfoot.getRandomNumber(25)==0)
        {
            if(Greenfoot.getRandomNumber(2)==0)
            {
                setImage("images/luckycharm.png");
            }
            else
            {
                setImage("images/luckycharm.png");
            }
        }
        else
        {
            if(Greenfoot.getRandomNumber(2)==0)
            {
                setImage("images/luckycharm.png");
            }
            else
            {
                setImage("images/luckycharm.png");
            }
        }
    }
    public LuckyCharmForLevel2(int pX, int pY)
    {
        x=pX;
        y=pY;
    }*/
}
