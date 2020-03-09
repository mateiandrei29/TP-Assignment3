package PT2019.Assignment3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Client;
import model.Product;
import operations.ClientOperations;
import operations.OrderOperations;
import operations.ProductOperations;
import view.Controller;
import view.View;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    
    	View view=new View();
		Controller controller = new Controller(view);

    	view.setVisible(true);

    }
}
