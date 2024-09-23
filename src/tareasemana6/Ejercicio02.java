package tareasemana6;
/*Crea un programa en java, donde te permita ingresar una cantidad ,
y posteriormente  nos muestre la cantidad de digitos , la suma de los digitos 
ingresados y su promedio.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio02 {
    public static void main(String[] args) {
        int cant, cantdig = 0, suma = 0;
        Scanner lectura = new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");

        System.out.print("Ingrese la cantidad: ");
        cant = lectura.nextInt();

        // Guardamos una copia del valor original para el cálculo del promedio
        int numeroOriginal = cant;

        // Proceso para contar dígitos y calcular la suma
        while (cant > 0) {
            int dig = cant % 10; 
            suma += dig;         
            cantdig++;          
            cant /= 10;         
        }

        // Calculamos el promedio
        double promedio = cantdig > 0 ? (double) suma / cantdig : 0;

        // Mostramos los resultados
        System.out.println("La cantidad de dígitos del número es: " + cantdig);
        System.out.println("La suma de los dígitos es: " + suma);
        System.out.println("El promedio de los valores es: " +formato.format(promedio));
    }
}