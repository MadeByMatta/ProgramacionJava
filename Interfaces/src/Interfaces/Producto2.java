package Interfaces;

import javax.swing.JOptionPane;

import Interfaces.GestionStock.Inventario;

public class Producto2 implements Inventario {
	public static int cantidad = 20;

	@Override
	public void obtenerStock() {
		JOptionPane.showMessageDialog(null, "\nCantidad en stock: " + Producto2.cantidad);

	}

	@Override
	public void actualizarStock() {
		Producto2.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "\nIngrese cantidad actualizada"));

	}

}
