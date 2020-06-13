import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Raihan) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    prepare();
}
/**
 * Prepare the world for the start of the program.
 * That is: create the initial objects and add them to the world.
 */
private void prepare()
{
    aligator aligator = new aligator();
    addObject(aligator,159,131);
buah buah = new buah();
addObject(buah,385,91);
buah buah2 = new buah();
addObject(buah2,385,195);
buah buah3 = new buah();
addObject(buah3,224,307);
buah buah4 = new buah();
addObject(buah4,699,405);
buah buah5 = new buah();
addObject(buah5,548,426);
buah buah6 = new buah();
addObject(buah6,586,212);
buah buah7 = new buah();
addObject(buah7,127,517);
buah buah8 = new buah();
addObject(buah8,325,491);
buah buah9 = new buah();
addObject(buah9,701,80);
buah buah10 = new buah();
addObject(buah10,511,561);
buah buah11 = new buah();
addObject(buah11,88,397);
buah buah12 = new buah();
addObject(buah12,697,292);
}
}
