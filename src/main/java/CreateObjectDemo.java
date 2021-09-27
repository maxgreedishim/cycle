import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }
}
class Point {
    public int x = 0;
    public int y = 0;

    // a constructor!
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}

public class CreateObjectDemo extends JFrame {
    Canvas canvas;

    public Canvas getCanvas() {
        return canvas;
    }

    public CreateObjectDemo() throws HeadlessException {
        super();
        setSize(500,500);

        // setting the title of Frame
        setTitle("This is our basic AWT example");

        // no layout manager
        setLayout(null);
        canvas = new Canvas();
        canvas.setSize(500, 500);
        add(canvas);
        canvas.setVisible(true);
        canvas.setBackground(Color.BLACK);
        BufferStrategy bufferStrategy;
        Graphics g = canvas.getGraphics();
        g.setColor(new Color(255, 0, 0));
        g.fillRect(5,5,50,100);
        canvas.update(g);
       /* bufferStrategy = canvas.getBufferStrategy();
        graphics = bufferStrategy.getDrawGraphics();*/
//        graphics.clearRect(0, 0, width, height);

     /*   graphics.setColor(Color.GREEN);
//        graphics.drawString("This is some text placed in the top left corner.", 5, 15);
        graphics.fillRect(5,5,100,200);
        bufferStrategy.show();
        graphics.dispose();*/
        setVisible(true);
    }

    public static void main(String[] args) {
        CreateObjectDemo app = new CreateObjectDemo();
        Canvas canvas = app.getCanvas();



        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        // set rectTwo's position
        rectTwo.origin = originOne;

        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
}
