package poo;

import java.util.Scanner;

public class Uso_RelojAlarma {
	public static void main(String[] args) {

        
        RelojAlarma Alarma = new RelojAlarma();

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora de la alarma (formato Hora : minuto)-> ");
        String horaAlarmaUsuario = scanner.nextLine();
        Alarma.establecerHoraAlarma(horaAlarmaUsuario);

        
        System.out.print("¿Desea activar la alarma? (true/false): ");
        boolean activarAlarmaUsuario = scanner.nextBoolean();
        if (activarAlarmaUsuario) {
            Alarma.activarAlarma();
        }

        
        Alarma.actualizarHoraActual();

        
        Alarma.comprobarAlarma();

        
        scanner.close();
    }


}