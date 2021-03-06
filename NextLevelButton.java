import greenfoot.*;

public class NextLevelButton extends Button
{
    private int level;
    
    public NextLevelButton(int level)
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
                case 1:
                    Greenfoot.setWorld(new Intro_Level1());
                    break;
                case 2:
                    Greenfoot.setWorld(new Intro_Level2());
                    break;
                case 3:
                    Greenfoot.setWorld(new Intro_Level3());
                    break;
                case 4:
                    Greenfoot.setWorld(new Intro_Level4());
                    break;
            }
        }
    }
}
