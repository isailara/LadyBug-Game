import greenfoot.*; 
import java.time.*;

public class Level2 extends World
{
    private int localCounter = 0;
    private int counterLuckyCharm = 0;
    private int dirtCounter = 0;
    private Counter score = new Counter("Score : ");
    private boolean startTime = true;
    private Instant start;
    private Instant end;

    public void act()
    {
        localCounter++;
        counterLuckyCharm++;
        dirtCounter++;

        if(startTime)
        {
            if(localCounter==100)
            {
                localCounter=0;
                dirtCounter=0;
                startTime = false;
                addObject(new Obstacle(), 580, 300);
            }
        }
        else if(localCounter>=40)
        {
            localCounter=0;
            addObject(new Obstacle(), 580, 300);
        }
        if(dirtCounter>=10)
        {
            dirtCounter=0;
            addObject(new Dirt(580, 318), 580, 325);
        }
        if(counterLuckyCharm>=40)
        {
            counterLuckyCharm=0;
            addObject(new LuckyCharmForLevel2(),580,315);
        }
        if(score.getValue()==200){
            end = Instant.now();
            Greenfoot.setWorld(new End_Level2(start,end));
        }
    }

    public Level2()
    {    
        super(600, 400, 1);
        prepare();
        addObject(new CatNoir(), 120, 300);
        addObject(score,536,30);
        addObject(new Dirt(500, 318), 560, 318);
        addObject(new Dirt(400, 318), 560, 318);
        addObject(new Dirt(300, 318), 560, 318);
        addObject(new Dirt(200, 318), 560, 318);
        addObject(new Dirt(100, 318), 560, 318);
    }

    private void prepare()
    {
        start = Instant.now();
        
        Sand sand = new Sand();
        addObject(sand,221,360);
        Sand sand2 = new Sand();
        addObject(sand2,558,360);
    }
}