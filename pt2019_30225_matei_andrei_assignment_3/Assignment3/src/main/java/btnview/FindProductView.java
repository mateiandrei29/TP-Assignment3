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

import operations.ProductOperations;

public class FindProductView extends JFrame {

	private JTextField insertName = new JTextField(25);

	private JButton send = new JButton("Send");

	public FindProductView() {
		JPanel name = new JPanel();
		name.setLayout(new FlowLayout());
		name.add(new JLabel("Dati numele clientului care vreti sa fie gasit:  "));
		name.add(insertName);

		JPanel operations = new JPanel();
		operations.setLayout(new FlowLayout());
		operations.add(send);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(name);

		JPanel panel5 = new JPanel();
		panel5.setLayout(new FlowLayout());
		panel5.add(send);

		final JPanel finalPanel = new JPanel(); // the final panel
		finalPanel.setLayout(new BoxLayout(finalPanel, BoxLayout.Y_AXIS));
		finalPanel.add(panel1);

		finalPanel.add(panel5);

		this.setContentPane(finalPanel);
		this.pack();
		this.setResizable(false);
		this.setTitle("Find Product");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductOperations producttop = new ProductOperations();
				producttop.selectByName(getName());
			}
		});

	}

	public String getName() {
		return insertName.getText();
	}

}
