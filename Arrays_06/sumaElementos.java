package ED_04.Arrays_06;
import java.util.Scanner; 
/*
 * Escribee un programa en java que permita al usario ingresar 5 nuemros enteros. 
 * Estos numeros deben almacenarse en un arrays y luego el programa debe calcular e imprimir la 
 * suma de todos los elementos
 */
public class sumaElementos {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in); 

        int[] numeros= new int[5]; //almacena los 5 nuemros
        int contador=0; //contador del bucle
        int suma=0; //almacenamos la suma total de numeros

        do {
            System.out.println("Dime 5 numeros enteros: ");
            numeros[contador]= Scanner.nextInt(); //guardamos cada numero
            suma+=numeros[contador]; //añadimos el numero de la suma 
            contador++; //incrementamos el contador
        } while (contador<5);

        System.out.println("La suma total es: "+suma);

        Scanner.close();
    }
}
