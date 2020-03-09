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

public class AddClientView extends JFrame {

	private JTextField insertName=new JTextField(25);
	private JTextField insertSurName=new JTextField(25);
	private JTextField insertEmail=new JTextField(25);
	private JTextField insertPhone=new JTextField(25);
	private JButton send=new JButton("Send");
	public AddClientView()
	{
		JPanel name=new JPanel();
		name.setLayout(new FlowLayout());
		name.add(new JLabel("Nume: "));
		name.add(insertName);
		
		JPanel prenume=new JPanel();
		prenume.setLayout(new FlowLayout());
		prenume.add(new JLabel("Prenume: "));
		prenume.add(insertSurName);
		
		JPanel email=new JPanel();
		email.setLayout(new FlowLayout());
		email.add(new JLabel("Email: "));
		email.add(insertEmail);
		
		JPanel phone=new JPanel();
		phone.setLayout(new FlowLayout());
		phone.add(new JLabel("Telefon: "));
		phone.add(insertPhone);
		
		JPanel operations = new JPanel();
		operations.setLayout(new FlowLayout());
		operations.add(send);
		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(name);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(prenume);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(email);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout());
		panel4.add(phone);
		
		JPanel panel5=new JPanel();
		panel5.setLayout(new FlowLayout());
		panel5.add(send);
		
		final JPanel finalPanel = new JPanel(); // the final panel
		finalPanel.setLayout(new BoxLayout(finalPanel, BoxLayout.Y_AXIS));
		finalPanel.add(panel1);
		finalPanel.add(panel2);
		finalPanel.add(panel3);
		finalPanel.add(panel4);
		finalPanel.add(panel5);

		this.setContentPane(finalPanel);
		this.pack();
		this.setResizable(false);
		this.setTitle("Add Client");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		send.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			ClientOperations clientop=new ClientOperations();
			Client c=new Client(getName(),getPrenume(),getEmail(),getPhone());
			clientop.insertClient(c);
			}
		});

	}
	

			
	public String getName() {
		return insertName.getText();
	}
	public String getPrenume() {
		return insertSurName.getText();
	}
	public String getEmail() {
		return insertEmail.getText();
	}
	public String getPhone() {
		return insertPhone.getText();
	}
}



