import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level4 extends World
{

    public Level4()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        LadyBugLevel4 ladybug = new LadyBugLevel4();
        addObject(ladybug,30,350);
        flat flat = new flat();
        addObject(flat,300,392);
    }
}
