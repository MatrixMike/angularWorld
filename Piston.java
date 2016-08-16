import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Piston here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piston extends Actor
{
    World myWorld;
    Hinge hinge;
    int length;
    int width;
    public Piston(World myWorld, Hinge hinge, int length, int width)
    {
        this.myWorld = myWorld;
        this.hinge = hinge;
        this.length = length;
        this.width = width;
        GreenfootImage myImage = new GreenfootImage(length, width);
        myImage.setColor(Color.YELLOW);
        myImage.fillRect(0,0,length - 1, width - 1);
        // have now created a black (?) rectangle 
        setImage(myImage);
        // created the image, now to add it at a given position
        int startX = nX(); // hinge.getX() + 300 - length/2;
        int startY = hinge.getY();
        myWorld.addObject(this, startX, startY); // now placed the middle of a piston 

    }

    /**
     * Act - do whatever the Piston wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Compute position of 'thing' and place it with setLocation 
     */
    public void act() 
    {
        int newX = nX() ; // hinge.getX() + 300 - length/2;
        setLocation(newX, getY());
    }    
    /**
     * nX() factored out a common expression
     * @author  Mike Hewitt
     * @version 1.1
     * @return result of common expression
     */
    public int nX (){
        return hinge.getX() + 300 - length/2;
    }
}
