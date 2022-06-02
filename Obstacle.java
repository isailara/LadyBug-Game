import greenfoot.*;  

public class Obstacle extends Item
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
                if(Greenfoot.getRandomNumber(4)==0)
                {
                    setImage("images/casaBob.png");
                }
                else if(Greenfoot.getRandomNumber(4)==1)
                {
                    setImage("images/Krusty-Krab.png");
                    setLocation(599, 294);
                }
                else if(Greenfoot.getRandomNumber(4)==2)
                {
                    setImage("images/Patricio.png");
                }
                else if(Greenfoot.getRandomNumber(4)==3)
                {
                    setImage("images/SirenoMan.png");
                }
                else
                {
                    setImage("images/Perlita.png");
                }
            }
            move(-6);
           
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
    }
}
