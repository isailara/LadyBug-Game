import greenfoot.*;

public class RestartButton extends Button
{
    private int level;
    
    public RestartButton(int level){
        this.level = level;
    }
    
    public void buttonPress(){
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(10);
            switch(level){
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
