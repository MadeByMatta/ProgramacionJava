package EjerciciosFiguraGeomertrica;

public class Uso_FiguraGeometrica {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(7, 2.5);
		System.out.println("El area del réctangulo es: " + rectangulo.calcularArea());

		Circulo circulo = new Circulo(3.25);
		System.out.println("El area del circulo es: " + circulo.calcularArea());
	}

}
