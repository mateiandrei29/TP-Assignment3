package btnview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import operations.ClientOperations;

public class ShowClientsView extends JFrame {
	
	private JButton timesTwoBtn = new JButton("Multiply By 2");
	public ShowClientsView() {
		// headers for the table
		String[] columns = new String[] { "Id", "Nume", "Prenume", "Email", "Telefon" };
		ClientOperations clientop = new ClientOperations();
		// actual data for the table in a 2d array
		int noClients = clientop.noClients();
		Object[][] data = new Object[noClients][5];
		// create table with data
		for (int i = 0; i < noClients; i++) {
			int j = 0;
			data[i][j] = i;
			data[i][j + 1] = clientop.printName(i + 1);
			data[i][j + 2] = clientop.printPrenume(i + 1);
			data[i][j + 3] = clientop.printEmail(i + 1);
			data[i][j + 4] = clientop.printTel(i + 1);

		}
		final DefaultTableModel model = new DefaultTableModel(data, columns);
		JTable table = new JTable(model);

		
		
		
	      timesTwoBtn.addActionListener(new ActionListener() {

	         public void actionPerformed(ActionEvent e) {
	            for (int row = 0; row < model.getRowCount(); row++) {
	               for (int col = 0; col < model.getColumnCount(); col++) {
	                  Integer value = (Integer) model.getValueAt(row, col);
	                  value *= 2;
	                  model.setValueAt(value, row, col);
	               }
	            }
	         }
	      });
		
		// add the table to the frame
		this.add(new JScrollPane(table));

		this.setTitle("Table Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

}
