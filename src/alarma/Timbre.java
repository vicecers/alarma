
package alarma;

/**
 * Timbre
 */
import java.awt.Toolkit;
import static java.lang.Thread.sleep;

/**
 *
 * @author vicec
 */
public class Timbre {

    public static final int PITIDOS = 5;

    /**
     * Activar el timbre
     */
    public void Activar() {
        for (int i = 0; i < PITIDOS; i++) {
            Toolkit.getDefaultToolkit().beep();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public void Desactivar() {

    }

    /**
     * Prueba
     */
    /*
      public static void main(String args[]) { 
      Timbre timbre = new Timbre();
      timbre.Activar(); }
     */
}
