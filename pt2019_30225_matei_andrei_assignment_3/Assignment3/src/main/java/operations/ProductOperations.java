package operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection;
import model.Product;

public class ProductOperations {

	static int noProducts=0;
	public static void selectProducts() {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `produse`";
		ResultSet rs = null;
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("idProdus");
				String name = rs.getString("nume");
				int cantitate = rs.getInt("cantitate");
				float pret = rs.getFloat("pret");
				
				System.out.println("ID: " + id + ": " + name + " " + cantitate + " " + pret);

				Product p = new Product(name, cantitate, pret);
				//System.out.println(p.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
	}
	public static void insertProduct(Product produs)
	{
		DBConnection mysqlConnect = new DBConnection();
		String sql = "insert into produse values(?,?,?,?)";
    	
    	try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setInt(1,produs.getIdProdus());
    	    statement.setString(2,produs.getName());
    	    statement.setInt(3,produs.getQuantity());
    	    statement.setFloat(4,produs.getPrice());
    	   
    	    statement.executeUpdate();
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {  
    	    mysqlConnect.disconnect();
    	}
	}
	public static void deleteProduct(Product produs)
	{
		DBConnection mysqlConnect = new DBConnection();
		String sql = "delete from produse where idProdus=";
		sql+="?";
    	
    	try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setInt(1,produs.getIdProdus());
    	    
    	    statement.executeUpdate();
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {  
    	    mysqlConnect.disconnect();
    	}
	}
	public static void editProduct(Product produs,String name,int qt,float price)
	{
		DBConnection mysqlConnect = new DBConnection();
		String sql = "update produse set nume=?, cantitate=?, pret=? where idProdus=?";
		try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setString(1,name);
    	    statement.setInt(2,qt);
    	    statement.setFloat(3,price);
    	    statement.setInt(4, produs.getIdProdus());
    	    statement.executeUpdate();
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {  
    	    mysqlConnect.disconnect();
    	}
	}
	public static void selectByName(String toBeFound)
	{
		DBConnection mysqlConnect = new DBConnection();
    	String sql = "SELECT * FROM `produse` where nume=?";
    	ResultSet rs=null;
    	int i=1;
    	try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setString(1,toBeFound);
   
    	    rs=statement.executeQuery();
    	    while (rs.next()) {
				int id = rs.getInt("idProdus");
				String name = rs.getString("nume");
				int cantitate = rs.getInt("cantitate");
				float pret = rs.getFloat("pret");
				System.out.println("ID: " + id + ": " + name + " " + cantitate + " " + pret);

    	    }
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {
    	    mysqlConnect.disconnect();
    	}
	}
	public static int noProducts() {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `produse`";
		ResultSet rs = null;
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				noProducts++;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return noProducts;
	}
	public static String printName(int cId) {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `produse`";
		ResultSet rs = null;
		String nume="";
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
			
				if(cId==rs.getInt("idProdus"))
					nume = rs.getString("nume");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return nume;
	}
	public static String printQt(int cId) {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `produse`";
		ResultSet rs = null;
		String cantitate="";
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
			
				if(cId==rs.getInt("idProdus"))
					cantitate = rs.getString("cantitate");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return cantitate;
	}
	public static String printPret(int cId) {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `produse`";
		ResultSet rs = null;
		String pret="";
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
			
				if(cId==rs.getInt("idProdus"))
					pret = rs.getString("pret");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return pret;
	}
}
