package calificaciones;

import javax.swing.JOptionPane;

public class calificaciones {

	private String curso;
	private double nota;

	public void setNombreCurso(String nombreCurso) {
		this.curso = nombreCurso;
	}

	public void setNota(double calificacion) {

		this.nota = calificacion;
	}

	public void categorizarCalificacion() {
		char aptitud;

		switch ((int) nota / 10) {
		case 10:
		case 9:
			aptitud = 'A';
			break;
		case 8:
			aptitud = 'B';
			break;
		case 7:
			aptitud = 'C';
			break;
		case 6:
			aptitud = 'D';
			break;
		default:
			aptitud = 'F';
		}

		String mensaje = "Nombre del curso: " + curso + "\nCalificación: " + nota + "\nCategoría: " + aptitud;
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
