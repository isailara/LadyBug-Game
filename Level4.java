import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level4 extends World
{

    public static Counter Life = new Counter();
    public static Counter Lifev = new Counter();
    
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
        hawkmoth1 hawkmoth1 = new hawkmoth1();
        addObject(hawkmoth1,492,356);

        addObject(Life, 50, 20);
        Life.setValue(10);
        addObject(Lifev, 500, 20);
        Lifev.setValue(20);
        
    }
}
