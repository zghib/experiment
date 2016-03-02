package experiment.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomColor extends Frame implements ActionListener {

    public RandomColor() {
        setLayout(new FlowLayout());

        Button btn = new Button("Change Background");
        btn.addActionListener(this);
        add(btn);

        setTitle("Generating Random Colors");
        setSize(300, 300);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();

        int redValue = rand.nextInt(255);
        int greenValue = rand.nextInt(255);
        int blueValue = rand.nextInt(255);
        System.out.println("Red: " + redValue + ", Green: " + greenValue + ", Blue: " + blueValue);

        Color clr = new Color(redValue, greenValue, blueValue);
        setBackground(clr);
    }


    public static void main(String args[]) {
        new RandomColor();
    }
}
