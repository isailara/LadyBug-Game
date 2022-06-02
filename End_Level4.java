import greenfoot.*;
import java.time.*;    

public class End_Level4 extends World
{
    private Instant start;
    private Instant end;
    private static long timeLevel4;
    
    public End_Level4(Instant start,Instant end)
    {    
        super(600, 400, 1);
        this.start = start;
        this.end = end;
        PlayButton playbutton = new PlayButton("FinalPage");
        addObject(playbutton,550,350);
        
        Timer timer = new Timer(start,end);
        timeLevel4=timer.calculateTime();
    }
    
    public static long getTime(){
        return timeLevel4;
    }
}
