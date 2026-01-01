import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem_4 {
    public static void main(String[] args) {

        JFrame frame=new JFrame("Login form");

        JLabel userLabel=new JLabel("Username");
        userLabel.setBounds(30,20,80,25);

        JTextField userText=new JTextField();
        userText.setBounds(120,20,150,25);

        JLabel passLabel=new JLabel("Password");
        passLabel.setBounds(30,60,80,25);
        JPasswordField passText=new JPasswordField();
        passText.setBounds(120,60,150,25);

        JButton loginButton=new JButton("login");
        loginButton.setBounds(120,100,100,30);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=userText.getText();
                String password=String.valueOf(passText.getPassword());

                if (username.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"password");
                }
            }
        });


    }
}
