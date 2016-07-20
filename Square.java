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
    // Square myTest = new Square();   
    // IntegerMath addition = (a,b) -> a + b;

    public Square(int sideLength, Color color){
           int miketest;
          //    Square myTest = new Square(10 ,Color.GREEN );  
                IntegerMath addition = (a,b) -> a + b ;
        GreenfootImage myImage = new  GreenfootImage(sideLength, sideLength);
        myImage.setColor(color.RED);
        myImage.fillRect(0, 0, myImage.getWidth()-1, myImage.getHeight()-1);
        myImage.setColor(color.GREEN);
        myImage.drawString("Square", 400, 400);
          // miketest = myTest.operateBinary(300,100,addition);
          miketest = operateBinary(300,100,addition);
                      myImage.drawString("Square", 400, miketest);
              
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
        Mikemain();

    }   

    /**
     * added the following Integermath and operateBinary to check if compiler supports these features
     * 20July2016
     * looks like I added a lambda in Mikemain
     */
    interface IntegerMath {
        int operation(int a, int b);

    }
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void Mikemain() {
        int miketest;
        Square myTest = new Square(10 ,Color.GREEN );  
        IntegerMath addition = (a,b) -> a + b ;
                IntegerMath subtraction = (a,b) -> a - b ;
                miketest = myTest.operateBinary(40,2,addition);
            //    System.out.println("40 + 2 = ", + myTest.operateBinary(40,2,addition));
    }
}

