import greenfoot.*;
import javax.swing.JOptionPane;

public class EndButton extends Button
{
    public void act()
    {
        buttonPress();
    }
    
    public void buttonPress(){
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
        }
        
        if(Greenfoot.mouseClicked(this)){
            String inputValue=JOptionPane.showInputDialog("Please enter your name:");
            
            Greenfoot.setWorld(new Players(inputValue));
        }
    }
}
