package empleado;

import javax.swing.JOptionPane;

public class Uso_empleado {

	public static void main(String[] args) {
		empleado empleado = new empleado();
		
		for (int i = 0; i < 2 ; i++) {
			empleado.EMPLEADO(JOptionPane.showInputDialog("Introduce tu nombre: "));
			empleado.HORAS(JOptionPane.showInputDialog("Horas trabajadas: "));
			empleado.PRECIOxHORA(JOptionPane.showInputDialog("Precio por hora: "));
		}
	
		
		empleado.SALARIO();
		

	}

}
