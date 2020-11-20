/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Sensor "ficticio"
 * Demostración del uso de JButton, JTextField & JLabel
 */
package alarma;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author vicec
 */
public class SensorSwing extends Sensor implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton boton;
    private JTextField editor;
    private JLabel info;

    private Alarma alarma;

    /**
     * Constructor
     */
    public SensorSwing() {
        // Ventana (JFrame)
        frame = new JFrame("Medidor del \"grado de alarma\"");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        // Panel (JPanel)
        // ...donde se colocan los controles de la interfaz de usuario
        panel = new JPanel(new GridLayout(3, 1));

        // Controles de la interfaz de usuario
        // -----------------------------------
        editor = new JTextField(5);
        info = new JLabel("Valor actual... " + SwingConstants.CENTER);
        boton = new JButton("Actualizar");
        // Manejador de eventos asociado al botón
        boton.addActionListener(this);

        // Colocar los controles en el panel
        panel.add(editor);
        panel.add(boton);
        panel.add(info);

        // Botón por defecto
        frame.getRootPane().setDefaultButton(boton);
        // Añadir el panel a la ventana
        frame.getContentPane().add(panel);

        // Mostrar la ventana
        frame.setVisible(true);

    }

    /**
     * Alarma asociada
     */
    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    /**
     * Pulsación del botón.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        setValorActual(Double.parseDouble(editor.getText()));
        info.setText("Valor Actual = " + getValorActual());
        if (alarma != null) {
            alarma.Comrobar();
        }
    }

}
