package estudiantes;

import javax.swing.JOptionPane;

public class Uso_estudiantes {

	public static void main(String[] args) {
		estudiantes mata = new estudiantes();
		mata.setNombre(JOptionPane.showInputDialog("Introduce el nombre del alumno"));
		System.out.println(mata.getNombre());
		mata.setEdad(JOptionPane.showInputDialog("Introduce la edad del alumno"));
		System.out.println(mata.getEdad());
		mata.setGrado(JOptionPane.showInputDialog("Introduce el curso del estudiante"));
		System.out.println(mata.getGrado());
	}

}
