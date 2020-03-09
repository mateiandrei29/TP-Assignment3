package operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnection;
import model.Client;

public class ClientOperations {

	static int noClients=0;

	
	public static void selectClients() {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `clienti`";
		ResultSet rs = null;
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("idClient");
				String name = rs.getString("nume");
				String prenume = rs.getString("prenume");
				String email = rs.getString("email");
				String tel = rs.getString("telefon");
				System.out.println("ID: " + id + ": " + name + " " + prenume + " " + email + " " + tel);

				//Client c = new Client(name, prenume, email, tel);
				//System.out.println(c.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
	}
	public static void insertClient(Client client)
	{
		DBConnection mysqlConnect = new DBConnection();
		String sql = "insert into clienti values(?,?,?,?,?)";
    	
    	try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setInt(1,client.getIdClient());
    	    statement.setString(2,client.getName());
    	    statement.setString(3,client.getSurname());
    	    statement.setString(4,client.getEmail());
    	    statement.setString(5,client.getTelefon());	 
    	    statement.executeUpdate();
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {  
    	    mysqlConnect.disconnect();
    	}
	}
	
	public static void deleteClient(Client client)
	{
		DBConnection mysqlConnect = new DBConnection();
		String sql = "delete from clienti where idClient=";
		sql+="?";
    	
    	try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setInt(1,client.getIdClient());
    	    
    	    statement.executeUpdate();
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {  
    	    mysqlConnect.disconnect();
    	}
	}
	public static void editClient(Client client,String name, String surName, String email, String phone)
	{
		DBConnection mysqlConnect = new DBConnection();
		String sql = "update clienti set nume=?, prenume=?, email=?, telefon=? where idClient=?";
		try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setString(1,name);
    	    statement.setString(2,surName);
    	    statement.setString(3,email);
    	    statement.setString(4,phone);	 
    	    statement.setInt(5, client.getIdClient());
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
    	String sql = "SELECT * FROM `clienti` where nume=? or prenume=?";
    	ResultSet rs=null;
    	int i=1;
    	try {
    	    PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
    	    statement.setString(1,toBeFound);
    	    statement.setString(2,toBeFound);

    	    rs=statement.executeQuery();
    	    while(rs.next())
    	    {
    	    	int id=rs.getInt("idClient");
    	    	String name=rs.getString("nume");
    	    	String prenume=rs.getString("prenume");
    	    	String email=rs.getString("email");
    	    	String tel=rs.getString("telefon");
    	    	//if(name==toBeFound ||prenume==toBeFound) not needed 
    	    	System.out.println("ID: "+id+": "+name+" "+prenume+" "+email+" "+tel); //works
    	    	
    	    	//Client c=new Client(id,name,prenume,email,tel);
    	    	//System.out.println(c.toString());
    	    }
    	} catch (SQLException e) {
    	    e.printStackTrace();
    	} finally {
    	    mysqlConnect.disconnect();
    	}
	}
	public static int noClients() {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `clienti`";
		ResultSet rs = null;
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				
				noClients++;	
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return noClients;
	}
	public static String printName(int cId) {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `clienti`";
		ResultSet rs = null;
		String nume="";
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
			
				if(cId==rs.getInt("idClient"))
					nume = rs.getString("nume");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return nume;
	}
	public static String printPrenume(int cId) {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `clienti`";
		ResultSet rs = null;
		String prenume="";
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
			
				if(cId==rs.getInt("idClient"))
					prenume = rs.getString("prenume");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return prenume;
	}
	public static String printEmail(int cId) {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `clienti`";
		ResultSet rs = null;
		String email="";
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
			
				if(cId==rs.getInt("idClient"))
					email = rs.getString("email");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return email;
	}
	public static String printTel(int cId) {
		DBConnection mysqlConnect = new DBConnection();
		String sql = "SELECT * FROM `clienti`";
		ResultSet rs = null;
		String telefon="";
		int i = 1;
		try {
			PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
			
				if(cId==rs.getInt("idClient"))
					telefon = rs.getString("telefon");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mysqlConnect.disconnect();
    	}
		return telefon;
	}
	
}
