package Herencia;

public class EjercicioHerencia {
	
	class Animal {
	    String nombre;
	    int edad;

	    public Animal(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public void comer() {
	        System.out.println(nombre + " está comiendo.");
	    }

	    public void dormir() {
	        System.out.println(nombre + " está durmiendo.");
	    }
	}

	// Definición de la subclase Perro que hereda de Animal
	class Perro extends Animal {
	    public Perro(String nombre, int edad) {
	        super(nombre, edad);
	    }

	    public void ladrar() {
	        System.out.println(nombre + " GUAUU.");
	    }
	}

	// Definición de la subclase Gato que hereda de Animal
	class Gato extends Animal {
	    public Gato(String nombre, int edad) {
	        super(nombre, edad);
	    }

	    public void maullar() {
	        System.out.println(nombre + " MIAUU.");
	    }
	}

	// Clase principal que contiene el método main
	public class ProgramaHerencia {
	    public static void main(String[] args) {
	        // Crear una instancia de Perro
	        Perro miPerro = new Perro ("Agus", 4);
	        miPerro.comer(); // Método heredado de la clase Animal
	        miPerro.dormir(); // Método heredado de la clase Animal
	        miPerro.ladrar(); // Método propio de la clase Perro

	        // Crear una instancia de Gato
	        Gato miGato = new Gato("Garfield", 5);
	        miGato.comer(); // Método heredado de la clase Animal
	        miGato.dormir(); // Método heredado de la clase Animal
	        miGato.maullar(); // Método propio de la clase Gato
	    }
	}

}
