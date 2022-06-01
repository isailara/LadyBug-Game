import greenfoot.*;  

public class Dirt extends Item
{
    private int counter = 0;
    private int x;
    private int y;
    private CatNoir catNoir = new CatNoir();

    public void act()
    {
        if(catNoir.alive)
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
                setImage("images/dirt3.png");
            }
            else
            {
                setImage("images/dirt2.png");
            }
        }
        else
        {
            if(Greenfoot.getRandomNumber(2)==0)
            {
                setImage("images/dirt4.png");
            }
            else
            {
                setImage("images/dirt1.png");
            }
        }
    }

    public Dirt(int pX, int pY)
    {
        x=pX;
        y=pY;
    }
}
