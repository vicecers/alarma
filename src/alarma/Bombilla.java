/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarma;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author vicec
 */
public class Bombilla {

    private JFrame frame;

    /**
     * constructor
     */
    public Bombilla() {
        frame = new JFrame("Bombilla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
        Apagar();
    }

    /**
     * Encender bombilla
     */
    public void Encender() {
        frame.getContentPane().setBackground(Color.red);
        System.out.println("Rojo");
    }

    /**
     * Apagar bombilla
     */
    public void Apagar() {
        frame.getContentPane().setBackground(Color.green);
    }

}
