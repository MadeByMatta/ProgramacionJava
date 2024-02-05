package Calculadora;

import javax.swing.JOptionPane;

public class Uso_Calculadora {

	public static void main(String[] args) {

		int control;
		do {

			String precioStr = JOptionPane.showInputDialog("(-1 SALIR)  Precio: ");
			control = Integer.parseInt(precioStr);
			if (control != -1) {
				Calculadora producto = new Calculadora ();
				String text = "EL producto tiene un precio de " + producto.getPrecio() + " y con el impuesto "
						+ "del 15% quedaria en " + producto.getPrecio();
				JOptionPane.showMessageDialog(null, text);
			}

		} while (control != -1);

	}

}
