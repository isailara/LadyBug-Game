import greenfoot.*;  

public class LuckyCharmForLevel2 extends LuckyCharm
{
    private boolean start = true;
    private int counter = 0;
    private CatNoir catNoir = new CatNoir();
    
    public void act()
    {
        if(catNoir.alive)
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
            move(-6);
           
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
}
