/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior.citizen.record.system.utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class DataTableUtils {

    public static DefaultTableModel populateTable(int columns, ResultSetMetaData rsmd, ResultSet rs) {
        DefaultTableModel dtm = new DefaultTableModel();

        try {
            Vector column_name = new Vector();

            for (int i = 2; i <= columns; i++) {
                column_name.addElement(rsmd.getColumnName(i));
            }
            dtm.setColumnIdentifiers(column_name);

            while (rs.next()) {
                Vector data_rows = new Vector();
                for (int x = 2; x <= columns; x++) {
                    data_rows.addElement(rs.getString(x));
                }

                dtm.addRow(data_rows);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        return dtm;
    }
}
