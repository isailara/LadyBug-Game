import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends buttons
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int level;
    
    public StartButton (int level)
    {
        this.level = level;
    }
    public void act()
    {
        // Add your action code here.
        buttonpress();
    }
    
    public void buttonpress(){
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
        }
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(10);
            
            if(level==1){
                Greenfoot.setWorld(new Level1());
            }if(level==2){
                Greenfoot.setWorld(new Level2());
            }
            
        }
    }
}
