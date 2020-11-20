/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarma;

/**
 *
 * @author vicec
 */
/**
 * Clase genérica para representar un sensor
 */
public class Sensor {

    public Sensor() {
    }
    /**
     * Valor actual medido por el sensor
     */
    private double valorActual;

    /**
     * Acceso al valor medido por el sensor
     */
    public double getValorActual() {
        return valorActual;
    }

    /**
     * Modificación del valor del sensor (algo de lo que se encargan las
     * subclases particulares de Sensor)
     */
    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

}
