import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Square here.
 * 
 * @author (Mike Hewitt) 
 * @version (30 June 2016)
 */
public class Square extends Actor
{
    int sideLength;
    public Square(int sideLength, Color color){
        GreenfootImage myImage = new  GreenfootImage(sideLength, sideLength);
        myImage.setColor(color.RED);
        myImage.fillRect(0, 0, myImage.getWidth()-1, myImage.getHeight()-1);
        myImage.setColor(color.GREEN);
        myImage.drawString("Square", 400, 400);
        this.setImage(myImage);
    }

    /**
     * Act - do whatever the Square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // would need to draw a specific rectangle - see how circle is used
    }   

    /**
     * added the following Integermath and operateBinary to check if compiler supports these features
     */
    interface IntegerMath {
        int operation(int a, int b);

    }
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

}

