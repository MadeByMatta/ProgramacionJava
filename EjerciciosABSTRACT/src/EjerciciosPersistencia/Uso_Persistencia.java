package EjerciciosPersistencia;

import EjerciciosPersistencia.Archivo.BasedeDatos;

public class Uso_Persistencia {

	public static void main(String[] args) {
		Archivo txt = new Archivo();
		BasedeDatos SQL = new BasedeDatos();

		txt.guardarDatos();
		txt.cargarDatos();

		SQL.guardarDatos();
		SQL.cargarDatos();

	}

}
