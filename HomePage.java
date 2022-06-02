import greenfoot.*;

public class HomePage extends World
{
    GreenfootSound music = new GreenfootSound("MiraculousLadybug.mp3");

    public void act(){
        playMusic();
        loopMusic();
    }

    public void playMusic()
    {
        music.play();
    }

    public void loopMusic()
    {
        music.playLoop();
    }

    public void stopMusic()
    {
        music.stop();
    }

    public HomePage()
    {    
        super(600, 400, 1);
        prepare();
    }

    public void prepare(){
        MiraculousLogo ml = new MiraculousLogo();
        addObject(ml,350,200);

        StartButton startbutton = new StartButton();
        addObject(startbutton,170,250);
    }
}
