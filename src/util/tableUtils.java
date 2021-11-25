/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mathr
 */
public class tableUtils {
   

      public static void carregaTabela(JTable jTable1, String[] campos, ResultSet resultado) {

        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        table.setNumRows(0);

        jTable1.getColumnModel().getColumn(0);
        jTable1.getColumnModel().getColumn(1);
        jTable1.getColumnModel().getColumn(2);
        jTable1.getColumnModel().getColumn(3);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centralizado);

        try {
            while (resultado.next()) {
                table.addRow(new Object[]{
                    resultado.getString(campos[0]),
                    resultado.getString(campos[1]),
                    resultado.getString(campos[2]),
                    resultado.getString(campos[3])}
                );
            }
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado encontrado na tabela! ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
