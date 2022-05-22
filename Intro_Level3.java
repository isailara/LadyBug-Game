import greenfoot.*;  

public class Intro_Level3 extends World
{
    public Intro_Level3()
    {    
        super(600, 400, 1); 
        PlayButton playbutton = new PlayButton(3);
        addObject(playbutton,550,350);
    }
}
