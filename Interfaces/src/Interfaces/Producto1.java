package Interfaces;


import javax.swing.JOptionPane;

import Interfaces.GestionStock.Inventario;

public class Producto1 implements Inventario {
	public static int cantidad = 33;

	@Override
	public void obtenerStock() {
		JOptionPane.showMessageDialog(null, "\nCantidad en stock: " + Producto1.cantidad);

	}

	@Override
	public void actualizarStock() {
		Producto1.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "\nIngrese cantidad actualizada"));

	}

}
