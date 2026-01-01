import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;


public class problem_3 {
    public static void main(String[] args) {
//        Create frame
    JFrame frame=new JFrame("add String to File");

//    create text field
    JTextField textField=new JTextField();
    textField.setBounds(50,30,200,30);

//    create Button
    JButton addButton=new JButton("add");
    addButton.setBounds(50,30,200,30);

//    Button Click Event (ActionListener)
    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text=textField.getText();

            if (text.isEmpty()){
                JOptionPane.showMessageDialog(frame,"please enter some text");
                return;
            }
            try(FileWriter writer=new FileWriter("data.txt",true)){
                writer.write(text+System.lineSeparator());

                JOptionPane.showMessageDialog(frame,"text added to file");
                textField.setText("");
            }
            catch (IOException ex){
                JOptionPane.showMessageDialog(frame,"error writing to file");
            }
        }

    });

    frame.add(textField);
    frame.add(addButton);

    frame.setSize(300,170);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);










    }
}
