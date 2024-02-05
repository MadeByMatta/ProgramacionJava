package calificaciones;

import javax.swing.JOptionPane;

public class Uso_calificaciones {

	public static void main(String[] args) {

		calificaciones curso = new calificaciones();

		curso.setNombreCurso(JOptionPane.showInputDialog("¿Que curso estás haciendo?"));

		String calificacionStr = JOptionPane.showInputDialog("¿Que nota tienes en el curso?");
		double calificacion = Double.parseDouble(calificacionStr);
		curso.setNota(calificacion);

		curso.categorizarCalificacion();

	}
}
