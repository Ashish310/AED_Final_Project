/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author hs_sa
 */
public class ManageTableStyles extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable myTable, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(myTable, value, selected, focused, row, column);
        myTable.setShowGrid(true);
        TableCellRenderer rendererFromHeader = myTable.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        myTable.setFillsViewportHeight(true);
        setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        setBackground(new java.awt.Color(36, 47, 65));
        setForeground(new java.awt.Color(255, 255, 255));
        return this;
    }
    
    public ManageTableStyles() {
        setOpaque(true);
    }
    
}
