/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior.citizen.record.system;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import senior.citizen.record.system.account.Account;
import senior.citizen.record.system.account.login.Login;
import senior.citizen.record.system.account.register.Register;
import senior.citizen.record.system.barangay_classify.Barangay;
import senior.citizen.record.system.db.DatabaseHelper;
import senior.citizen.record.system.db.SQLConnection;

/**
 *
 * @author Administrator
 */
public class Main extends javax.swing.JFrame {

    DatabaseHelper databaseHelper;
    ResultSet rs;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        databaseHelper = new DatabaseHelper(SQLConnection.connectToDatabase());
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xsize = (int) tk.getScreenSize().getWidth();
//        int ysize = (int) tk.getScreenSize().getHeight();
//        this.setSize(xsize, ysize);
        this.setLocationRelativeTo(null);
        checkUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPayment = new javax.swing.JButton();
        btnBarangay = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_account_management = new javax.swing.JMenuItem();
        jMenuItem_logout = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_change_username = new javax.swing.JMenuItem();
        jMenuItem_change_password = new javax.swing.JMenuItem();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/finalpayment.png"))); // NOI18N
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 180, 170));

        btnBarangay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/finalbarangay.png"))); // NOI18N
        btnBarangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangayActionPerformed(evt);
            }
        });
        jPanel1.add(btnBarangay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 180, 170));

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/finalregister.png"))); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, 170));

        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/finalreports.png"))); // NOI18N
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });
        jPanel1.add(btnReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 180, 170));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/finalexit.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 180, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senior/citizen/record/system/mainbackground.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 730));

        jMenu2.setText("File");

        jMenuItem_account_management.setText("Account Management");
        jMenuItem_account_management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_account_managementActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_account_management);

        jMenuItem_logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_logout.setText("Logout");
        jMenuItem_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_logoutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_logout);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Account Settings");

        jMenuItem_change_username.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_change_username.setText("Change Username");
        jMenuItem_change_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_change_usernameActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_change_username);

        jMenuItem_change_password.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_change_password.setText("Change Password");
        jMenuItem_change_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_change_passwordActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_change_password);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        new Register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new Login().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
        databaseHelper.insertData("tblbarangay", "Ariendo");
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnBarangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangayActionPerformed
        // TODO add your handling code here:
        new Barangay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBarangayActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
            "Username:", username,
            "Password:", password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().equals("h") && password.getText().equals("h")) {
                System.out.println("Login successful");
            } else {
                System.out.println("login failed");
            }
        } else {
            System.out.println("Login canceled");
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void jMenuItem_change_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_change_usernameActionPerformed
        // TODO add your handling code here:
        String new_username = JOptionPane.showInputDialog("Enter your new username");
        rs = databaseHelper.getAllData("tblaccount");
        boolean match = false;
        try {
            while(rs.next()){
                String username = rs.getString("Username");
                if (username.equals(new_username)){
                    match = true;
                    JOptionPane.showMessageDialog(null, "Try a different username, that "
                            + "is already taken");
                    break;
                }
            }
            if (!match) {
                databaseHelper.updateData("tblaccount", "Username", new_username, "Username", Login.login_user);
                JOptionPane.showMessageDialog(null, "Username has been succesfully changed");
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_jMenuItem_change_usernameActionPerformed

    private void jMenuItem_change_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_change_passwordActionPerformed
        // TODO add your handling code here:
        JTextField old_password = new JPasswordField();
        JTextField new_password = new JPasswordField();
        JTextField confirm_password = new JPasswordField();

        Object[] message = {
            "Old Password:", old_password,
            "New Password:", new_password,
            "Confirm Password:", confirm_password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Change Password", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            rs = databaseHelper.getAllDataOf("tblaccount", "Username", Login.login_user);
            try {
                if (rs.next()) {
                    String password = rs.getString("Password");
                    if (old_password.getText().isEmpty()
                            || new_password.getText().isEmpty()
                            || confirm_password.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill out all fields");
                    } else if (!password.equals(old_password.getText())) {
                        JOptionPane.showMessageDialog(null, "Incorrect Old Password");
                    } else if (!new_password.getText().equals(confirm_password.getText())) {
                        JOptionPane.showMessageDialog(null, "Password does not match");
                    } else {
                        JOptionPane.showMessageDialog(null, "Password successfully changed");
                        databaseHelper.updateData("tblaccount", "Password", confirm_password.getText(),
                                "Username", Login.login_user);
                    }
                }
            } catch (HeadlessException | SQLException e) {
            }
        }
    }//GEN-LAST:event_jMenuItem_change_passwordActionPerformed

    private void jMenuItem_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem_logoutActionPerformed

    private void jMenuItem_account_managementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_account_managementActionPerformed
        // TODO add your handling code here:
        new Account().setVisible(true);
    }//GEN-LAST:event_jMenuItem_account_managementActionPerformed

    private void checkUser(){
        rs = databaseHelper.getAllDataOf("tblAccount", "Username", Login.login_user);
        try {
            if(rs.next()){
                String type = rs.getString("User Type");
                if (type.equals("STAFF")){
                    jMenuItem_account_management.setVisible(false);
                    btnPayment.setVisible(false);
                    btnReports.setVisible(false);
                }
            }
        } catch (Exception e) {
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarangay;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_account_management;
    private javax.swing.JMenuItem jMenuItem_change_password;
    private javax.swing.JMenuItem jMenuItem_change_username;
    private javax.swing.JMenuItem jMenuItem_logout;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
