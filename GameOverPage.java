import greenfoot.*;  

public class GameOverPage extends World
{
    private int level;
    
    public GameOverPage(int level)
    {    
        super(600, 400, 1); 
        this.level = level;
        prepare();
    }
    
    public void prepare(){
        RestartButton restartButton = new RestartButton(level);
        addObject(restartButton,122,303);
        HomeButton homeButton = new HomeButton();
        addObject(homeButton,500,303);
        GameOver gameOver = new GameOver();
        addObject(gameOver,305,159);
    }
}
