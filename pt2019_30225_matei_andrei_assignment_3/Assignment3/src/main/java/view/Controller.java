package view;

import java.awt.*;
import javax.swing.*;

import btnview.AddClientView;
import btnview.AddProductView;
import btnview.DelClientView;
import btnview.DelProductView;
import btnview.EditClientView;
import btnview.EditProductView;
import btnview.FindClientView;
import btnview.FindProductView;
import btnview.PlaceOrderView;
import btnview.ShowClientsView;
import btnview.ShowProductView;
import operations.ClientOperations;
import operations.OrderOperations;
import operations.ProductOperations;

import java.awt.event.*;
public class Controller {

	private View view;
	private ClientOperations clientop=new ClientOperations();
	private ProductOperations productop=new ProductOperations();
	private OrderOperations orderop=new OrderOperations();
	
	public Controller(View view) 
	{
		this.view=view;
		view.addAddClientListener(new AddClientListener());
		view.addDeleteClientListener(new DeleteClientListener());
		view.addEditClientListener(new EditClientListener());
		view.addFindClientListener(new FindClientListener());
		view.addAddProductListener(new AddProductListener());
		view.addDeleteProductListener(new DeleteProductListener());
		view.addEditProductListener(new EditProductListener());
		view.addFindProductListener(new FindProductListener());
		view.addShowClientsListener(new ShowClientsListener());
		view.addShowProductsListener(new ShowProductsListener());
		view.addPlaceOrderListener(new PlaceOrderListener());
	}
	
	
	
	class AddClientListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new AddClientView();
		}
		
	}
	class DeleteClientListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			new DelClientView();
		}
		
	}
	class EditClientListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new EditClientView();

		}
		
	}
	class FindClientListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			new FindClientView();
		}
		
	}
	class AddProductListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			new AddProductView();
		}
		
	}
	class DeleteProductListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new DelProductView();

		}
		
	}
	class EditProductListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			new EditProductView();
		}
		
	}
	class FindProductListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			new FindProductView();
		}
		
	}
	class ShowClientsListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			new ShowClientsView();
		}
		
	}
	class ShowProductsListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e) {
			new ShowProductView();
		}
		
	}
	
	class PlaceOrderListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			new PlaceOrderView();
		}
		
	}
}

	