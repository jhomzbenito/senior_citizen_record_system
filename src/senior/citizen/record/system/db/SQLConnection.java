/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior.citizen.record.system.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class SQLConnection {

    public static Connection connectToDatabase() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql:///dbRecordSystem", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
