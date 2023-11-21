import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Amongus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amongus extends Actor
{
    public int caminhardoelemento = 3;
    private GreenfootSound cut = new GreenfootSound("cut.wav");
    private int sTimer = 0;
    /**
     * Act - do whatever the Amongus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    
    public void move()
    {
        move(1);
    }
    
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            setRotation(direction * 90);
        }
    }
    
    public void movimento(){
            if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - caminhardoelemento);
            setRotation(270);
            setImage(new GreenfootImage("amongus.png"));
            }
            if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + caminhardoelemento);
            setRotation(90);
            setImage(new GreenfootImage("amongus.png"));
            }
            if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - caminhardoelemento, this.getY());
            setRotation(360);
            setImage(new GreenfootImage("amongusl.png"));
            }
            if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + caminhardoelemento, this.getY());
            setRotation(360);
            setImage(new GreenfootImage("amongus.png"));
            }
            if (Greenfoot.isKeyDown("n") && (sTimer == 0)){
            getWorld().addObject(new slash(), getX() + 140, getY() - 30);
            
            sTimer ++;
            cut.play();
            }
            else{
                if (!Greenfoot.isKeyDown("n")){
                sTimer = 0;
                }
            }
    }
}
