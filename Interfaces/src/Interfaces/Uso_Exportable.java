package Interfaces;

public class Uso_Exportable {

	public static void main(String[] args) {
		CSV uno = new CSV();

		uno.exportarDatos();

		PDF dos = new PDF();

		dos.exportarDatos();

	}

}
