package Interfaces;

import javax.swing.JOptionPane;

import Interfaces.ProcesadorPago.ProcesadorPagos;

public class Banco1 implements ProcesadorPagos {

	public static double dinero = 89;
	String contraseña = "123";
	double cantidad = 25;

	public void realizarPago() {
		String pinI = JOptionPane.showInputDialog("\nIntroduzca el pin de la tarjeta");

		if (contraseña.equals(pinI)) {

			JOptionPane.showMessageDialog(null, "\nDispones del siguiente saldo: " + Banco1.dinero);

			Banco1.dinero = Banco1.dinero - cantidad;
			JOptionPane.showMessageDialog(null,
					"\nCantidad de Transaccion: " + cantidad + "\nDispones del siguiente saldo: " + Banco1.dinero);
		} else {
			JOptionPane.showMessageDialog(null, "\nERES UN FUCKING MILEURISTA");
		}

	}

	public void reembolsarPago() {

		Banco1.dinero = Banco1.dinero + cantidad;
		JOptionPane.showMessageDialog(null, "Operación aceptada," + "\nDispones del siguiente saldo: " + Banco1.dinero);
	}

}
