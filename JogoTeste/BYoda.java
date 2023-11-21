import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BYoda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BYoda extends Actor
{
    public int caminhardoelemento = 2;
    private int sTimer = 0;
    /**
     * Act - do whatever the BYoda wants to do. This method is called whenever
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
        if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - caminhardoelemento);
        setRotation(270);
        setImage(new GreenfootImage("baby_yoda.png"));
        }
        else if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + caminhardoelemento);
        setRotation(90);
        setImage(new GreenfootImage("baby_yoda.png"));
        }
        else if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - caminhardoelemento, this.getY());
        setRotation(360);
        setImage(new GreenfootImage("baby_yoda.png"));
        }
        else if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + caminhardoelemento, this.getY());
        setRotation(360);
        setImage(new GreenfootImage("baby_yodal.png"));
        }
        else if (Greenfoot.isKeyDown("f")){
        getWorld().addObject(new hadouken(), getX() - 100, getY() +30);
        
        }
    }
}