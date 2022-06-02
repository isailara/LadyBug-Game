import greenfoot.*;
import java.time.*;  

public class End_Level2 extends World
{
    private Instant start;
    private Instant end;
    private static long timeLevel2;
    
    public End_Level2(Instant start,Instant end)
    {    
        super(600, 400, 1); 
        this.start = start;
        this.end = end;
        
        PlayButton playbutton = new PlayButton("LevelCompletedPage2");
        addObject(playbutton,550,350);
        
        Timer timer = new Timer(start,end);
        timeLevel2=timer.calculateTime();
    }
    
    public static long getTime(){
        return timeLevel2;
    }
}

