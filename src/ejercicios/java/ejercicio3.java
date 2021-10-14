/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/
package ejerciciosdifbaja;

import java.util.Scanner;

public class ejercicio3 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(
System.in
).useDelimiter("\n");  //para que lea la frase completa , USAR SIEMPRE !
        
        System.out.println("ingrese una frase");
        
        String frase = 
leer.next
();
        
        System.out.println("la frase en mayusculas quedaria: " + frase.toUpperCase());
        System.out.println("la frase en minusculas quedaria: " + frase.toLowerCase());

    }
    
}