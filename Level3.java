import greenfoot.*; 

public class Level3 extends World
{
    private static int WIDTH_PAPA = 300;
    private Counter counter = new Counter("Score : ");
    
    public void act(){
        if(counter.getValue()==50){
            Greenfoot.stop();
            //Greenfoot.setWorld(new LevelCompletedPage());
        }
    }
    
    public Level3()
    {    
        super(600, 400, 1,false); 
        prepare();
    }

    private void prepare()
    {
        RenaRouge renaRouge = new RenaRouge();
        addObject(renaRouge,75,195);
        
        addObject(new Tube(), 300, 150);
        addObject(new Tube(), 600, 150);

        Papa papa = new Papa();
        
        for(int x=450;x<10000;x+=WIDTH_PAPA)
        {
            papa = new Papa();
            addObject(papa,x,Greenfoot.getRandomNumber(250)+50);
        }
        
        addObject(counter,536,30);
    }
}
