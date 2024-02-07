package Convertidor;

public class Convertidor {

	private int kilometros;
	private String tipo;
	private final int arregloKilMill = 32;
	private final double converKilMill = 1.8;

	public Convertidor(String tipo, int grados) {
		this.kilometros = kilometros;
		if (tipo.equalsIgnoreCase("Kilometros")) {
			this.tipo = "Millas";
			this.kilometros = (int) ((kilometros * converKilMill) + arregloKilMill);
		} else if (tipo.equalsIgnoreCase("Millas")) {
			this.tipo = "Kilometros";
			this.kilometros = (int) ((kilometros - arregloKilMill) / converKilMill);
		}
	}

	public String getKilometros() {

		return " Son " + this.kilometros + " " + this.tipo;
	}

}
