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
 * Alarma luminosa Uso de redefinición de métodos y polimorfismo
 *
 * Redefinición de los métodos activar() & desactivar()
 */
public class AlarmaLumninosa extends Alarma {

    Bombilla bombilla;

    /**
     * Constructor
     */
    public AlarmaLumninosa(Sensor sensor, Timbre timbre, Bombilla bombilla, double umbral) {

        super(sensor, timbre, umbral);
        this.bombilla = bombilla;

    }

    /**
     * Redefinición de los métodos activar & desactivar - Hemos de acordarnos de
     * llamar al método correspondiente de la clase Alarma
     */
    @Override
    public void Activar() {
        bombilla.Encender();
        super.Activar();
        System.out.println("Alarma lumninosa activada");
    }

    @Override
    public void Desactivar() {
        bombilla.Apagar();
        super.Desactivar();
        System.out.println("Alarma lumninosa desactivada");
    }
}
