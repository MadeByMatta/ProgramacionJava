package Interfaces;

public class Producto implements stock {
	private String nombre;
	private int stock;
	
	public Producto (String nombre, int stock) {
		this.nombre = nombre;
		this.stock = stock;
	}
	
	public int obtenerStock() {
		return stock;
	}
	
	public int actualizarStock() {
		int cantidad;
		return  cantidad;
	}
}



