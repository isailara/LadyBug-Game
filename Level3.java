import greenfoot.*;
import java.time.*;  

public class Level3 extends World
{
    private RenaRouge renaRouge = new RenaRouge();
    private static int WIDTH_PAPA = 300;
    private Counter score = new Counter("Score : ");
    private Instant start;
    private Instant end;
    
    public void act(){
        if(score.getValue()==50){
            end = Instant.now();
            
            Greenfoot.setWorld(new End_Level3(start,end));
        }
        touchingTube();
    }
    
    public Level3()
    {    
        super(600, 400, 1,false); 
        prepare();
    }

    private void prepare()
    {
        start = Instant.now();
        
        addObject(renaRouge,75,195);
        
        addObject(new Tube(), 300, 150);
        addObject(new Tube(), 600, 150);

        Papa papa = new Papa();
        
        for(int x=450;x<10000;x+=WIDTH_PAPA)
        {
            papa = new Papa();
            addObject(papa,x,Greenfoot.getRandomNumber(250)+50);
        }
        
        addObject(score,536,30);
    }
    
    public void touchingTube(){
        if(renaRouge.isTouchTube()){
            Greenfoot.setWorld(new GameOverPage(3));
        }
    }
}
