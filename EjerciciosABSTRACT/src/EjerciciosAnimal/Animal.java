package EjerciciosAnimal;

abstract class Animal {

	abstract void sonido();

	abstract void moverse();

}

class perro extends Animal {
	@Override
	void sonido() {
		System.out.println("Soy un perro y hago GUAUUU");
	}
	
	@Override
	void moverse() {
		System.out.println("Voy a ir a dar un paseo");
		System.out.println("");
	}
}

class oveja extends Animal{
	@Override
	void sonido() {
		System.out.println("Soy una oveja y hago BEEEE");
	}
	
	@Override
	void moverse() {
		System.out.println("Hoy me van a esquilar para coger mi lana");
		System.out.println("");
	}
	

}


