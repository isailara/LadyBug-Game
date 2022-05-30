import greenfoot.*;
import java.util.*;

public class Players extends World
{
    private List<String> namePlayers= new LinkedList<String>();

    public Players(String userInput)
    {    
        super(600, 400,1);
        String text;
        int y = 150;
 
        namePlayers.add(userInput);

        Label userLabel1 = new Label("Players: ",50);
        addObject(userLabel1,280,50);

        for(int i=0;i<namePlayers.size();i++){
            text = namePlayers.get(i);

            Label label = new Label(text,45);
            addObject(label,280,y);
            y=y+30;
        }
        prepare();
    }
    
    private void prepare()
    {
        TikkiIcon tikkiIcon = new TikkiIcon();
        addObject(tikkiIcon,68,66);
        LadyAndCatIcon ladyAndCatIcon = new LadyAndCatIcon();
        addObject(ladyAndCatIcon,537,286);
        HomeButton homeButton = new HomeButton();
        addObject(homeButton,499,61);
    }
}
