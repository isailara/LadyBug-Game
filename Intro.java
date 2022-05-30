import greenfoot.*;

public class Intro extends World
{

    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare(){
        PlayButton playbutton = new PlayButton("IntroLevel1");
        addObject(playbutton,550,350);
    }
}
