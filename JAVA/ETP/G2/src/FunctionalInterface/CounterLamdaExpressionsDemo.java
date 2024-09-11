package FunctionalInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CounterLamdaExpressionsDemo {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Counter & Button example");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));

        final int[] counter = {0};

        JLabel label = new JLabel("Button count : " + counter[0]);

        JButton button = new JButton("Click Me!");
        button.addActionListener((ActionEvent e)->{
            counter[0]++;
            label.setText("Button Count : " + counter[0]);
        });

        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
