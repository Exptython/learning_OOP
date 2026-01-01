import javax.swing.*;
import java.awt.*;



public class Practice_5 {
    public static void main(String[] args) {

        JFrame frame=new JFrame("complex layout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel=new JPanel(new BorderLayout());

        JPanel topPanel=new JPanel(new FlowLayout());
        topPanel.add(new JButton("File"));
        topPanel.add(new JButton("Edit"));
        topPanel.add(new JButton("View"));
        topPanel.add(new JButton("Help"));

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        leftPanel.setBorder(BorderFactory.createTitledBorder("tool"));
        leftPanel.add(new JButton("select"));
        leftPanel.add(new JButton("Brush"));
        leftPanel.add(new JButton("Eraser"));
        leftPanel.add(new JButton("Fill"));

        JPanel centrePanel=new JPanel();
        centrePanel.setBackground(Color.WHITE);
        centrePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel bottomPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.add(new JLabel("Status:Ready"));

        mainPanel.add(topPanel,BorderLayout.NORTH);
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(centrePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setSize(600, 500);
        frame.setVisible(true);
































    }
}
