import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

class RV extends JComponent{
    // JComponent is an abstract class to override the methods we extend it
// create private member of class
    private String body = "car";
    private Color color= Color.RED; // the vehicles color is red by default
    private int x;
    private int y;
    // ceate 3 constructor with three parameter
    public RV( int x, int y, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    // create toString method
    public String toString() {
        return "RV{" +
                "body=" + body +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    // this methos draws two Rectangles in a row and 2 circle below as wheels
    // this method is working like show()
    protected void paintComponent(Graphics g) {
        // to use the Graphics2D nice methods we cast the parent class obj into the subclass obj
        Graphics2D g2d = (Graphics2D) g;
        // locate each part of object based on object location
        // we can use also double as a paramerter for 2D classes
        Rectangle2D.Double r1 = new Rectangle2D.Double(x+50, y+30, 60, 50);
        g2d.setColor(this.color); //to set the regtangels color
        // to draw r1 shape
        g2d.fill(r1);
        Rectangle2D.Double r2 = new Rectangle2D.Double(x, y+60, 120, 70);
        // to draw r2 shape
        g2d.fill(r2);
        // locate wheels of object based on object location
        Ellipse2D.Double e = new Ellipse2D.Double(x+40, y+120, 20, 20);
        g2d.setColor(Color.BLACK);
        g2d.fill(e);
        // locate and draw second wheel
        Ellipse2D.Double e2 = new Ellipse2D.Double(x+80, y+120, 20, 20);
        g2d.fill(e2);
    }
    // this methos is used for declare the class member by using user input
    public  void input(){
        String s;
        int red, yellow, blue;
        s = JOptionPane.showInputDialog("enter the value of x");
        this.x = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("enter the value of y");
        this.y = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("enter hat's red intensity");
        red = Integer.parseInt(s);
        s =JOptionPane.showInputDialog("enter hat's yellow intensity");
        yellow = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("enter hat's blue intensity");
        blue = Integer.parseInt(s);
        this.color = new Color(red, yellow, blue);

    }
}