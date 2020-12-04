import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
*Login GUI logic.
*/
public class LoginGUI implements ActionListener {
   
   private static JLabel userLabel;
   private static JFrame frame;
   private static JTextField userText;
   private static JLabel passwordLabel;
   private static JButton button;
   private static JPasswordField passwordText;
   private static JLabel success;
   
   public static void main(String[] args) {
      
      JPanel panel = new JPanel();
      
      //frame methods
      frame = new JFrame();
      frame.setSize(350, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Login Page");
      frame.add(panel);      
      panel.setLayout(null);
      
      //username label and text field
      userLabel = new JLabel("Username");
      userLabel.setBounds(10, 20, 80, 25);
      panel.add(userLabel);
      
      userText = new JTextField(20);
      userText.setBounds(100, 20, 165, 25);
      panel.add(userText);
      
      //password label and text field
      passwordLabel = new JLabel("Password");
      passwordLabel.setBounds(10, 50, 80, 25);
      panel.add(passwordLabel);
      
      passwordText = new JPasswordField(20);
      passwordText.setBounds(100, 50, 165, 25);
      panel.add(passwordText);
      
      //login button
      button = new JButton("Login");
      button.setBounds(10, 80, 80, 25);
      button.addActionListener(new LoginGUI());
      panel.add(button);
      
      //info login successful
      success = new JLabel("");
      success.setBounds(10, 110, 300, 25);
      panel.add(success);
         
      frame.setVisible(true);  
   
   }
   
   public void actionPerformed(ActionEvent e) {
      
      String user = userText.getText();
      String password = passwordText.getText();
      
      
      if (user.equalsIgnoreCase("Dalton") && password.equalsIgnoreCase("price")) {
         success.setText("Login successful!");
      }
      else {
         JOptionPane.showMessageDialog(null, "Incorrect Password!", "Error", JOptionPane.PLAIN_MESSAGE);
      }
      
      
   }
   
   
}