package Abstract;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomFrame extends JFrame {
    public CustomFrame(String title, int width, int height){
        super(title);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

interface Draggable{
    void drag();
}

interface Clickable{
    void click();
}

class CustonButton extends JButton implements Draggable,Clickable{
    public CustonButton(String text){
        super(text);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               click();
            }
        });
    }

    @Override
    public void drag(){
        System.out.println("Dragging the button");
    }

    @Override
    public void click(){
        System.out.println("Clicked the button");
    }
}
public class SwingComponentsDemo {
    public static void main(String[] args) {
        CustomFrame customFrame = new CustomFrame("Swing JFrame Example",800, 500);
        CustonButton custonButton = new CustonButton("Click Me!");
        customFrame.add(custonButton);

    }
}
