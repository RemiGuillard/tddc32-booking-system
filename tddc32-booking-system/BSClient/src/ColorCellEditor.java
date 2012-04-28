import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

import org.freixas.jcalendar.JCalendar;

public class ColorCellEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color couleur;
    private JButton bouton;
    private JColorChooser colorChooser;
    private JDialog dialog;
    private	JFrame	_win;
    private	JCalendar _cal;
	private BookSystem _bs;
	Object[] free_space = { "Book hour", "Cancel" };
	Object[] Booked_space = { "cancel" };
	Object[] My_space = { "UnBook", "Cancel" };
	private int _row;
	private int _col;

    public ColorCellEditor(JFrame windows, JCalendar calendar, BookSystem bs) {
        super();
        
        _win = windows;
        _cal = calendar;
        _bs = bs;
        bouton = new JButton();
        bouton.setActionCommand("change");
        bouton.addActionListener(this);
        bouton.setBorderPainted(false);
        //colorChooser = new JColorChooser();
        //dialog = JColorChooser.createDialog(bouton, "Pick a Color", true, colorChooser, this, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("change".equals(e.getActionCommand())) {
            bouton.setBackground(couleur);
            //colorChooser.setColor(couleur);
            //dialog.setVisible(true);
            if (couleur.equals(Color.GREEN))
            	askBooking();
            else if (couleur.equals(Color.ORANGE))
            	askCancelBooking();
            else if (couleur.equals(Color.RED))
            	informImpossible();
            fireEditingStopped();
        } else {
            couleur = colorChooser.getColor();
        }
    }

    private void informImpossible() {
		// TODO Auto-generated method stub
    	JOptionPane.showOptionDialog(_win,
				"Time already booked by an other user",
				"Booking", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, Booked_space, Booked_space[0]);
	}

	private void askCancelBooking() {
		// TODO Auto-generated method stub
		Calendar	cal = Calendar.getInstance();
		cal.setTime(_cal.getDate());
		cal.set(Calendar.HOUR_OF_DAY, _row + 8);
		cal.set(Calendar.DAY_OF_WEEK, _col + 1);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int n = JOptionPane.showOptionDialog(_win,
				"Would you like Cancel the day : " + day +"/"+ month +"/"+ year + " at "+ hour + "h ?",
				"Booking", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, My_space, My_space[1]);
		if (n == 0) {
			_bs.Cancel(cal);
			//couleur = Color.GREEN;
			//fireEditingStopped();
		}
		
	}
	
	private void askBooking() {
		Calendar	cal = Calendar.getInstance();
		cal.setTime(_cal.getDate());
		cal.set(Calendar.HOUR_OF_DAY, _row + 8);
		cal.set(Calendar.DAY_OF_WEEK, _col + 1);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int n = JOptionPane.showOptionDialog(_win,
				"Would you like To book the day "+ cal.getTime().toString() +" : " + day +"/"+ month +"/"+ year + " at "+ hour + "h ?",
				"Booking", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, free_space, free_space[1]);
		if (n == 0) {
			_bs.book(cal);
			//couleur = Color.ORANGE;
			//fireEditingStopped();
		}
	}

	@Override
    public Object getCellEditorValue() {
        return couleur;
    }
	
	public void	setCellEditorValue(Color color) {
		couleur = color;
		JOptionPane.showMessageDialog(_win, "Color = " + color.toString() + " row = " +_row + " col= "+ _col , "Error", JOptionPane.ERROR_MESSAGE);
		fireEditingStopped();
	}
	
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        couleur = (Color)value;
        _row = row;
        _col = column;
        return bouton;
    }
}



/*public class ColorCellEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

	private static final long serialVersionUID = 1L;
	private Color couleur;
	 private JButton bouton;
	 private JColorChooser colorChooser;
	 private JDialog dialog;
	 Object[] free_space = {"Book hour",
             "Cancel"};
	 Object[] Booked_space = {"cancel"};
	 Object[] My_space = {"UnBook",
     "Cancel"};

	    public ColorCellEditor(JFrame windows) {
	        super();
	        bouton = new JButton();
	        bouton.setActionCommand("change");
	        bouton.addActionListener(this);
	        bouton.setBorderPainted(false);
	        colorChooser = new JColorChooser();
	        JColorChooser.createDialog(bouton, "Pick a Color", true, colorChooser,  this, null);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if ("change".equals(e.getActionCommand())) {
	            bouton.setBackground(couleur);
	            colorChooser.setColor(couleur);
	            dialog.setVisible(true);
	            fireEditingStopped();
	        } else {
	            couleur = colorChooser.getColor();
	        }
	    }

	    @Override
	    public Object getCellEditorValue() {
	        return couleur;
	    }

	    @Override
	    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
	        couleur = (Color)value;

	        return bouton;
	    }

		@Override
		public void addCellEditorListener(CellEditorListener l) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void cancelCellEditing() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isCellEditable(EventObject anEvent) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void removeCellEditorListener(CellEditorListener l) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean shouldSelectCell(EventObject anEvent) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean stopCellEditing() {
			// TODO Auto-generated method stub
			return false;
		}
}*/
