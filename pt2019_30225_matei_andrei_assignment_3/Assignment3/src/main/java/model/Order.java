package model;

import java.util.ArrayList;

public class Order {
	private int idComanda;
	private int cantitate;
	private int idProdus;
	private int idClient;
	
	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public int getIdComanda() {
		return idComanda;
	}

	public int getIdProdus() {
		return idProdus;
	}

	public int getIdClient() {
		return idClient;
	}

	public Order(int idComanda, int idClient, int idProdus, int cantitate) {
		super();
		this.idComanda = idComanda;
		this.cantitate = cantitate;
		this.idProdus = idProdus;
		this.idClient = idClient;
	}
	public Order(int idClient, int idProdus, int cantitate) {
		super();
		this.cantitate = cantitate;
		this.idProdus = idProdus;
		this.idClient = idClient;
	}
	public String toString()
	{
		return "Comanda cu numarul "+this.idComanda+" a clientului cu id: "+this.idClient+" A comandat produsul cu id : "+this.idProdus+" cu cantiatea: "+this.cantitate;
	}
	

	
	
	
}
