import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private static final int WIDTH_WALL=50;
    private static final int HEIGHT_WALL=60;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        //Greenfoot.playSound("MiraculousLadybug.mp3");
        /*RenaRouge renarouge = new RenaRouge();
        addObject(renarouge,50,150);

        CatNoir catnoir = new CatNoir();
        addObject(catnoir,50,100);*/

        LadyBug ladybug = new LadyBug();

        addObject(ladybug,50,50);

        for(int x=100;x<550;x+=HEIGHT_WALL)
        {
            for(int y=70;y<360;y+=WIDTH_WALL)
            {      
                LuckyCharm luckyCharm = new LuckyCharm();
                addObject(luckyCharm,x,y);
            }
        }

        //LuckyCharm luckyCharm = new LuckyCharm();
        //addObject(luckyCharm,101,50);
        //Counter counter = new Counter();
        //addObject(score,537,26);
        Counter counter = new Counter("Score : ");
        addObject(counter,536,30);
        Papas papas = new Papas();
        addObject(papas,47,170);
        
        if(counter.getValue() == 50){
            Greenfoot.setWorld(new LevelCompletedPage());
        }
    }
}
