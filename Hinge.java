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
        rotationRadius = Math.hypot(getX()-centerX, getY()-centerY);
        //The java.lang.Math.hypot(double x, double y) returns sqrt(x2 +y2) without 
        // intermediate overflow or underflow. Special cases: 
        double opposite = getY()-centerY;
        double sinAngle = opposite/rotationRadius;
        angle = Math.asin(sinAngle) * Math.signum(getX()-centerX);  // signum returns the sign * 1.0
    }
    /**
     * Act - do whatever the Hinge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right"))
            angle+=0.1;
        else if(Greenfoot.isKeyDown("left"))
            angle-=0.1;
        int newX = (int)(centerX + rotationRadius* Math.cos(angle));
        int newY = (int)(centerY + rotationRadius * Math.sin(angle));
        setLocation(newX, newY);
        myWorld.showText("Angle = " + Math.abs(Math.round(Math.toDegrees(angle))%360), 150, 350);
        int compression = getX() - centerX;
        myWorld.showText("Compression = " + compression, 350, 350);  // could add a cylinder around the piston 
    }    
}
