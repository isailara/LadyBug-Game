import greenfoot.*;  

public class FinalPage extends World
{
    private int levelRestart;
    
    public FinalPage(int levelRestart)
    {    
        super(600, 400, 1); 
        this.levelRestart = levelRestart;
        prepare();
    }
    
    private void prepare()
    {
        LevelCompleted levelCompleted = new LevelCompleted();
        addObject(levelCompleted,288,150);
        
        RestartButton restartButton = new RestartButton(levelRestart);
        addObject(restartButton,122,303);
        
        EndButton endButton = new EndButton();
        addObject(endButton,312,303);
    
        HomeButton homeButton = new HomeButton();
        addObject(homeButton,500,303);
    }
}
