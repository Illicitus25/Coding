package FunctionalInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicListenerDemo {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Listener Demo");

        JButton button = new JButton("Click Me!");
        button.addActionListener((ActionEvent e) -> {
                JOptionPane.showMessageDialog(frame,"Button is Clicked!");

        });

        frame.add(button);
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
