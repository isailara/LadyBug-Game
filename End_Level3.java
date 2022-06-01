import greenfoot.*;
import java.time.*;   

public class End_Level3 extends World
{
    private Instant start;
    private Instant end;
    private static long timeLevel3;

    public End_Level3(Instant start,Instant end)
    {    
        super(600, 400, 1);
        this.start = start;
        this.end = end;
        PlayButton playbutton = new PlayButton("LevelCompletedPage3");
        addObject(playbutton,550,350);

        Timer timer = new Timer(start,end);
        timeLevel3=timer.calculateTime();
    }

    public static long getTime(){
        return timeLevel3;
    }
}
