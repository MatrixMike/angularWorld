import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Class Square was created to test my understanding of creating an object (in Java)
 * The square is used as the cylinder block in the piston demo
 * 
 * @author Mike Hewitt
 * @version 30 June 2016
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
        miketest = operateBinary(90,70,addition);
        GreenfootImage myImage = new  GreenfootImage(miketest, sideLength);
        myImage.setColor(color.RED);
        myImage.fillRect(0, 0, myImage.getWidth()-1, myImage.getHeight()-1);
        myImage.setColor(color.GREEN);
        //myImage.drawString("Square", 400, 400);
        // miketest = myTest.operateBinary(300,100,addition);
        miketest = operateBinary(200,100,addition);
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

    /**
     * operateBinary() related to lambda operation
     * 
     * @param  a one of two integers to operate upon
     * @param  b one of two integers to operate upon
     * @param  op the ....
     * @author  Mike Hewitt
     * @version 1.1
     * @return the result of the action of the operation on the two inputs
     */
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
/**
 * setting up and using pair of lambdas
 * 
 */
    public static void Mikemain() {
        int miketest;
        Square myTest = new Square(10 ,Color.GREEN );  
        IntegerMath addition = (a,b) -> a + b ;
        IntegerMath subtraction = (a,b) -> a - b ;
        miketest = myTest.operateBinary(40,2,addition);
        //    System.out.println("40 + 2 = ", + myTest.operateBinary(40,2,addition));
    }

    public static void Mikemain2() {
    }
}

