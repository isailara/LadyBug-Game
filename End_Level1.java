import greenfoot.*;  
import java.time.*;

public class End_Level1 extends World
{
    private Instant start;
    private Instant end;
    private static long timeLevel1;
    
    public End_Level1(Instant start,Instant end)
    {    
        super(600, 400, 1); 
        this.start = start;
        this.end = end;
        
        PlayButton playbutton = new PlayButton("LevelCompletedPage1");
        addObject(playbutton,550,350);
        
        Timer timer = new Timer(start,end);
        timeLevel1 = timer.calculateTime();
    }
    
    public static long getTime(){
        return timeLevel1;
    }
}
