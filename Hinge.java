import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Hinge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hinge extends Circle
{
    World myWorld;
    int centerX;
    int centerY;
    double angle;
    double rotationRadius;
    public Hinge(int imageRadius, Color color, int centerX, int centerY)
    {
        super(imageRadius, color);
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void addedToWorld(World w){
        myWorld = w;
        double opposite = getY()-centerY;
        rotationRadius = Math.hypot(getX()-centerX, opposite);
        //The java.lang.Math.hypot(double x, double y) returns sqrt(x2 +y2) without 
        // intermediate overflow or underflow. Special cases: 

        double sinAngle = opposite/rotationRadius;
        angle = Math.asin(sinAngle) * Math.signum(getX()-centerX);  // signum returns the sign * 1.0
    }
    /**
     * Act - do whatever the Hinge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static double angleChange = 0.05;
    private static int yTextCoord = 350;
    public void act() 
    {

        if(Greenfoot.isKeyDown("right"))
            angle+=angleChange;  // change looks small here but is about 4 degrees - Are we using radians etc? 
        else if(Greenfoot.isKeyDown("left"))
            angle-=angleChange;
        int newX = (int)(centerX + rotationRadius * Math.cos(angle));
        int newY = (int)(centerY + rotationRadius * Math.sin(angle));
        setLocation(newX, newY);  // found the circle end of the Hinge
        myWorld.showText("Angle = " + Math.abs(Math.round(Math.toDegrees(angle))%360), 150, yTextCoord);
        int compression = getX() - centerX;
        myWorld.showText("Compression = " + compression, 350, yTextCoord); 
         //      myWorld.drawString("text" ,50,25);

        // System.out.println("pressed");
        // could add a cylinder around the piston 
    }    
}
