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

import model.Client;
import operations.ClientOperations;

public class DelClientView extends JFrame {

	private JTextField insertId = new JTextField(25);

	private JButton send = new JButton("Send");

	public DelClientView() {
		JPanel name = new JPanel();
		name.setLayout(new FlowLayout());
		name.add(new JLabel("Dati id-ul clientului care uremaza sa fie sters: "));
		name.add(insertId);

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
		this.setTitle("Delete Client");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientOperations clientop = new ClientOperations();
				Client c = new Client(getId(), "", "", "", "");
				clientop.deleteClient(c);
			}
		});

	}

	public int getId() {
		return Integer.parseInt(insertId.getText());
	}

}
