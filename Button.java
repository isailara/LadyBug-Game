import greenfoot.*;

public abstract class Button extends Actor
{
    /**
     * Act - do whatever the buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        buttonPress();
    }
    
    public abstract void buttonPress();
}
