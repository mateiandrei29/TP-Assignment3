package model;

public class Client {
	private int idClient;
	private String surname;
	private String name;
	private String email;
	private String telefon;
	
	public Client(int id,String n,String p,String email,String tel)
	{
		this.idClient=id;
		this.surname=n;
		this.name=p;
		this.email=email;
		this.telefon=tel;
		
	}
	public Client(String n,String p,String email,String tel)
	{
		
		this.surname=n;
		this.name=p;
		this.email=email;
		this.telefon=tel;
		
	}

	public int getIdClient() {
		return idClient;
	}



	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public String toString()
	{
		return "Client "+this.idClient+" cu numele: "+this.name+" "+this.surname+" cu mail: "+this.email+" si nr de telefon: "+this.telefon;
	}
	
}
