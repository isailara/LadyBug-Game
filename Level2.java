import greenfoot.*;  

public class Level2 extends World
{

    private int localCounter = 0;
    private int counterLuckyCharm = 0;
    private int difCounter = 1;
    private int dirtCounter = 0;
    private Counter counter = new Counter("Score : ");
    private int worldSpeed = 45;
    private int rand;
    static public int difficulty = 0;
    private boolean startTime = true;
    
    public void act()
    {
        localCounter++;
        counterLuckyCharm++;
        difCounter++;
        dirtCounter++;
        
        if(startTime)
        {
            difficulty=0;
            if(localCounter>=100)
            {
                localCounter=0;
                dirtCounter=0;
                rand=Greenfoot.getRandomNumber(15);
                startTime = false;
                addObject(new Obstacle(), 580, 300);
            }
        }
        else if(localCounter>=(40+rand)-(int)(1.7*(double)difficulty))
        {
            localCounter=0;
            addObject(new Obstacle(), 580, 300);
        }
        if(dirtCounter>=10-(int)(1.2*(double)difficulty))
        {
            dirtCounter=0;
            addObject(new Dirt(580, 318), 580, 325);
        }
        if(counterLuckyCharm>=(40+rand)-(int)(1.5*(double)difficulty)){
            counterLuckyCharm=0;
            addObject(new LuckyCharmForLevel2(),580,315);
        }
        if(difCounter>=500)
        {
            difficulty++;
            if(difficulty>7)
            {
                difficulty=7;
            }
            difCounter=0;
        }if(counter.getValue()==200){
            Greenfoot.setWorld(new End_Level2());
        }
    }
    
    public Level2()
    {    
        super(600, 400, 1);
        prepare();
        addObject(new CatNoir(), 120, 300);
        addObject(counter, 550, 30);
        addObject(new Dirt(550, 318), 560, 318);
        addObject(new Dirt(500, 318), 560, 318);
        addObject(new Dirt(450, 318), 560, 318);
        addObject(new Dirt(400, 318), 560, 318);
        addObject(new Dirt(350, 318), 560, 318);
        addObject(new Dirt(300, 318), 560, 318);
        addObject(new Dirt(250, 318), 560, 318);
        addObject(new Dirt(200, 318), 560, 318);
        addObject(new Dirt(150, 318), 560, 318);
        addObject(new Dirt(100, 318), 560, 318);
        addObject(new Dirt(50, 318), 560, 318);
        Greenfoot.setSpeed(worldSpeed);
        setPaintOrder( Level2.class, Dirt.class, Obstacle.class, LuckyCharmForLevel2.class, CatNoir.class, Counter.class);
    }

    private void prepare()
    {
        Sand sand = new Sand();
        addObject(sand,221,360);
        Sand sand2 = new Sand();
        addObject(sand2,558,360);
    }
}
