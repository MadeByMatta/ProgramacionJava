package Polimorfismo;

public class EjercicioPolimorfismo {

	class Animal {
		public void hacerSonido() {
			System.out.println("El animal hace un sonido.");
		}
	}

	// Definición de la subclase Perro que hereda de Animal
	class Perro extends Animal {

		public void hacerSonido() {
			System.out.println("El perro ladra.");
		}
	}

	// Clase principal que contiene el método main
	public class PolimorfismoInclusion {
		public static void main(String[] args) {
			// Crear instancia de Perro y asignarla a una variable de tipo Animal
			Animal miAnimal = new Perro();

			// Llamar al método hacerSonido(), el cual se ejecutará dependiendo del tipo de
			// objeto
			miAnimal.hacerSonido(); // El perro ladra.
		}
	}

}
