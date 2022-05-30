import greenfoot.*;  

public class End_Level1 extends World
{
    public End_Level1()
    {    
        super(600, 400, 1); 
        PlayButton playbutton = new PlayButton("LevelCompletedPage1");
        addObject(playbutton,550,350);
    }
}
