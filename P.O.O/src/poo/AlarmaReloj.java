package poo;
import java.text.SimpleDateFormat;
import java.util.Date;

class RelojAlarma {
    private String horaAlarma;
    private String horaActual;
    private boolean alarmaActivada;

    public RelojAlarma() {
        this.horaAlarma = null;
        this.horaActual = null;
        this.alarmaActivada = false;
    }

    public void establecerHoraAlarma(String nuevaHoraAlarma) {
        this.horaAlarma = nuevaHoraAlarma;
    }

    public void activarAlarma() {
        this.alarmaActivada = true;
    }

    public void desactivarAlarma() {
        this.alarmaActivada = false;
    }

    public void actualizarHoraActual() {
        SimpleDateFormat formatofecha = new SimpleDateFormat("HH:mm");
        Date fecha = new Date();
        this.horaActual = formatofecha.format(fecha);
    }

    public void comprobarAlarma() {
        if (this.horaAlarma != null && this.horaActual != null && this.alarmaActivada) {
            if (this.horaActual.equals(this.horaAlarma)) {
                System.out.println("¡DESPIERTA RAMOOOON!");
            }
        }
    }
}
