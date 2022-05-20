import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{

    /**
     * Constructor for objects of class Home.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    public void prepare(){
        //Greenfoot.playSound("MiraculousLadybug.mp3");
        MiraculousLogo ml = new MiraculousLogo();
        addObject(ml,350,200);
        
        StartButton startbutton = new StartButton(1);
        addObject(startbutton,170,250);
        //startButton.setLocation(174,321);
        //startButton.setLocation(172,322);
        //miraculousLogo.setLocation(377,99);
        //miraculousLogo.setLocation(411,355);
        //miraculousLogo.setLocation(398,357);
    }
}
