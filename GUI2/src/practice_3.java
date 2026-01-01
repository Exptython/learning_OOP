import javax.swing.*;
import java.awt.*;

public class practice_3 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("component Example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        panel.setBackground(Color.white);

        JLabel label=new JLabel("Enter your name:");
        JTextField textField=new JTextField(20);
        JButton button=new JButton("submit");
        JCheckBox checkBox=new JCheckBox("I agree");

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(checkBox);

        frame.add(panel);
        frame.setVisible(true);




    }
}
