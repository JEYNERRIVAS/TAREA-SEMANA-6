
package tareasemana6;

/*Crear un programa en java que permita ingresar el nombre del ciudadano, su 
numero de documento de identidad, y hallar la cantidad de digitos de su documento,
cantidad de digitos pares,suma de digitos pares.
por ejemplo:
Nombre=JEYNER RIVAS ZULOETA
Dni:42040656
cantidad de digitos es= 8
Cantidad de digitos pares =7
Suma de digitos pares=22

 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
         int DNI,cant,cantP,sumaP,dig,residuo;
         String Ciudadano;
         Scanner lectura=new Scanner(System.in);
         System.out.print("Ingrese el nombre del ciudadano : ");
         Ciudadano=lectura.nextLine();
         System.out.print("Ingrese el DNI del ciudadano : ");
         DNI=lectura.nextInt();
         
         cant=0;
         cantP=0;
         sumaP=0;
         residuo=0;

         while (DNI>0) {
          dig=DNI%10;
          cant++;
          
          residuo=dig%2;
             if (residuo==0) {
                 cantP++;
                 sumaP +=dig;
             }
             DNI=DNI/10;
              
             }
             System.out.println("La cantidad de digitos pares del DNI del  ciudadano "+Ciudadano+ " es de : "+cant);
             System.out.println("La suma de digitos pares es de : "+sumaP);
             System.out.println("La cantida de digitos pares es de  : "+cantP);

    }
    
}
