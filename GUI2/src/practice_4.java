
import javax.swing.*;
import java.awt.*;


public class practice_4 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("layout Managers");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());
        JPanel northPanel=new JPanel();
        northPanel.setBackground(Color.RED);
        northPanel.add(new JLabel("North Panel"));

        JPanel centrePanel=new JPanel();
        centrePanel.setLayout(new GridLayout(3,2));
        centrePanel.add(new JButton("1"));
        centrePanel.add(new JButton("2"));
        centrePanel.add(new JButton("3"));
        centrePanel.add(new JButton("4"));
        centrePanel.add(new JButton("5"));
        centrePanel.add(new JButton("6"));

        JPanel southPanel=new JPanel();
        southPanel.setBackground(Color.BLUE);
        southPanel.add(new JLabel("South Panel"));

        frame.add(northPanel,BorderLayout.NORTH);
        frame.add(centrePanel,BorderLayout.CENTER);
        frame.add(southPanel,BorderLayout.SOUTH);

        frame.setVisible(true);









    }
}
