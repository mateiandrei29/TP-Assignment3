package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class View extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton addClient = new JButton("Add Client");
	private JButton deleteClient = new JButton("Delete Client");
	private JButton editClient = new JButton("Edit Client");
	private JButton findClient = new JButton("Search Client");
	private JButton addProduct = new JButton("Add Product");
	private JButton deleteProduct = new JButton("Delete Product");
	private JButton editProduct = new JButton("Edit Product");
	private JButton findProduct = new JButton("Search Product");
	private JButton showClients = new JButton("Show Clients");
	private JButton showProducts = new JButton("Show Products");
	private JButton showOrders = new JButton("Show Orders");
	private JButton placeOrder=new JButton("Place order");

	

	public View() {

		JPanel operations = new JPanel();
		operations.setLayout(new FlowLayout());
		
		operations.add(addClient);
		operations.add(deleteClient);
		operations.add(editClient);
		operations.add(findClient);
		
		operations.add(addProduct);
		operations.add(deleteProduct);
		operations.add(editProduct);
		operations.add(findProduct);
		
		operations.add(showClients);
		operations.add(showProducts);
		operations.add(placeOrder);

		operations.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(operations);

	

		final JPanel finalPanel = new JPanel(); // the final panel
		finalPanel.setLayout(new BoxLayout(finalPanel, BoxLayout.Y_AXIS));
		finalPanel.add(panel1);
		
		this.setContentPane(finalPanel);
		this.pack();
		this.setResizable(true);
		this.setTitle("Warehouse");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public void showError(String err) {
		JOptionPane.showMessageDialog(this, err);
	}



	public void addAddClientListener(ActionListener addCl) {
		addClient.addActionListener(addCl);
	}

	public void addDeleteClientListener(ActionListener mul) {
		deleteClient.addActionListener(mul);
	}

	public void addEditClientListener(ActionListener mul) {
		editClient.addActionListener(mul);
	}

	public void addFindClientListener(ActionListener mul) {
		findClient.addActionListener(mul);
	}

	public void addAddProductListener(ActionListener mul) {
		addProduct.addActionListener(mul);
	}
	public void addDeleteProductListener(ActionListener mul) {
		deleteProduct.addActionListener(mul);
	}

	public void addEditProductListener(ActionListener mul) {
		editProduct.addActionListener(mul);
	}

	public void addFindProductListener(ActionListener mul) {
		findProduct.addActionListener(mul);
	}
	
	public void addShowClientsListener(ActionListener mul) {
		showClients.addActionListener(mul);
	}
	public void addShowProductsListener(ActionListener mul) {
		showProducts.addActionListener(mul);
	}
	
	public void addPlaceOrderListener(ActionListener mul) {
		placeOrder.addActionListener(mul);
	}


}