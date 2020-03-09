package operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection;
import model.Order;

public class OrderOperations {

	public static void selectOrders() {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `comenzi`";
		ResultSet rs = null;
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				int idC = rs.getInt("idComanda");
				int idCl = rs.getInt("idClient");
				int idP = rs.getInt("idProdus");
				int cantitate = rs.getInt("cantitate");


				Order o = new Order(idC,idCl,idP,cantitate);
				 System.out.println(o.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
		}
	}
	public static void addOrder(Order comanda)
	{
		DBConnection mysqlConnect = new DBConnection();
		String sql = "insert into comenzi values(?,?,?,?)";
    	
    	try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setInt(1,comanda.getIdComanda());
    	    statement.setInt(2,comanda.getIdClient());
    	    statement.setInt(3,comanda.getIdProdus());
    	    statement.setInt(4,comanda.getCantitate());
    	   
    	   
    	    statement.executeUpdate();
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {  
    	    mysqlConnect.disconnect();
    	}
	}
}
