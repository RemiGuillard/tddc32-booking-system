import java.awt.Color;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;



class TableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object[][] data;
	private String[] title;
	/**
	 * Constructor
	 * @param data
	 * @param title
	 */
	public TableModel(Object[][] data, String[] title){
		this.data = data;
		this.title = title;
	}
	
	//Fonction qui va s'occupper de remettre � jour tout mon tableau et qui va mettre
	//� jour aussi l'affichage
	public void setData(Object[][] newData){
	data = newData;
	super.fireTableDataChanged();
	}
	
	/**
	* Retourne le titre de la colonne � l'indice sp�cif�
	*/
	public String getColumnName(int col) {
	  return this.title[col];
	}
	
	/**
	 * Retourne le nombre de colonnes
	 */
	public int getColumnCount() {
		return this.title.length;
	}
	
	/**
	 * Retourne le nombre de lignes
	 */
	public int getRowCount() {
		return this.data.length;
	}
	
	public Class getColumnClass(int col){
		//On retourne le type de la cellule � la colonne demand�e
		//On se moque de la ligne puisque les donn�es sur chaque ligne sont les m�mes
		//On choisit donc la premi�re ligne
		return this.data[0][col].getClass();
	}
	
	/**
	 * Retourne vrai si la cellule est �ditable : celle-ci sera donc �ditable
	 * @return boolean
	 */
	public boolean isCellEditable(int row, int col){
		Object obj = getValueAt(row, col);
		if(obj instanceof JButton || obj instanceof String)
			return false;
		return true; 
	}
	
	/**
	 * Retourne la valeur � l'emplacement sp�cifi�
	 */
	public Object getValueAt(int row, int col) {
		return this.data[row][col];
	}
	
	@Override
	public void setValueAt(Object aValue, int row, int col) {
	   /* if(aValue != null){
	        Ami ami = amis.get(rowIndex);
	        
	        switch(columnIndex){
	            case 0:
	                ami.setPrenom((String)aValue);
	                break;
	            case 1:
	                ami.setNom((String)aValue);
	                break;
	            case 2:
	                ami.setCouleur((Color)aValue);
	                break;
	            case 3:
	                ami.setHomme((Boolean)aValue);
	                break;
	            case 4:
	                ami.setSport((Sport)aValue);
	                break;
	        }
	    }*/
		this.data[row][col] = (Color)aValue;
	}
			
}