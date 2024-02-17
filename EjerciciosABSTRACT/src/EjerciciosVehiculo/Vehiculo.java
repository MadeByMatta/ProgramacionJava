package EjerciciosVehiculo;

abstract class Vehiculo {
	abstract void acelerar();

	abstract void frenar();
}

class coche extends Vehiculo {

	@Override
	void acelerar() {
		System.out.println("El coche va a 200 ;) ");
	}

	@Override
	void frenar() {
		System.out.println("El coche ya no va a 200 :( ");
		System.out.println("");

	}
}

class moto extends Vehiculo {
	@Override
	void acelerar() {
		System.out.println("La moto va a 200 ;) ");
	}

	void frenar() {
		System.out.println("La moto ya no va a 200 :( ");
		System.out.println("");
	}
}