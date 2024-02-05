package Empleados;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Uso_Empleados {
	public static void main(String[] args) {

		String nombre = JOptionPane.showInputDialog("¿Como te llamas?");
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es tu sueldo diario?"));
		int año = Integer.parseInt(JOptionPane.showInputDialog("¿En que año entraste a la empresa?"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("¿En que mes entraste a la empresa?"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("¿En que dia entraste a la empresa?"));

		Empleado nuevo = new Empleado(nombre, sueldo, año, mes, dia);

		System.out.println("Nombre: " + nuevo.dameNombre());
		System.out.println("Sueldo: " + nuevo.dameSueldo());
		System.out.println("Inicio de Contrato: " + nuevo.dameFechaContrato());
	}
}

class Empleado {
	private String nombre;
	private double sueldo;
	private Date alta_contrato;

	public Empleado(String nom, double sue, int ano, int mes, int dia) {
		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia);
		alta_contrato = calendario.getTime();
	}

	public String dameNombre() {
		return nombre;
	}

	public void estableceNombre(String nom) {
		this.nombre = nom;
	}

	public double dameSueldo() {
		return sueldo;
	}

	public void estableceSueldo(double sue) {
		this.sueldo = sue;
	}

	public Date dameFechaContrato() {
		return alta_contrato;
	}

	public void estableceFecha(int ano, int mes, int dia) {
		GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia);
		this.alta_contrato = calendario.getTime();
	}

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
}
