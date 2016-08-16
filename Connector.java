import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Connector takes as parameters the World and two Actors {all objects} 
 * 
 * @author Mike Hewitt (some mods and explicit understanding by me) 
 * @version 16 August 2016
 */
public class Connector extends Actor
{
    Actor hinge;
    Actor piston;
    int hingeX;
    int hingeY;
    int pistonX;
    int pistonY;
    GreenfootImage myImage;
    /**
     * Act - do whatever the Connector wants to do. This method is called whenever
     * the 'Act' or 'Run' buttons get pressed in the environment.
     * 
     * @param w what is world
     * @param h what is Actor
     * @param p what is Actor
     */
    public Connector (World w, Actor h, Actor p)
    {
        hinge = h;
        piston = p;
        setImage(new GreenfootImage(1,1));
        w.addObject(this,0,0);
    }
    public void act() 
    {
        if(hinge.getWorld()!=null && piston.getWorld()!=null)
        {
            hingeX = hinge.getX();  //why some variables declared here and some outside act()
            hingeY = hinge.getY();
            pistonX = piston.getX()-piston.getImage().getWidth()/2;
            pistonY = piston.getY();
            int myX = (hingeX + pistonX)/2;
            int myY = (hingeY + pistonY)/2;
            setLocation(myX, myY);
            turnTowards(hingeX, hingeY);
            int d = (int)Math.sqrt(Math.pow((pistonX-hingeX),2)+Math.pow((hingeY-pistonY),2));
            setImage(new GreenfootImage(d,20));
            myImage = getImage();   // 
            myImage.setColor(Color.GREEN);
            myImage.fillRect(0,0,d,myImage.getHeight());
            
        }
    }    
}
