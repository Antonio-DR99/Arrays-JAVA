package ED_04.Arrays_06;
/*
 * Escribe un programa que cree un array con los nuemros del 1 al 20 
 * Luego imprime solamente los numeros impares
 */
public class numerosImpares {
    public static void main(String[] args) {
        
        int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 

        for (int i=0;i<num.length; i++){

            if (num[i]%2==0) {
                System.out.println(num[i]);
                
            }
        }
    }
    
}
