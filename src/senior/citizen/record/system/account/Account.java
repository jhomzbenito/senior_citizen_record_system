/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior.citizen.record.system.account;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import senior.citizen.record.system.Main;
import senior.citizen.record.system.account.login.Login;
import senior.citizen.record.system.db.DatabaseHelper;
import senior.citizen.record.system.db.SQLConnection;
import senior.citizen.record.system.utils.DataTableUtils;

/**
 *
 * @author jomari
 */
public class Account extends javax.swing.JFrame {

    DatabaseHelper databaseHelper;
    ResultSet rs;
    ResultSetMetaData rsmd;
    DefaultTableModel dtm;

    private String username;

    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
        databaseHelper = new DatabaseHelper(SQLConnection.connectToDatabase());
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        displayRecords();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAddAcccount = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEnableAccount = new javax.swing.JButton();
        txtSearchAccount = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAccounts = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        btnAddAccount = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        btnDisableAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout dlgAddAcccountLayout = new javax.swing.GroupLayout(dlgAddAcccount.getContentPane());
        dlgAddAcccount.getContentPane().setLayout(dlgAddAcccountLayout);
        dlgAddAcccountLayout.setHorizontalGroup(
            dlgAddAcccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dlgAddAcccountLayout.setVerticalGroup(
            dlgAddAcccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(204, 255, 143));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Accounts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnEnableAccount.setText("Enable Account");
        btnEnableAccount.setEnabled(false);
        btnEnableAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableAccountActionPerformed(evt);
            }
        });

        txtSearchAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchAccountKeyReleased(evt);
            }
        });

        tblAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountsMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblAccounts);

        btnAddAccount.setText("Add");
        btnAddAccount.setToolTipText("");
        btnAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountActionPerformed(evt);
            }
        });

        btnDeleteAccount.setText("Delete");
        btnDeleteAccount.setEnabled(false);
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnDisableAccount.setText("Disable Account");
        btnDisableAccount.setEnabled(false);
        btnDisableAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisableAccountActionPerformed(evt);
            }
        });

        jLabel1.setText("Search:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDisableAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnableAccount)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnableAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDisableAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void btnEnableAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableAccountActionPerformed
        //a confirmation dialog for unblocking the  user
        int ans = JOptionPane.showOptionDialog(null, "Do you want to enable this user?", null,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (ans == 0) { //anser is yess
            databaseHelper.updateData("tblaccount", "Status", "ACTIVE", "Username", username);
            JOptionPane.showMessageDialog(null, username + " has been enabled successfully");
            displayRecords();
        }
        btnDeleteAccount.setEnabled(false);
        btnEnableAccount.setEnabled(false);
        btnDisableAccount.setEnabled(false);
    }//GEN-LAST:event_btnEnableAccountActionPerformed

    private void txtSearchAccountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchAccountKeyReleased
        String find = txtSearchAccount.getText();
        searchAccount(find);
    }//GEN-LAST:event_txtSearchAccountKeyReleased

    private void tblAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountsMouseClicked
        try {
            int row = tblAccounts.getSelectedRow(); //getting the selected row
            String row_click = (tblAccounts.getModel().getValueAt(row, 0)).toString();

            rs = databaseHelper.getAllDataOf("tblaccount", "Username", row_click);

            if (row_click == null) {
                btnDeleteAccount.setEnabled(false);
                btnDisableAccount.setEnabled(false);
                btnEnableAccount.setEnabled(false);
            } else {
                btnDeleteAccount.setEnabled(true);
                btnDisableAccount.setEnabled(true);
                btnEnableAccount.setEnabled(true);
            }

            if (rs.next()) { //getting the result
                String stats = rs.getString("Status");
                username = rs.getString("Username");
                if (stats.equals("DISABLED")) {
                    btnDisableAccount.setEnabled(false);
                    btnEnableAccount.setEnabled(true);
                } else {
                    btnDisableAccount.setEnabled(true);
                    btnEnableAccount.setEnabled(false);
                }
                if (stats.equals("ACTIVE")) {
                    btnDisableAccount.setEnabled(true);
                    btnEnableAccount.setEnabled(false);
                } else {
                    btnDisableAccount.setEnabled(false);
                    btnEnableAccount.setEnabled(true);
                }
            }
        } catch (SQLException e) { //catching unexpected errors
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblAccountsMouseClicked

    private void btnAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountActionPerformed
        JTextField username = new JTextField();
        JTextField new_password = new JPasswordField();
        JTextField confirm_password = new JPasswordField();

        Object[] message = {
            "Username:", username,
            "New Password:", new_password,
            "Confirm Password:", confirm_password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Account Creation", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            rs = databaseHelper.getAllData("tblaccount");
            boolean match = false;
            try {
                while (rs.next()) {
                    String user = rs.getString("Username");
                    if (user.equals(username.getText())) {
                        match = true;
                        break;
                    }
                }
            } catch (Exception e) {
            }
            if (username.getText().isEmpty()
                    || new_password.getText().isEmpty()
                    || confirm_password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else if (!new_password.getText().equals(confirm_password.getText())) {
                JOptionPane.showMessageDialog(null, "Password does not match");
            } else if (match) {
                JOptionPane.showMessageDialog(null, "Try a different username, that "
                        + "is already taken");
            } else {
                databaseHelper.insertData("tblaccount", username.getText(), confirm_password.getText(), "STAFF", "ACTIVE");
                JOptionPane.showMessageDialog(null, "New user account has been succesfully created");
                displayRecords();
            }
        }
    }//GEN-LAST:event_btnAddAccountActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        int ans = JOptionPane.showOptionDialog(null, "Are you sure want to remove this user?", null,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (ans == 0) { //answer is yes
            databaseHelper.deleteData("tblaccount", "Username", username);
            JOptionPane.showMessageDialog(null, username + " has been deleted");
            displayRecords();

        }
        btnDeleteAccount.setEnabled(false);
        btnEnableAccount.setEnabled(false);
        btnDisableAccount.setEnabled(false);
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnDisableAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisableAccountActionPerformed
        int ans = JOptionPane.showOptionDialog(null, "Are you sure want to disable this user?", null,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (ans == 0) { //answer is yes
            databaseHelper.updateData("tblaccount", "Status", "DISABLED", "Username", username);
            JOptionPane.showMessageDialog(null, username + " has been disabled successfully");
            displayRecords();
        }
        btnDeleteAccount.setEnabled(false);
        btnEnableAccount.setEnabled(false);
        btnDisableAccount.setEnabled(false);
    }//GEN-LAST:event_btnDisableAccountActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new Main().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.requestFocus();
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (Login.login_user == null) {
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_formWindowOpened

    private void displayRecords() {
        tblAccounts.removeAll();
        try {
            rs = databaseHelper.getAllDataOf("tblaccount", "`User Type`", "STAFF");
            rsmd = rs.getMetaData();

            int columns = rsmd.getColumnCount();

            dtm = DataTableUtils.populateTable(columns, rsmd, rs);

            tblAccounts.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private void searchAccount(String find) {
        tblAccounts.removeAll();
        try {
            rs = databaseHelper.searchDataOf("tblaccount", "User Type", "STAFF", "Username", find);
            rsmd = rs.getMetaData();

            int columns = rsmd.getColumnCount();

            dtm = DataTableUtils.populateTable(columns, rsmd, rs);

            tblAccounts.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccount;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnDisableAccount;
    private javax.swing.JButton btnEnableAccount;
    private javax.swing.JDialog dlgAddAcccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTextField txtSearchAccount;
    // End of variables declaration//GEN-END:variables

    
}
