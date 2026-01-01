import javax.swing.*;
import java.awt.*;



public class Problem_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label with Mnemonic");
        frame.setLayout(new GridLayout(3, 1));

        // Create text field
        JTextField nameField = new JTextField(20);

        // Create label with mnemonic 'N' (Alt+N will focus the text field)
        JLabel nameLabel = new JLabel("&Name:");
        nameLabel.setDisplayedMnemonic('N');
        nameLabel.setLabelFor(nameField);

        // Create another label with icon alignment
        ImageIcon infoIcon = new ImageIcon("info.png");
        JLabel infoLabel = new JLabel("Information Label", infoIcon, SwingConstants.LEFT);
        infoLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
        infoLabel.setVerticalTextPosition(SwingConstants.CENTER);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(infoLabel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
