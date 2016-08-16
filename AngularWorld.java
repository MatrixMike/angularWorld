import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class AngularWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AngularWorld extends World
{

    /**
     * Constructor for objects of class AngularWorld.
     * 
     */
    public AngularWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        // IntegerMath addition = (a,b) -> a + b ;
        // int miketest = operateBinary(90,70,addition);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world. Important action using Connector - taking two objects AND world 
     */
    public void prepare()    // was private
    {
        Circle bigCircle = new Circle(150, Color.BLUE);
        addObject(bigCircle, 100, 200);

        Square bigSquare = new Square( 120, Color.RED);
        addObject(bigSquare, 400, 200);

        // now create a black dot size 30 
        Hinge hinge = new Hinge(30, Color.BLACK, bigCircle.getX(), bigCircle.getY());
        // getX : Return the x-coordinate of the actor's current location. 
        // The value returned is the horizontal index of the actor's cell in the world.
        addObject(hinge, 50, 200);  // add object at given co-ords

        Piston piston = new Piston(this, hinge, 100, 20);
        Connector c = new Connector(this, hinge, piston);
    }
}



