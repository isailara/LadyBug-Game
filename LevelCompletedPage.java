import greenfoot.*;  

public class LevelCompletedPage extends World
{
    private int level;
    
    public LevelCompletedPage(int level)
    {    
        super(600, 400, 1); 
        this.level = level;
        prepare();
    }
    
    private void prepare()
    {
        LevelCompleted levelCompleted = new LevelCompleted();
        addObject(levelCompleted,288,150);
        RestartButton restartButton = new RestartButton(level);
        addObject(restartButton,122,303);
        NextLevelButton nextLevel = new NextLevelButton();
        addObject(nextLevel,312,303);
        HomeButton homeButton = new HomeButton();
        addObject(homeButton,500,303);
    }
}
