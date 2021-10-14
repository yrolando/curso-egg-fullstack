/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma.
 */
package ejerciciosdifbaja;

import java.util.Scanner;

public class ejercicio1 {

   
    public static void main(String[] args) {
         
        Scanner num = new Scanner(
System.in
);
        int n1;
        int n2;
        int resultado;
        System.out.println("ingrese el primer numero");
        n1 = num.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = num.nextInt();

        resultado = n1 + n2;
        System.out.println("el resultado final es : " + resultado);

    }

}