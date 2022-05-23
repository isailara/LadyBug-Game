import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class hawkmoth1 extends Villain
{
    int xPos;
    int yPos;
    int horzMove=3;
    int vertMove=3;
    private int frame=0;
    private GreenfootImage []images;
    private int counterMouth;
    private static final int MAX_COUNTER_MOUTH = 10;
    private int currentImage;
    public hawkmoth1()
    {
        setImage("images/hawkmoth/hmmov4.png");
        images = new GreenfootImage[2];
        images[0]= new GreenfootImage("images/hawkmoth/hmmov5.png");
        images[1]= new GreenfootImage("images/hawkmoth/hmmov6.png");
    }
    
    public void act(){
        openCloseMouth();
        Move();
        checkCollision();
    }
    
    public void Move(){
        xPos=getX();
        
        if((xPos > 590) || (xPos < 15)){
        //if(getX()<getWorld().getWidth())
            getImage().mirrorHorizontally();
            horzMove *= -1;
        }
        
        setLocation(xPos - horzMove,350);
        /*
        if(getX()>getWorld().getWidth()){
        
        } 
        */
    }
    private void openCloseMouth()
    {
        counterMouth++;

        if(counterMouth==MAX_COUNTER_MOUTH)
        {
            counterMouth=0;
            setImage(images[currentImage]);
            currentImage = (currentImage+1)%images.length;
        }
    }
    public void checkCollision(){
        
        if(isTouching(ball.class)){
            removeTouching(ball.class);
            Level4.Lifev.add(-1);
        }
    }
}


