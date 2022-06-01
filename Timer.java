import greenfoot.*; 
import java.time.*;

public class Timer extends Actor
{
    private Instant start;
    private Instant end;
    private long timeElapsed;
    
    public Timer(Instant start, Instant end){
        this.start = start;
        this.end = end;
    }
    
    public long calculateTime()
    {    
        timeElapsed = Duration.between(start,end).toMillis();
        
        return timeElapsed;
    }
}
