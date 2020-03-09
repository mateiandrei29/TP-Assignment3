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

import model.Product;
import operations.ProductOperations;

public class AddProductView extends JFrame {

	private JTextField insertName=new JTextField(25);
	private JTextField insertQt=new JTextField(25);
	private JTextField insertPret=new JTextField(25);
	
	private JButton send=new JButton("Send");
	public AddProductView()
	{
		JPanel name=new JPanel();
		name.setLayout(new FlowLayout());
		name.add(new JLabel("Nume: "));
		name.add(insertName);
		
		JPanel qt=new JPanel();
		qt.setLayout(new FlowLayout());
		qt.add(new JLabel("Cantitate: "));
		qt.add(insertQt);
		
		JPanel pret=new JPanel();
		pret.setLayout(new FlowLayout());
		pret.add(new JLabel("Pret: "));
		pret.add(insertPret);

		
		JPanel operations = new JPanel();
		operations.setLayout(new FlowLayout());
		operations.add(send);
		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(name);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(qt);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(pret);

		
		
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
			ProductOperations productop=new ProductOperations();
			Product p=new Product(getName(),getQt(),getPret());
			productop.insertProduct(p);
			}
		});

	}
	

			
	public String getName() {
		return insertName.getText();
	}
	public int getQt() {
		return Integer.parseInt(insertQt.getText());
	}
	public float getPret() {
		return Float.parseFloat(insertPret.getText());

	}
	
}



