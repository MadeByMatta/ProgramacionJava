package empleado;

import javax.swing.JOptionPane;

public class empleado {

	private String empleado[] = new String[5];
	private int horasTrabajadas[] = new int[5];
	private double precioHora;
	private double salario[] = new double[5];

	public String SALARIO() {
		for (int i = 0; i < salario.length; i++) {
			if (empleado[i] != null || horasTrabajadas[i] != 0 || salario[i] != 0) {
				String mensaje = empleado[i] + " HORAS-> " + horasTrabajadas[i] + " | SALARIO-> " + salario[i];
				JOptionPane.showMessageDialog(null, mensaje);
			}

		}

		return null;

	}

	public void EMPLEADO(String empleado) {
		for (int i = 0; i < this.empleado.length; i++) {
			if (this.empleado[i] == null) {
				this.empleado[i] = empleado;
				break;
			}
		}
	}

	public void HORAS(String horasTrabajadas) {

		int horas = Integer.parseInt(horasTrabajadas);

		for (int i = 0; i < this.horasTrabajadas.length; i++) {
			if (this.horasTrabajadas[i] == 0) {
				this.horasTrabajadas[i] = horas;
				break;
			}
		}
	}

	public void PRECIOxHORA(String precioHora) {
		this.precioHora = Double.parseDouble(precioHora);
		for (int i = 0; i < horasTrabajadas.length; i++) {
			this.salario[i] = this.horasTrabajadas[i] * this.precioHora;
		}

	}

	
	}

