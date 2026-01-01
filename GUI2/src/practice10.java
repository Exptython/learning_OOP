import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class practice10 {
    private static int clickCount=0;

    public static void main(String[] args) {
        JFrame frame=new JFrame("Button example");
        frame.setLayout(new FlowLayout());

        JButton button1=new JButton("Click ME!");
        ImageIcon icon=new ImageIcon("button_icon_png");
        JButton button2=new JButton("with Icon",icon);

        JButton button3=new JButton("Roller Button");
        button3.setRolloverEnabled(true);
        button3.setRolloverIcon(new ImageIcon("rollover.png"));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                JOptionPane.showMessageDialog(frame,"Button clicked"+clickCount+"times!");
            }
        });
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
