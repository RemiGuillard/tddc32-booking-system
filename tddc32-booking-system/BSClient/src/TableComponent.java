import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class TableComponent extends DefaultTableCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Component getTableCellRendererComponent(JTable table,
			Object value, boolean isSelected, boolean hasFocus, int row,
			int column) {
		//Si la valeur de la cellule est un JButton, on transtype notre valeur
		if (value instanceof JButton){
			return (JButton) value;
		}
		else if (value instanceof JComboBox)
			return (JComboBox) value;
		else
			return this;
	}
}