package Interfaces;

import javax.swing.JOptionPane;

public class Uso_Stock {

	public static void main(String[] args) {

		int x = 0;

		Producto1 almendras = new Producto1();
		Producto2 batido = new Producto2();

		int producto = Integer.parseInt(
				JOptionPane.showInputDialog("BIENVENIDE A SUPERMERCADOS MATA" + "\n1)Frutos secos" + "\n2)Bebidas"));

		switch (producto) {

		case 1:
			while (x < 3) {
				int opcion = Integer
						.parseInt(JOptionPane.showInputDialog("\n1)Ver stock" + "\n2)Actualizar stock" + "\n3)Salir"));
				switch (opcion) {
				case 1:
					almendras.obtenerStock();
					break;
				case 2:
					almendras.actualizarStock();
					break;

				case 3:
					x = 3;
					break;
				}
			}

			break;

		case 2:
			int y = 3;
			while (y < 3) {
				int opcion2 = Integer
						.parseInt(JOptionPane.showInputDialog("\n1)Ver stock" + "\n2)Actualizar stock" + "\n3)Salir"));
				switch (opcion2) {
				case 1:
					batido.obtenerStock();
					break;
				case 2:
					batido.actualizarStock();
					break;

				case 3:
					y = 3;
					break;
				}
			}
			break;
		}
	}

}
