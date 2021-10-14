package ejercicios.java;
public class ej28 {
import java.util.Random;
import java.util.Scanner;
public class ej28 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        System.out.println("Matriz M de 10x10 Generado:");
        int[][] matrizM = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = random.nextInt((101 - 0) + 0); //random.nextInt((MAX - min) + min)
            }
        }

        System.out.println("Matriz M 10x10");
        for (int[] fila : matrizM) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);

        }
        int suma2 = 0;
        System.out.println("Ingres los elemento de la Matriz P de 3x3 (0 a 100):");
        int[][] matrizP = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("M[" + i + "][" + j + "]:");
                    matrizP[i][j] = leer.nextInt();
                    if (matrizP[i][j] >= 0 && matrizP[i][j] <= 100) {
                        suma2 = suma2 + matrizP[i][j];
                    }
                } while (matrizP[i][j] < 0 || matrizP[i][j] > 100);
            }
        }

        System.out.println("Matriz P 3x3");
        for (int[] fila : matrizP) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }

        int suma1 = 0;
        int k = 0;
        int l = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[k][l]) {
                    for (k = i; k < i + 3; k++) {
                        for (l = j; l < j + 3; l++) {
                            if (matrizM[k][l] == matrizP[a][b]) {
                                suma1 = suma1 + matrizP[a][b];
                                System.out.print("[" + k + "][" + l + "]  ");
                            } else {

                                suma1 = 0;

                            }
                            b++;
                        }
                        System.out.println("");
                        a++;
                        b = 0;
                    }
                    k = 0;
                    l = 0;
                    a = 0;
                    b = 0;
                }
            }
        }
        System.out.println("↑↑↑↑↑Se encontro coincidencia hasta ese valor↑↑↑↑↑");
        if (suma2 == suma1) {
            System.out.println("La matriz P de 3x3 esta en la matriz M de 10x10");
        } else {
            System.out.println("La matriz P de 3x3 no se encuantra en la matriz M de 10x10");
        }

    }

}





