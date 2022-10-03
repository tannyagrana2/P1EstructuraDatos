
package tarea1estructuradatos;

import java.util.Scanner;

/**
 *
 * @author Tannya Granados Guerrero, Bryan Cantillo Aguilar
 */
public class Tarea1EstructuraDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecursiveFunctions recursividad = new RecursiveFunctions();
        SumaNaturales naturalesRecursividad = new SumaNaturales();
        Vocales vocalesRecursividad = new Vocales();
        NumeroBinario binarioRecursividad = new NumeroBinario();  
        //EJERCICIO A
        System.out.println("Por favor digite la palabra: ");
        String palabra = sc.nextLine();
        char[] array = palabra.toCharArray();
        array = vocalesRecursividad.eliminarVocalesR(0,array);
        String conversion = String.valueOf(array);
        System.out.println(conversion);
        //EJERCICIO B
        System.out.println("Por favor digite el limite de la sumatoria: ");
        int n = sc.nextInt();
        System.out.println("Sumatoria de numeros de 1 hasta "
                +n+ " es: "+ naturalesRecursividad.SumaNumNaturales(n));   
        //EJERCICIO C
        System.out.println("Digite el numero: ");
        int b = sc.nextInt();
        System.out.println(binarioRecursividad.VerifyNumber(b));
        //EJERCICIO D
        System.out.println("Exponencial " + recursividad.calcExponencial(7, 7));
        System.out.println("Exponencial recursivo " + recursividad.calcExponencialR(7, 7));
        System.out.println("Exponencial " + recursividad.factorial(7));
        System.out.println("Exponencial " + recursividad.factorialR(7));
    }
}
