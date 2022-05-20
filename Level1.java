import greenfoot.*;

public class Level1 extends World
{
    private static final int WIDTH_WALL=28;
    private static final int HEIGHT_WALL=28;
    private static final int HEIGHT_LUCKYCHARM=60;

    public Level1()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        LadyBug ladybug = new LadyBug();

        addObject(ladybug,30,30);

        Wall wall = new Wall();
        
        for(int y=0;y<320;y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,70,y);
            wall = new Wall();
            addObject(wall,230,y);
            wall = new Wall();
            addObject(wall,390,y);
        }
        
        for(int y=80;y<450;y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,150,y);
            wall = new Wall();
            addObject(wall,310,y);
        }
        
        for(int y=0;y<200;y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,470,y);
        }
        
        for(int y=0;y<150;y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,550,y);
        }
 
        
        for(int y=300;y<450;y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,470,y);
        }
        
        for(int y=250;y<450;y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,550,y);
        }
        
        Counter counter = new Counter("Score : ");
        addObject(counter,536,30);
        
        LuckyCharm luckyCharm = new LuckyCharm();
        
        for(int y=85;y<380;y+=HEIGHT_LUCKYCHARM)
        {
            luckyCharm = new LuckyCharm();
            addObject(luckyCharm,30,y);
            luckyCharm = new LuckyCharm();
            addObject(luckyCharm,190,y);
            luckyCharm = new LuckyCharm();
            addObject(luckyCharm,350,y);
        }
        
        for(int y=30;y<380;y+=HEIGHT_LUCKYCHARM)
        {
            luckyCharm = new LuckyCharm();
            addObject(luckyCharm,110,y+20);
            luckyCharm = new LuckyCharm();
            addObject(luckyCharm,270,y+20);
            luckyCharm = new LuckyCharm();
            addObject(luckyCharm,430,y+20);
        }
        
        for(int y=45;y<380;y+=HEIGHT_LUCKYCHARM)
        {
            luckyCharm = new LuckyCharm();
            addObject(luckyCharm,510,y+20);
        }
    }
}
