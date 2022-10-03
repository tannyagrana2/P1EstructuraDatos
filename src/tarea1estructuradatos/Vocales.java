package tarea1estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author tannyagranados
 */
public class Vocales {

    public static char[] eliminarVocalesR(int i, char[] array) {
        if (i == array.length) {
            return array;
        } else {
            char aux = array[i];
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u'
                    || aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
                array[i] = ' ';
            }
            return eliminarVocalesR(i + 1, array);
        }
    }
}
