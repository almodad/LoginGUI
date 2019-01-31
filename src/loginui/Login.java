/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *ActionListener
 * @author Administrator
 */
public class Login implements ActionListener{

        JFrame frame = new JFrame("Login");
//Ssub container JPanel
        JPanel loginPanel = new JPanel();
        
        //UI components
        JTextField txtUsername = new JTextField(10);
        JPasswordField txtPassword = new JPasswordField(10);      
        JButton btnLogin = new JButton("Login");
        
    
    public Login(){
        
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPanel.setLayout(null);
        btnLogin.setFont(new Font("Elephant", Font.BOLD, 16));
        btnLogin.addActionListener(this);        
                  
        JLabel lblUsername,lblPassword;
        lblUsername = new JLabel();
        lblPassword = new JLabel();
        lblUsername.setText("USERNAME: ");
        lblPassword.setText("PASSWORD: ");
        
        lblUsername.setBounds(80, 70, 200, 30);
        lblPassword.setBounds(80, 110, 200, 30);
        txtUsername.setBounds(200, 70, 200, 30);
        txtPassword.setBounds(200, 110, 200, 30);
        btnLogin.setBounds(200, 160, 100, 30);
        
        //add components to JPanel
        loginPanel.add(lblUsername);
        loginPanel.add(txtUsername);
        loginPanel.add(lblPassword);
        loginPanel.add(txtPassword);
        loginPanel.add(btnLogin);
               
        //add panel to frame
        frame.add(loginPanel);
        frame.setLocation(250, 200);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLogin){
            //auth user
            if(txtUsername.getText().equals("")){
                JOptionPane.showMessageDialog(frame, 
                        "Enter username", "Error!", 
                        JOptionPane.ERROR_MESSAGE);
                txtUsername.requestFocus();
            }else if(txtPassword.getText().equals("")){
                JOptionPane.showMessageDialog(frame, 
                        "Enter password", "Error!", 
                        JOptionPane.ERROR_MESSAGE);
                txtPassword.requestFocus();
            }else{
                if(txtUsername.getText().equals("admin")
                   && txtPassword.getText().equals("1234")){
                    JOptionPane.showMessageDialog(frame, 
                        "Login successful", "Success", 
                        JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frame, 
                        "Invalid username or password", 
                        "Login failed", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
    }
    
    
    
}
