package Calculadora;

import javax.swing.JOptionPane;

public class Uso_Calculadora {

	public static void main(String[] args) {

		int control;
		do {

			String precioStr = JOptionPane.showInputDialog("(-1 SALIR)  Precio: ");
			control = Integer.parseInt(precioStr);
			if (control != -1) {
				Calculadora producto = new Calculadora();
				String text = "EL producto cuesta: " + producto.getPrecio() + " si le sumas el impuesto "
						+ "del 15% sería un total de:  " + producto.getPrecio();
				JOptionPane.showMessageDialog(null, text);
			}

		} while (control != -1);

	}

}
