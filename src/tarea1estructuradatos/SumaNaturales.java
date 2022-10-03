package tarea1estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author tannyagranados
 */
public class SumaNaturales {

    public int IngreseNumero() {
        int Num = Integer.parseInt(JOptionPane.showInputDialog(
                "Favor ingrese el número natural hasta "
                + "donde desea realizar la sumatoria: "));
        return Num;
    }

    public int SumaNumNaturales(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + SumaNumNaturales(n - 1);
        }
    }
}
