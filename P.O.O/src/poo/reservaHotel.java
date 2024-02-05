package poo;

import java.util.Iterator;

public class reservaHotel {

	private int numHabi;
	private String tipoHabi;
	private Boolean libre = true;
	private int ocupadas[] = new int[10];
	private String tipoOcupadas[] = new String[10];

	public void habitacion(int numHabi, String habiTipo) {
		this.numHabi = numHabi;
		this.tipoHabi = tipoHabi;
		this.libre = false;
		for (int i = 0; i < ocupadas.length; i++) {
			if (ocupadas[i] == 0) {
				ocupadas[i] = numHabi;
				tipoOcupadas[i] = tipoHabi;
				break;
			} else if (ocupadas[i] == this.numHabi) {
				System.out.println("La habitacion ya está ocupada");
				break;
			}
		}

	}

	public void verHabi(int numHabi) {
		for (int i = 0; i < ocupadas.length; i++) {
			if (ocupadas[i] == this.numHabi) {
				System.out.println("Habitación ocupada");
			} else {
				System.out.println("Habitación libre");
			}
		}
	}

	public void cancela(int numHabi) {
		for (int i = 0; i < ocupadas.length; i++) {
			if (ocupadas[i] == this.numHabi) {
				ocupadas[i] = 0;
				System.out.println("Su reserva ha sido cancelada");
				break;
			} else {
				System.out.println("Su reserva no se ha encontrado");
				break;
			}
		}
	}

	public void disponibilidad() {
		System.out.println("Habitaciones ocupadas ->");
		for (int i = 0; i < ocupadas.length; i++) {
			System.out.print(ocupadas[i] + " " + tipoOcupadas[i]);
		}
	}

	public String resumen() {
		return "Has reservado la habitación numero " + numHabi + " que es una " + tipoHabi;
	}

}