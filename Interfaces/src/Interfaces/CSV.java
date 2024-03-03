package Interfaces;

import javax.swing.JOptionPane;

import Interfaces.Exportable.Exportacion;

public class CSV implements Exportacion {
	public void exportarDatos() {
		JOptionPane.showMessageDialog(null, "\nLos datos que has exportdo están en" + "\nFormato: CSV");
	}
}
