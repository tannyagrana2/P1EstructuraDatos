
package tarea1estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author tannyagranados
 */
public class NumeroBinario {
    
    public int VerifyNumber(int num){
        int a = 0;
        int b = 0;
        if(num<0){
            if(a!=b){
                JOptionPane.showMessageDialog(null,"El número es binario");
            }
            else{
                JOptionPane.showMessageDialog(null,"El número NO es binario");
            }
        }
        else if(num%10==0||num%10==1){
            a++;
            num/=10;
            //return VerifyNumber(num/10);
        }
        
        return VerifyNumber(num/10);
    }  
}
