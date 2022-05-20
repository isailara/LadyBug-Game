import greenfoot.*; 

public class Level3 extends World
{
    public Level3()
    {    
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        RenaRouge renaRouge = new RenaRouge();
        addObject(renaRouge,75,195);
    }
}
