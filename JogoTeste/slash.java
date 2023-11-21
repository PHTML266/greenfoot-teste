import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class slash extends Actor
{
    GifImage Gif = new GifImage("slash.gif");
    SimpleTimer shootslash = new SimpleTimer();
    int slashinterval = 500;
    public int temp = 20;
    /**
     * Act - do whatever the slash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(Gif.getCurrentImage());
        acertaralvo();
        if (shootslash.millisElapsed()>slashinterval){
            getWorld().removeObject(this);
        }
    }
    
    public void acertaralvo(){
        
        Actor b = getOneIntersectingObject(BYoda.class);
        temp--;
        if (b != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            if (temp < 1){
                v1 world = new v1();
                Greenfoot.setWorld(world);
                getWorld().removeObject(b);
                getWorld().removeObject(this);
            }
        }
    }
}
