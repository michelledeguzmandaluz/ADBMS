package Goldilocks;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
  public LoginForm() {
        initComponents();
    }
private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }                                         

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(jcshow_password.isSelected()){
            passwordField.setEchoChar((char)0);
        }
        else{
            passwordField.setEchoChar('*');
        }
    }
private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(isEmpty()){
            String uname = usernameField.getText();
            String upass = String.valueOf(passwordField.getPassword());
            if(uname.equals("admin")&& upass.equals("2224")){
                MenuReceipt menu = new MenuReceipt();
                menu.setVisible(true);
                menu.pack();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Invalid username or  password","Warning",2);    
            }
        }
    }    
private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
           for(double i=0.0; i<=1.0;i +=0.1){
            String s = i+"";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }  
int xx,xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {                                     
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }                                    

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {                                     
        xx = evt.getX();
        xy = evt.getY();
    }    
public boolean isEmpty(){
        if(usernameField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username is missing","Warning",2);
            return false;
        }
        if(String.valueOf(passwordField.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is missing","Warning",2);
            return false;
        }
        return true;
    }
public static void main(String args[]) {
  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
