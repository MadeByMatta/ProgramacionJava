package Interfaces;

import javax.swing.JOptionPane;

import Interfaces.ProcesadorPago.ProcesadorPagos;

public class Banco2 implements ProcesadorPagos {

	public static double dinero = 12;
	String contraseña = "456";
	double cantidad = 20;

	public void realizarPago() {
		String pinI = JOptionPane.showInputDialog("\nIntroduzca el pin de la tarjeta");

		if (contraseña.equals(pinI)) {

			JOptionPane.showMessageDialog(null, "\nDispones del siguiente saldo: " + Banco2.dinero);

			Banco2.dinero = Banco2.dinero - cantidad;
			JOptionPane.showMessageDialog(null,
					"\nCantidad de Transaccion: " + cantidad + "\nDispones del siguiente saldo: " + Banco2.dinero);
		} else {
			JOptionPane.showMessageDialog(null, "\nERES UN FUCKING MILEURISTA");
		}

	}

	public void reembolsarPago() {

		Banco2.dinero = Banco2.dinero + cantidad;
		JOptionPane.showMessageDialog(null, "Operación aceptada," + "\nDispones del siguiente saldo: " + Banco2.dinero);

	}

}
