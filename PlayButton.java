import greenfoot.*;

public class PlayButton extends Button
{
    private int level;
    
    public PlayButton(int level)
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
                case 0:
                    Greenfoot.setWorld(new HomePage());
                    break;
                case 15:
                    Greenfoot.setWorld(new LevelCompletedPage(1,2));
                    break;
                case 11:
                    Greenfoot.setWorld(new Intro_Level1());
                    break;
                case 1:
                    Greenfoot.setWorld(new Level1());
                    break;
                case 25:
                    Greenfoot.setWorld(new LevelCompletedPage(2,3));
                    break;
                case 2:
                    Greenfoot.setWorld(new Level2());
                    break;
                case 35:
                   Greenfoot.setWorld(new LevelCompletedPage(3,4));
                    break;
                case 3:
                    Greenfoot.setWorld(new Level3());
                    break;
                case 45:
                    Greenfoot.setWorld(new LevelCompletedPage(4,0));
                    break;
                case 4:
                    Greenfoot.setWorld(new Level4());
                    break;
            }
        }
    }
}
