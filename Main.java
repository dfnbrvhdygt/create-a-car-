
import javax.swing.*;
import java.awt.*;

class Main {


    public static void main(String[] args) {

        JFrame f = new JFrame(); // creating empty JFrame
        // creating two RV instances by using constructor
        RV vehicle1 = new RV(150, 150,Color.orange );
        RV vehicle2 = new RV(200, 200, Color.blue);
        f.setSize(600,400); // set the jFame size
        f.setTitle("Code Assignment 1");
        f.add(vehicle1); // to add our object to JFrame
        f.add(vehicle2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        // to output this two vehicle objects
        System.out.println("vehicle1's\n" + vehicle1.toString());
        System.out.println("vehicle2's\n" + vehicle2.toString());

        //create the objects by user input and output them
        vehicle1.input();
        vehicle2.input();
    }
}