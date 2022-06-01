import greenfoot.*;
import javax.swing.JOptionPane;

public class EndButton extends Button
{
    private long totalTime;

    public void act()
    {
        buttonPress();
    }

    public void buttonPress(){
        totalTime=(End_Level1.getTime()+End_Level2.getTime()+End_Level3.getTime()+End_Level4.getTime())/1000;

        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
        }

        if(Greenfoot.mouseClicked(this)){
            String inputValue=JOptionPane.showInputDialog("Please enter your name:");

            Greenfoot.setWorld(new Players(inputValue,totalTime));
        }
    }
}
