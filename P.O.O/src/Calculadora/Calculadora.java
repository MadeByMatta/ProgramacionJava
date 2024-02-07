package Calculadora;

public class Calculadora {

	class Operacion {

		private final double impuesto;
		private int precio;
		private int precioImp;

		public Operacion(String precioStr) {

			precio = Integer.parseInt(precioStr);
			this.impuesto = precio * 1.15;
			precioImp = (int) (precio + impuesto);

		}

		public int getPrecio() {
			return precio;
		}

		public int getPrecioImp() {
			return precioImp;
		}

		public void setPrecioImp(int precioImp) {
			this.precioImp = precioImp;
		}

		public double getImpuesto() {
			return impuesto;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

		public int getPrecioIMP() {
			return precioImp;
		}

	}

}