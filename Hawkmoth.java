import greenfoot.*;  

public class Hawkmoth extends Villain
{
    private static final int MAX_COUNTER_IMAGE = 10;
    private int xPosition;
    private int horizontalMove=3;
    private int frame=0;
    private GreenfootImage []images;
    private int counterImage;
    private int currentImage;
    public Hawkmoth()
    {
        images = new GreenfootImage[3];
        images[0]= new GreenfootImage("images/hawkmoth/hmmov4.png");
        images[1]= new GreenfootImage("images/hawkmoth/hmmov5.png");
        images[2]= new GreenfootImage("images/hawkmoth/hmmov6.png");
        
        setImage("images/hawkmoth/hmmov4.png");
    }
    
    public void act(){
        changeMovement();
        move();
        checkCollision();
    }
    
    public void move(){
        xPosition=getX();
        
        if((xPosition > 590) || (xPosition < 15)){
            images[0].mirrorHorizontally();
            images[1].mirrorHorizontally();
            images[2].mirrorHorizontally();
            horizontalMove *= -1;
        }
        
        setLocation(xPosition - horizontalMove,getY());
    }
    private void changeMovement()
    {
        counterImage++;
        if(counterImage==MAX_COUNTER_IMAGE)
        {
            counterImage=0;
            setImage(images[currentImage]);
            currentImage = (currentImage+1)%images.length;
        }
    }
    public void checkCollision(){
        
        if(isTouching(LuckyCharmForLevel4.class)){
            removeTouching(LuckyCharmForLevel4.class);
            Counter lifevillain = (Counter) getWorld().getObjects(Counter.class).get(1);
            lifevillain.add(-1);
        }
    }
}



