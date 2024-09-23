
package tareasemana6;

/*Escribir un programa que muestre los numeros pares menores a 100, contar 
cuantos numeros se mostraron y calcular la suma de ellos.
por ejemplo:
cantidad de numeros pares mostrados: 50
suma de los numeros pares : 2450
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[]args){
      
        int num = 0, cantN = 0, suma = 0;

        System.out.println("Números pares menores a 100:");

        // Proceso
        while (num < 100) {
            if (num % 2 == 0) { 
                System.out.println(num); 
                cantN++;
                suma += num; 
            }
            num++; 
        }

        // SALIDA
        System.out.println("Cantidad de números pares mostrados: " + cantN);
        System.out.println("Suma de los números pares: " + suma);
    }
}