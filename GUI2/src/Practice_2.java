import javax.swing.*;
import java.awt.*;



public class Practice_2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Window with panel");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        frame.setVisible(true);

    }
}
