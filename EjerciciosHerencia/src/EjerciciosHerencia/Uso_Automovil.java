package EjerciciosHerencia;

import javax.swing.JOptionPane;

public class Uso_Automovil {

	public static void main(String[] args) {
		Automovil automovil1 = new Automovil("Mercedes", "Clase C63", 2021, "Diesel");
		JOptionPane.showMessageDialog(null,"Caracteristicas básicas\n" + automovil1 + "Tipo de combustible: " + automovil1.dimeTipoCombustible());
	}

}
