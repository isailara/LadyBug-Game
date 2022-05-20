import greenfoot.*;  

public class LevelCompletedPage extends World
{
    public LevelCompletedPage()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
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
