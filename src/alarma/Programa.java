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
public class Programa {

    public static void main(String[] args) {

        Timbre timbre = new Timbre();
        Bombilla bombilla = new Bombilla();
        SensorSwing sensor = new SensorSwing();
        Alarma alarma = new AlarmaLumninosa(sensor, timbre, bombilla, 0.0);
        sensor.setAlarma(alarma);

    }
}
