
package tarea1estructuradatos;

/**
 *
 * @author tannyagranados
 */
public class RecursiveFunctions {
    
    public double Factorial(int num){
        if (num==0){
            return 1;
        }
        else{
            return num*Factorial(num-1);
        } 
    }
    
    public double calcExponencial(int base, int exp){
        //int i = 0;
        if(exp==0){
            return 1;
        }
        else {
            return base*calcExponencial(base, exp-1)/Factorial(exp);
        }
        
    }
    
    public double Fact(int num){
        double result = 1;
        for (int i=1;i<=num;i++){
            result=result*i;
        }
        return result;
    }
    
    public double calcExp(int n, int x){
        double result = 0;
        for (int i=0;i<n; i++){
            result = result + (Math.pow(x, i)/Fact(i));
        }
        return result;
    }
}
