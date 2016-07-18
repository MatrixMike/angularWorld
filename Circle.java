import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Actor
{ 
    int radius;
    public Circle(int radius, Color color){
        GreenfootImage myImage = new GreenfootImage(radius,radius);  
        // create a GFI with name myImage to be a rectangular space with sides of radius { Y not diameter?}
        // then select a color and fill Oval {circle if height and width are same
        myImage.setColor(color);
        myImage.fillOval(0, 0, myImage.getWidth()-1, myImage.getHeight()-1);
        // we created an image and now we set it as the image for this actor
        // we could have a picture from a file but we chose to generate one with geometry
        this.setImage(myImage);
    }
    /**
     * Act - do whatever the Circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
