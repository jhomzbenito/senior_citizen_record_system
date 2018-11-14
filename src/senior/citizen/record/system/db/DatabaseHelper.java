/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior.citizen.record.system.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DatabaseHelper {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public DatabaseHelper(Connection conn) {
        this.conn = conn;
    }

    public void insertData(String tableName, String... args) {
        int valuesCount = args.length;
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO ").append(tableName).append(" VALUES (?, ");
        int ctr = 1;
        while (ctr <= valuesCount) {
            if (ctr != valuesCount) {
                query.append("?, ");
            } else {
                query.append("? );");
            }
            ctr++;
        }
        try {
            ps = conn.prepareStatement(query.toString());
            ps.setInt(1, 0);//for id
            int ps_ctr = 2;
            int args_ctr = 0;
            while (ps_ctr <= valuesCount + 1) {
                ps.setString(ps_ctr, args[args_ctr]);
                ps_ctr++;
                args_ctr++;
            }
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet getAllData(String tableName) {
        try {
            String sql = "SELECT * FROM " + tableName + ";";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }

    public ResultSet getAllDataOf(String tableName, String columnName, String value) {
        try {
            String sql = "SELECT * FROM " + tableName + " WHERE " + columnName + " = '" + value + "';";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    
    public ResultSet searchData(String tableName, String columnName, String searchValue) {
        try {
            String sql = "SELECT * FROM " + tableName + " WHERE " + columnName + " LIKE % ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, searchValue);
            rs = ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    
    public ResultSet searchDataOf(String tableName, String whereColumn, 
            String whereArgs, String columnName, String searchValue) {
        try {
            String sql = "SELECT * FROM " + tableName + " WHERE " + whereColumn +
                    " = ? AND "+ columnName + " LIKE % ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, whereArgs);
            ps.setString(2, searchValue);
            rs = ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }

    public void updateData(String tableName, String columnUpdate, String valuesUpdate, String columnId, String valueId) {
        try {
            String query = "UPDATE " + tableName + " SET " + columnUpdate + " = ? WHERE " + columnId + " = ?;";
            ps = conn.prepareStatement(query);
            ps.setString(1, valuesUpdate);
            ps.setString(2, valueId);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteData(String tableName, String columnId, String id) {
        try {
            String query = "DELETE FROM " + tableName + " WHERE " + columnId + " = '" + id + "';";
            Statement st = conn.createStatement();
            st.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
