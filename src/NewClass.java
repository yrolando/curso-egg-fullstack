/ Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
       //por pantalla
package ejerciciosdifbaja;

import java.util.Scanner;


public class ejercicio2 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(
System.in
);
        String nombre;
        System.out.println("ingrese su nombre");
        nombre = 
leer.next
();
        System.out.println("el nombre ingresado es " + nombre); 
    }
    
}