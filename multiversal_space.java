import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class multiversal_space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class multiversal_space extends World
{

    /**
     * Constructor for objects of class multiversal_space.
     * 
     */
    public multiversal_space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare(){
        StartButton startbutton = new StartButton(2);
        addObject(startbutton,500,350);
    }
}
