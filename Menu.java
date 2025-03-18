package MENU;


import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private double total = 0.0;
    private int x = 0;
    private double tax = 0.0;

    public Menu() {
        initComponents();
        init();
    }

    public void init() {
        setTime();
    }

    public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please increase the item quantity");
            return false;
        }
        return true;
    }
    public void reset() {
        total = 0.0;
        x = 0;
        tax = 0.0;
        btnTotal.setEnabled(true);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jTextFieldTax.setText("0.0");
        jTextFieldSubTotal.setText("0.0");
        jTextFieldTotal.setText("0.0");
        jTextArea.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
    }
  
  public void dudate() {
        jTextFieldTax.setText(String.valueOf(String.format("%.2f", tax)));
        jTextFieldSubTotal.setText(String.valueOf(String.format("%.2f", total)));
        jTextFieldTotal.setText(String.valueOf(String.format("%.2f", total + tax)));
    }

public void goldilocks() {
        int purchaseId = 15020 + (int) (Math.random()*80800); 
        jTextArea.setText("**************************************Goldilocks**************************************\n"
                + "Time: " + jTxtTime.getText() + "                                                           Date: " + jTxtDate.getText() + "\n"
                +"Purchase Id: " + purchaseId + "\n" 
                + "***************************************************************************************\n"
                + "\nProduct Name: \t\t\t"
                + "Price(₱): \n\n"
        );
    }

private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox1.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 820.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel22.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox1.setSelected(false);
        }
    }

private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox2.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 650.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel27.getText() + "\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox2.setSelected(false);
        }
    } 

private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner3.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox3.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 500.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel36.getText() + "\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox3.setSelected(false);
        }
    } 

private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner11.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox4.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 415.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel39.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox4.setSelected(false);
        }
    }  

private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox5.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 760.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel49.getText() + "\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox5.setSelected(false);
        }
    }  

private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox6.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 750.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel54.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox6.setSelected(false);
        }
    }  

  private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner12.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox7.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 790.0 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel95.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox7.setSelected(false);
        }
    } 

 private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner6.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox8.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 820.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel90.getText() + "\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox8.setSelected(false);
        }
    } 

private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox9.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 830.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel91.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox9.setSelected(false);
        }
    }

private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox10.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 700.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel92.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox10.setSelected(false);
        }
    }

private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int qty = Integer.parseInt(jSpinner9.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox11.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 920.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel93.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox11.setSelected(false);
        }
    } 

private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox12.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 550.00 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel94.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox12.setSelected(false);
        }
    } 

private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int qty = Integer.parseInt(jSpinner13.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox13.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 990.0 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel96.getText() + "\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox13.setSelected(false);
        }
    }

private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int qty = Integer.parseInt(jSpinner14.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox14.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 440.0 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel97.getText() + "\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox14.setSelected(false);
        }
    }  

private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int qty = Integer.parseInt(jSpinner15.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox15.isSelected()) {
            x++;
            if (x == 1) {
                goldilocks();
            }
            double price = 350.0 * qty;
            total += price;
            getTax((int) total);
            jTextArea.setText(jTextArea.getText() + x + ". " + jLabel98.getText() + "\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            jCheckBox15.setSelected(false);
        }
    }

private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (total != 0) {
            if (!btnTotal.isEnabled()) {
                try {
                    jTextArea.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else {
            JOptionPane.showMessageDialog(null, "First, you should calculate the total price");
        }

        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchased any product");
        }
    }                                          

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }                                       

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        reset();
    } 

private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any product");
        } else {
            jTextArea.setText(jTextArea.getText()
                    + "\n***************************************************************************************\n"
                    + "Tax: \t\t\t" + tax + "\n"
                    + "SubTotal: \t\t\t" + total + "\n"
                    + "Total: \t\t\t" + (total + tax) + "\n\n"
                    + "\n************************************Thank You**************************************\n"
            );
            btnTotal.setEnabled(false);
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
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    } 

public void getTax(int t) {
        if (t > 10.0) {
            tax = 0.5;
        } else if (t > 20.0 && t <= 40.0) {
            tax = 1.0;
        } else if (t > 40.0 && t <= 60.0) {
            tax = 2.0;
        } else if (t > 60.0 && t <= 80.0) {
            tax = 3.0;
        } else if (t > 80.0 && t <= 100.0) {
            tax = 4.0;
        } else if (t > 100.0 && t <= 150.0) {
            tax = 8.0;
        } else if (t > 150.0 && t <= 200.0) {
            tax = 4.0;
        }
    }

  public void setTime() {
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE,dd-MM-yyyy");
                    String time = tf.format(date);
                    jTxtTime.setText(time.split(" ")[0] + "" + time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
  
