import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public int n = 10;
    public int temp = n;
    public int temp1 = n;
    public int temp2 = n;
    public int temp3 = n;
    public int temp4 = n;
    public int temp5 = n;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act(){
    temp--;
    //dialogo 1
    if(Greenfoot.isKeyDown("enter") && (temp < 1)){
        setBackground(new GreenfootImage("1.png"));
        temp1--;
    }
    //dialogo 2
    if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
        setBackground(new GreenfootImage("2.png"));
        temp2--;
    }
    //dialogo 3
    if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
        setBackground(new GreenfootImage("3.png"));
        temp3--;
    }
    //dialogo 4
    if (Greenfoot.isKeyDown("enter") && (temp3 < 1)){
        setBackground(new GreenfootImage("4.png"));
        temp4--;
    }
    //dialogo 5
    if (Greenfoot.isKeyDown("enter") && (temp4 < 1)){
        setBackground(new GreenfootImage("5.png"));
        temp5--;
    }
    //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")&& (temp5 < 1)){
        Mundo world = new Mundo();
        Greenfoot.setWorld(world);
    }
    }
}
