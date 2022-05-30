import greenfoot.*;  

public class Intro_Level2 extends World
{
    public Intro_Level2()
    {    
        super(600, 400, 1); 
        PlayButton playbutton = new PlayButton("Level2");
        addObject(playbutton,550,350);
    }
}
