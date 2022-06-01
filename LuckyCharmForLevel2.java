import greenfoot.*;  

public class LuckyCharmForLevel2 extends LuckyCharm
{
    private boolean start = true;
    private CatNoir catNoir = new CatNoir();
    
    public void act()
    {
        if(catNoir.alive)
        {

            if(start)
            {
                start = false;
                setLocation(599, 300);
                setImage("images/luckycharm.png");
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
