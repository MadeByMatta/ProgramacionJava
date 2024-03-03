package Interfaces;

import javax.swing.JOptionPane;

public class Uso_ProcesadorPago {

	public static void main(String[] args) {

		Banco1 Caixa = new Banco1();
		Banco2 BBVA = new Banco2();

		JOptionPane.showMessageDialog(null, "\nCuenta particular de Manolo");
		Caixa.realizarPago();
		BBVA.reembolsarPago();

		JOptionPane.showMessageDialog(null, "\nCuenta particular de Eusebio");
		BBVA.realizarPago();
		Caixa.reembolsarPago();

	}

}
