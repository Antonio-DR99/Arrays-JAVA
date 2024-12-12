package ED_04.Arrays_06;
/*
 * Escribe un programa en java que cree un arrays de tamaño 10 
 * lo rellene con los primeros 10 numeros pares y los imprima por pantalla
 */

public class numerosPares {
    public static void main(String[] args) {
        
        int[] numeros= new int[10]; 

        for(int i=0; i<numeros.length; i++){
            numeros[i] = (i*2); 
        }

        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
