import greenfoot.*;

public class PlayButton extends Button
{
    private String level;
    
    public PlayButton(String level)
    {    
        super(); 
        this.level = level;
        buttonPress();
    }
    
    public void buttonPress(){
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(10);
            
            switch(level){
                case "HomePage":
                    Greenfoot.setWorld(new HomePage());
                    break;
                case "LevelCompletedPage1":
                    Greenfoot.setWorld(new LevelCompletedPage(1,2));
                    break;
                case "IntroLevel1":
                    Greenfoot.setWorld(new Intro_Level1());
                    break;
                case"Level1":
                    Greenfoot.setWorld(new Level1());
                    break;
                case "LevelCompletedPage2":
                    Greenfoot.setWorld(new LevelCompletedPage(2,3));
                    break;
                case "Level2":
                    Greenfoot.setWorld(new Level2());
                    break;
                case "LevelCompletedPage3":
                   Greenfoot.setWorld(new LevelCompletedPage(3,4));
                    break;
                case "Level3":
                    Greenfoot.setWorld(new Level3());
                    break;
                case "LevelCompletedPage4":
                    Greenfoot.setWorld(new LevelCompletedPage(4,0));
                    break;
                case "Level4":
                    Greenfoot.setWorld(new Level4());
                    break;
            }
        }
    }
}
