package ED_04.Arrays_06;
import java.util.Scanner;
/*
 * Escribe un programa que cree un array de tamaño 7, lo rellene con numeros aleatorios
 * entre 1 y 100 y luego imprima el array antes y despues de ordenarlo en orden ascendente
 */
public class ordenarArray {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in); 

        int[] random=new int[7]; 

        System.out.println("El orden incial es: ");
        for (int i=0; i<random.length; i++){
            random[i] = (int) (Math.random()*100)+1;
            System.out.println(random[i]);
        }

        java.util.Arrays.sort(random);

        System.out.println("El orden final es: ");
        for (int i=0; i<random.length; i++){
            System.out.println(random[i]);
        }

        Scanner.close();
    }
}
