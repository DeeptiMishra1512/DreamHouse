package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window1;
    private Square window2;
    private Square mainDoor;
    private Square garageDoor;
    private Square garageWall;
    private Triangle roof1;
    private Triangle roof2;
    private Circle sun;
    private Circle cloud1;
    private Circle cloud2;
    private Triangle tree1;
    private Triangle tree2;
    private Square driveway;
    private Square yard;
    private Square entryway1;
    private Square entryway2;
    private Square entryway3;
    private Triangle shrubBranch;
    private Circle shrubHead;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        //Main House Features

        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window1 = new Square();
        window1.changeColor("black");
        window1.moveHorizontal(15);
        window1.moveVertical(100);
        window1.makeVisible();

        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();

        mainDoor = new Square();
        mainDoor.changeColor("black");
        mainDoor.moveHorizontal(40);
        mainDoor.moveVertical(150);
        mainDoor.makeVisible();

        roof1 = new Triangle();
        roof1.changeSize(50, 140);
        roof1.moveHorizontal(60);
        roof1.moveVertical(70);
        roof1.makeVisible();
    //Garage Features

        garageWall = new Square();
        garageWall.changeColor("red");
        garageWall.moveHorizontal(100);
        garageWall.moveVertical(100);
        garageWall.changeSize(80);
        garageWall.makeVisible();

        garageDoor = new Square();
        garageDoor.changeColor("black");
        garageDoor.moveHorizontal(110);
        garageDoor.moveVertical(130);
        garageDoor.changeSize(50);
        garageDoor.makeVisible();

        roof2 = new Triangle();
        roof2.changeSize(50, 110);
        roof2.moveHorizontal(150);
        roof2.moveVertical(90);
        roof2.makeVisible();

     //Landscaping and scenery Description
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();

        //Clouds
        cloud1 = new Circle();
        cloud1.changeColor("gray");
        cloud1.moveHorizontal(50);
        cloud1.moveVertical(-10);
        cloud1.changeSize(30);
        cloud1.makeVisible();

        cloud1 = new Circle();
        cloud1.changeColor("gray");
        cloud1.moveHorizontal(25);
        cloud1.moveVertical(-10);
        cloud1.changeSize(40);
        cloud1.makeVisible();

        cloud1 = new Circle();
        cloud1.changeColor("gray");
        cloud1.moveHorizontal(10);
        cloud1.moveVertical(-10);
        cloud1.changeSize(35);
        cloud1.makeVisible();

        //Cloud2
        cloud2 = new Circle();
        cloud2.changeColor("gray");
        cloud2.moveHorizontal(120);
        cloud2.moveVertical(-25);
        cloud2.changeSize(30);
        cloud2.makeVisible();

        cloud2 = new Circle();
        cloud2.changeColor("gray");
        cloud2.moveHorizontal(90);
        cloud2.moveVertical(-20);
        cloud2.changeSize(40);
        cloud2.makeVisible();

        cloud2 = new Circle();
        cloud2.changeColor("gray");
        cloud2.moveHorizontal(120);
        cloud2.moveVertical(-10);
        cloud2.changeSize(35);
        cloud2.makeVisible();

        //Yard
        yard = new Square();
        yard.changeColor("green");
        yard.moveHorizontal(-60);
        yard.moveVertical(180);
        yard.changeSize(100);
        yard.makeVisible();

        //grass area
        yard = new Square();
        yard.changeColor("green");
        yard.moveHorizontal(40);
        yard.moveVertical(180);
        yard.changeSize(80);
        yard.makeVisible();

        yard = new Square();
        yard.changeColor("green");
        yard.moveHorizontal(160);
        yard.moveVertical(180);
        yard.changeSize(80);
        yard.makeVisible();



        //Driveway structure
        driveway = new Square();
        driveway.changeColor("dark gray");
        driveway.moveHorizontal(100);
        driveway.moveVertical(180);
        driveway.changeSize(80);
        driveway.makeVisible();


        entryway1 = new Square();
        entryway1.changeColor("dark gray");
        entryway1.moveHorizontal(40);
        entryway1.moveVertical(180);
        entryway1.changeSize(30);
        entryway1.makeVisible();

        entryway2 = new Square();
        entryway2.changeColor("dark gray");
        entryway2.moveHorizontal(40);
        entryway2.moveVertical(200);
        entryway2.changeSize(30);
        entryway2.makeVisible();

        entryway3 = new Square();
        entryway3.changeColor("dark gray");
        entryway3.moveHorizontal(70);
        entryway3.moveVertical(200);
        entryway3.changeSize(30);
        entryway3.makeVisible();

        //shrub
        shrubBranch = new Triangle();
        shrubBranch.changeColor("orange");
        shrubBranch.changeSize(30, 30);
        shrubBranch.moveHorizontal(95);
        shrubBranch.moveVertical(200);
        shrubBranch.makeVisible();


        shrubHead = new Circle();
        shrubHead.changeColor("green");
        shrubHead.moveHorizontal(110);
        shrubHead.moveVertical(135);
        shrubHead.changeSize(30);
        shrubHead.makeVisible();


        //Trees
        tree1 = new Triangle();
        tree1.changeColor("orange");
        tree1.changeSize(120, 60);
        tree1.moveHorizontal(-20);
        tree1.moveVertical(120);
        tree1.makeVisible();

        tree2 = new Triangle();
        tree2.changeColor("yellow");
        tree2.changeSize(100, 30);
        tree2.moveHorizontal(5);
        tree2.moveVertical(150);
        tree2.makeVisible();


    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            window2.changeColor("white");
            roof1.changeColor("dark gray");
            roof2.changeColor("dark gray");
            tree1.changeColor("orange");
            tree2.changeColor("green");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window1.changeColor("black");
            window2.changeColor("black");
            roof1.changeColor("dark gray");
            roof2.changeColor("dark gray");
            tree1.changeColor("orange");
            tree2.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
