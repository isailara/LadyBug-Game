import greenfoot.*;  

public class Level4 extends World
{
    private Counter lifeHero = new Counter("LadyBug's life : ");
    private Counter lifevVillain = new Counter("Hawkmoth's life : ");
    
    public void act(){
        if(lifeHero.getValue()==0){
            Greenfoot.setWorld(new GameOverPage(4));
        }
        if((lifevVillain.getValue()==0)){
            Greenfoot.setWorld(new End_Level4());
        }
    }

    public Level4()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        LadyBugLevel4 ladyBug = new LadyBugLevel4();
        addObject(ladyBug,30,355);
        Floor floor = new Floor();
        addObject(floor,300,392);
        Hawkmoth hawkMoth = new Hawkmoth();
        addObject(hawkMoth,570,355);

        addObject(lifeHero, 100, 30);
        lifeHero.setValue(10);
        
        addObject(lifevVillain, 500, 30);
        lifevVillain.setValue(20);
        
    }
}
