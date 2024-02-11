package Sobrecarga;

public class Sobrecarga {

	class Animal {
		// Método para hacer sonido de un animal genérico
		public void hacerSonido() {
			System.out.println("El animal hace un sonido.");
		}
	}

	// Subclase Perro que hereda de Animal
	class Perro extends Animal {
		// Sobrescritura del método hacerSonido() para un perro

		public void hacerSonido() {
			System.out.println("El perro hace GUAUU.");
		}
	}

	// Subclase Gato que hereda de Animal
	class Gato extends Animal {
		// Sobrescritura del método hacerSonido() para un gato

		public void hacerSonido() {
			System.out.println("El gato hace MIAUU.");
		}
	}

	// Subclase Vaca que hereda de Animal
	class Vaca extends Animal {
		// Sobrescritura del método hacerSonido() para una vaca

		public void hacerSonido() {
			System.out.println("La vaca hace MUUU.");
		}
	}

	// Clase principal que contiene el método main
	public class SobrecargaMetodosAnimales {
		public static void main(String[] args) {
			Animal miAnimal = new Animal();
			Perro miPerro = new Perro();
			Gato miGato = new Gato();
			Vaca miVaca = new Vaca();

			// Llamadas a los métodos sobrecargados
			miAnimal.hacerSonido(); // El animal hace un sonido.
			miPerro.hacerSonido(); // El perro ladra.
			miGato.hacerSonido(); // El gato maulla.
			miVaca.hacerSonido(); // La vaca muge.
		}
	}

}
