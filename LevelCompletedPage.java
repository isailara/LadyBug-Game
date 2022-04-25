import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelCompletedPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelCompletedPage extends World
{

    /**
     * Constructor for objects of class LevelCompletedPage.
     * 
     */
    public LevelCompletedPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelCompleted levelCompleted = new LevelCompleted();
        addObject(levelCompleted,288,150);
        StartButton startButton = new StartButton();
        addObject(startButton,419,305);
        removeObject(startButton);
        RestartButton restartButton = new RestartButton();
        addObject(restartButton,122,303);
        NextLevelButton nextLevel = new NextLevelButton();
        addObject(nextLevel,312,303);
        HomeButton homeButton = new HomeButton();
        addObject(homeButton,500,303);
    }
}
