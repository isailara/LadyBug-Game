import greenfoot.*;  

public class Intro_Level1 extends World
{
    public Intro_Level1()
    {    
        super(600, 400, 1); 
        PlayButton playbutton = new PlayButton(1);
        addObject(playbutton,550,350);
    }
}
