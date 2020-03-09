package model;

public class Product {
	private int idProdus;
	private String name;
	private int quantity;
	private float price;
	
	public Product(String name,int qt,float price)
	{
		this.name=name;
		this.quantity=qt;
		this.price=price;
	}
	public Product(int id,String name,int qt,float price)
	{
		this.idProdus=id;
		this.name=name;
		this.quantity=qt;
		this.price=price;
	}
	public int getIdProdus() {
		return idProdus;
	}

//	public void setIdProdus(int idProdus) {
//		this.idProdus = idProdus;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public boolean isInStock()
	{
		return (this.getQuantity()<0)? false:true;
		
	}
	public void decreaseStock()
	{
		this.quantity--;
	}
	public String toString()
	{
		return "Produs "+this.idProdus+" cu numele: "+this.name+" "+ " cu cantitate: "+this.quantity+" si pret: "+this.price;
	}
	
	
	
}
