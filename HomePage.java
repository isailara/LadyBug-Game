import greenfoot.*;

public class HomePage extends World
{
    public HomePage()
    {    
        super(600, 400, 1);
        prepare();
    }
    
    public void prepare(){
        //TODO: add music Greenfoot.playSound("MiraculousLadybug.mp3");
        MiraculousLogo ml = new MiraculousLogo();
        addObject(ml,350,200);

        StartButton startbutton = new StartButton();
        addObject(startbutton,170,250);
    }
}
