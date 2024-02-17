package EjerciciosFiguraGeomertrica;

abstract class FiguraGeometrica {
	abstract double calcularArea();
}

class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	double calcularArea() {
		return base * altura;
	}
}

class Circulo extends FiguraGeometrica {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	double calcularArea() {
		return Math.PI * radio * radio;
	}
}
