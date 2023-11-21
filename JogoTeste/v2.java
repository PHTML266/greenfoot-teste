import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class v2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class v2 extends World
{

    /**
     * Constructor for objects of class v2.
     * 
     */
    public v2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public int temp = 20;
    public int temp1 = 20;
    
    public void act(){
        temp--;
        if (Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("Creditos.gif"));
            temp1--;
        }
        if(Greenfoot.isKeyDown("enter")&&(temp1 < 1)){
            menu world = new menu();
            Greenfoot.setWorld(world);
        }
    }
}
