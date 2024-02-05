package Contactos;

public class Contactos {

	private String nombre;
	private String telefono;
	private String oroscopo;

	
	public Contactos(String nombre, String telefono, String oroscopo) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.oroscopo = oroscopo;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getOroscopo() {
		return oroscopo;
	}

	public void setEmail(String oroscopo) {
		this.oroscopo = oroscopo;
	}
	
}
