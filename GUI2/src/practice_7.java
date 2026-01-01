import javax.swing.*;
import java.awt.*;


public class practice_7 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Label Example");
        frame.setLayout(new FlowLayout());

        JLabel label1=new JLabel("Welcome to java Swing;");

        ImageIcon icon=new ImageIcon("image.icon");

        JLabel label2 = new JLabel("With Icon", icon, SwingConstants.CENTER);


        JLabel label3=new JLabel("<html><b>bold Text</b>");

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
