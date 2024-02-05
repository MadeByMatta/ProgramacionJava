package Contactos;

import javax.swing.JOptionPane;

public class Uso_Contactos {

	public static void main(String[] args) {
		
		Contactos[] agenda = new Contactos[100];

		while (true) {

			String opcion = JOptionPane.showInputDialog("1. Añadir contacto\n" + "2. Buscar contacto\n"
					+ "3. Mostrar contactos\n" + "4. Salir\n" + "Seleccione una opción:");

			switch (opcion) {
			case "1":

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] == null) {
						String nombre;
						String telefono;
						String oroscopo;
						agenda[i] = new Contactos(nombre = JOptionPane.showInputDialog("Introduzca el nombre:"),
								telefono = JOptionPane.showInputDialog("Introduzca el número de teléfono:"),
								oroscopo = JOptionPane.showInputDialog("Introduzca su oroscopo:"));
						break;
					}
				}

				JOptionPane.showMessageDialog(null, "Contacto añadido con éxito.");
				break;

			case "2":

				String buscarNombre = JOptionPane.showInputDialog("Introdusca el nombre que desea buscar:");
				String contactoEncontrado = "CONTACTO";

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i].getNombre().equalsIgnoreCase(buscarNombre)) {
						contactoEncontrado += "\nNOMBRE: " + agenda[i].getNombre() + "\nNUMERO: "
								+ agenda[i].getTelefono() + "\nOROSCOPO: " + agenda[i].getOroscopo();

						JOptionPane.showMessageDialog(null, contactoEncontrado);

						break;

					} else if (i > agenda.length) {
						JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
						break;
					}
				}

				break;

			case "3":

				String agendaCompleta = "AGENDA";

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] != null) {
						agendaCompleta += "\nNOMBRE: " + agenda[i].getNombre() + "\nNUMERO: " + agenda[i].getTelefono()
								+ "\nOROSCOPO: " + agenda[i].getOroscopo() + "\n___________________________________________";
					}
				}
				JOptionPane.showMessageDialog(null, agendaCompleta);

				break;

			case "4":

				JOptionPane.showMessageDialog(null, "Finalizando consulta.");
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
				break;
			}
		}

	}

}
