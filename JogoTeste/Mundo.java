import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author PHTML266 
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("tema.mp3");
    
    public void started()
    {
    bgMusic.playLoop();
    }
    
    public void stopped()
    {
    bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Amongus amongus = new Amongus();
        addObject(amongus,83,211);
        amongus.setLocation(112,201);
        BYoda bYoda = new BYoda();
        addObject(bYoda,504,292);
        bYoda.setLocation(382,262);
        bYoda.setLocation(759,279);
        amongus.setLocation(126,277);
        amongus.setLocation(127,273);
        bYoda.setLocation(749,276);
        amongus.setLocation(114,257);
        bYoda.setLocation(740,303);
        bYoda.setLocation(740,285);
        amongus.setLocation(128,279);
        bYoda.setLocation(732,296);
        bYoda.setLocation(546,250);
        removeObject(bYoda);
        BYoda bYoda2 = new BYoda();
        addObject(bYoda2,712,283);
        Counter counter = new Counter();
        addObject(counter,744,21);
        Counter counter2 = new Counter();
        addObject(counter2,54,22);
        counter2.setLocation(65,23);
        counter2.setLocation(65,23);
        removeObject(counter2);
        counter.setLocation(774,349);
        bYoda2.setLocation(744,41);
        bYoda2.setLocation(697,296);
        bYoda2.setLocation(743,40);
        bYoda2.setLocation(747,400);
        bYoda2.setLocation(733,39);
        counter.setLocation(608,51);
        bYoda2.setLocation(721,282);
        counter.setLocation(692,40);
        Counter2 counter22 = new Counter2();
        addObject(counter22,92,40);
    }
}
