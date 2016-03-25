package kapitel_11;
import javax.swing.*;
import javax.swing.table.*;

public class BenytJTable {
	public static void main(String[] arg) {
		DefaultTableModel tm = new DefaultTableModel(5,3);
		tm.setValueAt("2*2=4",2,2);
		JTable tabel = new JTable(tm);
		JOptionPane.showMessageDialog(null,tabel);
		System.out.println(tm.getValueAt(2,2));

		tabel.setModel(new DenLilleTabel());
		JOptionPane.showMessageDialog(null,tabel);
	}
}
class DenLilleTabel extends AbstractTableModel 
{
	public int getColumnCount()    { return 10; }
	public int getRowCount()       { return 10; }
	public Object getValueAt(int r,int k) { return r+1+"*"+(k+1)+"="+(r+1)*(k+1); }
}