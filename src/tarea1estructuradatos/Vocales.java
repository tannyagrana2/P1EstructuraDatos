package tarea1estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author tannyagranados
 */
public class Vocales {
    
    String Oracion = JOptionPane.showInputDialog("Ingrese la oración: ");

     public void CambiarVocales(){    
        String [] Arreglo = Oracion.split("");
        for (int x=0; x< Arreglo.length; x++){
            switch (Arreglo[x]) {
                case "a":
                    Arreglo[x]="";
                    break;
                case "e":
                    Arreglo[x]="";                  
                    break;
                case "i":
                    Arreglo[x]="";                  
                    break;
                case "o":
                    Arreglo[x]="";                    
                    break;
                case "u":
                    Arreglo[x]="";                   
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, Arreglo);
        
    }
    
    
}
    

    

