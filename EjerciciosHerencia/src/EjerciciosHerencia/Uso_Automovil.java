package EjerciciosHerencia;

import javax.swing.JOptionPane;

public class Uso_Automovil {

	public static void main(String[] args) {
		Automovil mercedes = new Automovil("Mercedes", "Clase C63", 2021, "Diesel");
		JOptionPane.showMessageDialog(null,"Caracteristicas básicas\n" + mercedes + "Tipo de combustible: " + mercedes.dimeTipoCombustible());
	}

}
