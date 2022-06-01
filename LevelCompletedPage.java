import greenfoot.*;  

public class LevelCompletedPage extends World
{
    private int levelRestart;
    private int nextLevel;
        
    public LevelCompletedPage(int levelRestart, int nextLevel)
    {    
        super(600, 400, 1); 
        this.levelRestart = levelRestart;
        this.nextLevel=nextLevel;
        prepare();
    }
    
    private void prepare()
    {
        LevelCompleted levelCompleted = new LevelCompleted();
        addObject(levelCompleted,288,150);
        
        RestartButton restartButton = new RestartButton(levelRestart);
        addObject(restartButton,122,303);
        
        NextLevelButton nextLevelButton = new NextLevelButton(nextLevel);
        addObject(nextLevelButton,312,303);
    
        HomeButton homeButton = new HomeButton();
        addObject(homeButton,500,303);
    }
}
