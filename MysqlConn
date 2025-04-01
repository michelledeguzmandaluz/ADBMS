Package Goldilocks;

import java.sql.*;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class Record extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "2224";
    private static final String dataConn = "jdbc:mysql://localhost:3306/connector";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;

    public Record() {

        initComponents();
        updateDB();
    }
public void updateDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector", "root", "2224");
            pst = sqlConn.prepareStatement("SELECT * FROM connector");
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                Vector columnData = new Vector();
                columnData.add(rs.getInt("ID")); // Assuming ID is an integer
                columnData.add(rs.getString("ProductID"));
                columnData.add(rs.getString("ProductName"));
                columnData.add(rs.getString("CustomerName"));
                columnData.add(rs.getString("Address"));
                columnData.add(rs.getString("CellphoneNumber"));
                RecordTable.addRow(columnData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (sqlConn != null) {
                    sqlConn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage());
            }
        }
    }
private void jbtnAddNewActionPerformed(java.awt.event.ActionEvent evt) {                                           

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector", "root", "2224");
            pst = sqlConn.prepareStatement("INSERT INTO connector(ProductID, ProductName, CustomerName, Address, CellphoneNumber) VALUES(?, ?, ?, ?, ?)");

            pst.setString(1, jtxtProductID.getText());
            pst.setString(2, jtxtProductName.getText());
            pst.setString(3, jtxtCustomerName.getText());
            pst.setString(4, jtxtAddress.getText());
            pst.setString(5, jtxtCellphoneNumber.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            updateDB();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Database Driver Error: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + ex.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (sqlConn != null) {
                    sqlConn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage());
            }
        }
    }  
private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                           

        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        if (SelectedRows >= 0) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("UPDATE connector SET ProductID=?, ProductName=?, CustomerName=?, Address=?, CellphoneNumber=? WHERE ID=?");

                // Set the parameters for the prepared statement
                pst.setString(1, jtxtProductID.getText());
                pst.setString(2, jtxtProductName.getText());
                pst.setString(3, jtxtCustomerName.getText());
                pst.setString(4, jtxtAddress.getText());
                pst.setString(5, jtxtCellphoneNumber.getText());

                // Get the ID of the selected row
                int id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
                pst.setInt(6, id); // Set the ID parameter

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated");
                updateDB();
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Database Driver Error: " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "SQL Error: " + ex.getMessage());
            } finally {
                try {
                    if (pst != null) {
                        pst.close();
                    }
                    if (sqlConn != null) {
                        sqlConn.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a record to update");
        }
    }  
private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {                                          
        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page{0, number, integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e) 
        {
            System.err.format("No Printer found", e.getMessage());
        }
    }
 private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jtxtProductID.setText("");
        jtxtProductName.setText("");
        jtxtCustomerName.setText("");
        jtxtAddress.setText("");
        jtxtCellphoneNumber.setText("");
    }
private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                           

        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        if (SelectedRows >= 0) {
            int id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("DELETE FROM connector WHERE ID=?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted");
                updateDB();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                ex.printStackTrace(); // Print stack trace for debugging
            } finally {
                try {
                    if (pst != null) {
                        pst.close();
                    }
                    if (sqlConn != null) {
                        sqlConn.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a record to delete");
        }
    } 
 private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Goldilocks",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    } 
private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ((Record) getRootPane().getParent()).setVisible(true);
        this.dispose();
    }  
 private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        jtxtProductID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtProductName.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtCustomerName.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        jtxtAddress.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        jtxtCellphoneNumber.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
    }  
 public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Record().setVisible(true);

            }
        });
    }
 }
