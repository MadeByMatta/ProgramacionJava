package Convertidor;

import javax.swing.JOptionPane;

public class Uso_Convertidor {

	public static void main(String[] args) {
		String opcion;

		do {

			opcion = JOptionPane.showInputDialog("Cálculo || Salir");
			if (opcion.equalsIgnoreCase("Cálculo")) {
				String tipo = JOptionPane.showInputDialog("¿Quieres convertir KILÓMETROS O MILLAS?: ");
				String grados = JOptionPane.showInputDialog("KILÓMETROS: ");
				String kilometros = null;
				int kilometrosInt = Integer.parseInt(kilometros);

				Convertidor conversor = new Convertidor(tipo, kilometrosInt);
				JOptionPane.showInternalMessageDialog(null, conversor.getKilometros());
			} else if (opcion.equalsIgnoreCase("salir")) {
				String mensaje = "TERMINADO";
				JOptionPane.showInternalMessageDialog(null, mensaje);
			} else {
				String mensaje2 = "Opcion INCORRECTA";
				JOptionPane.showInternalMessageDialog(null, mensaje2);
			}

		} while (opcion == "Salir");

	}

}
