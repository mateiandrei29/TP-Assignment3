package btnview;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Order;
import operations.OrderOperations;

public class PlaceOrderView extends JFrame {

	private JTextField insertQt=new JTextField(25);
	private JTextField insertIdClient=new JTextField(25);
	private JTextField insertIdProdus=new JTextField(25);
	
	private JButton send=new JButton("Send");
	public PlaceOrderView()
	{
		JPanel idCl=new JPanel();
		idCl.setLayout(new FlowLayout());
		idCl.add(new JLabel("ID Client: "));
		idCl.add(insertIdClient);
		
		JPanel idP=new JPanel();
		idP.setLayout(new FlowLayout());
		idP.add(new JLabel("ID Produs: "));
		idP.add(insertIdProdus);
		
		JPanel qt=new JPanel();
		qt.setLayout(new FlowLayout());
		qt.add(new JLabel("Cantitate: "));
		qt.add(insertQt);

		
		JPanel operations = new JPanel();
		operations.setLayout(new FlowLayout());
		operations.add(send);
		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(idCl);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(idP);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(qt);

		
		
		JPanel panel5=new JPanel();
		panel5.setLayout(new FlowLayout());
		panel5.add(send);
		
		final JPanel finalPanel = new JPanel(); // the final panel
		finalPanel.setLayout(new BoxLayout(finalPanel, BoxLayout.Y_AXIS));
		finalPanel.add(panel1);
		finalPanel.add(panel2);
		finalPanel.add(panel3);
		finalPanel.add(panel5);

		this.setContentPane(finalPanel);
		this.pack();
		this.setResizable(false);
		this.setTitle("Add Product");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		send.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			OrderOperations orderop=new OrderOperations();
			Order p=new Order(getClId(),getPId(),getQt());
			orderop.addOrder(p);
			}
		});

	}
	

			
	public int getClId() {
		return Integer.parseInt(insertIdClient.getText());
	}
	public int getQt() {
		return Integer.parseInt(insertQt.getText());
	}
	public int getPId() {
		return Integer.parseInt(insertIdProdus.getText());

	}
	
}



