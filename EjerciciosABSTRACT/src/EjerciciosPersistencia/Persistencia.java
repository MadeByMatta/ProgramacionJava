package EjerciciosPersistencia;

abstract class Persistencia {

	abstract void guardarDatos();

	abstract void cargarDatos();

}

class Archivo extends Persistencia {

	@Override

	void guardarDatos() {
		System.out.println("Estoy guardando los datos en un archivo, PORFAVOR ESPERE");
	}

	@Override
	void cargarDatos() {
		System.out.println("Procedo a cargar los datos del archivo: ");
	}

	class BasedeDatos extends Persistencia {
		@Override
		void guardarDatos() {
			System.out.println("Voy a guardar los datos en una BB.DD, ESPERE PORFAVOR ");
		}

		@Override
		void cargarDatos() {
			System.out.println("Procedo a cargar los datos de la BB.DD: ");
		}
	}

}
