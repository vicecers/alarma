package alarma;

/**
 *
 * @author vicec
 */
/**
 * Alarma
 */
public class Alarma {

    private Sensor sensor;
    private Timbre timbre;
    private double umbral;

    /**
     * Constructor
     */
    public Alarma(Sensor sensor, Timbre timbre, double umbral) {
        this.sensor = sensor;
        this.timbre = timbre;
        this.umbral = umbral;
    }

    /**
     * Comprobar estado de la alarma
     */
    public void Comrobar() {
        if (sensor.getValorActual() > umbral) {
            Activar();
        } else {
            Desactivar();
        }
    }

    void Activar() {
        timbre.Activar();
    }

    void Desactivar() {
        timbre.Desactivar();
    }

}
