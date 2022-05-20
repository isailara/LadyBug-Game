import greenfoot.*;

public class MultiversalSpace extends World
{
    public MultiversalSpace()
    {    
        super(600, 400, 1);
        prepare();
    }

    private void prepare(){
        PlayButton playbutton = new PlayButton();
        addObject(playbutton,550,350);
    }
}
