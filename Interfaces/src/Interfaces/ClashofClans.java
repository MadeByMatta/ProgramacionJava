package Interfaces;

import javax.swing.JOptionPane;

import Interfaces.Notificaciones.Notificacion;

public class ClashofClans implements Notificacion {
	public void enviarNotificacion() {
		JOptionPane.showMessageDialog(null,
				"\nClash of Clans: " + "\nJefe la aldea está siendo atacada por ManolitoGafotas69");
	}
}
