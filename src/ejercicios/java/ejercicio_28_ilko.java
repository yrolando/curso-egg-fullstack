/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java;

import java.util.Random;

/**
 *
 * @author yrola
 */
public class ejercicio_28_ilko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrizA[][] = new int[10][10];
        int matrizB[][] = new int[3][3];
        String coordenadas = null;
        boolean encontrado = false;
        
        int a = 0;
        do{
        
            llenarMatriz(matrizA);
            llenarMatriz(matrizB);
        
            int i = 0;
            int j = 0;
            
            do{
                j=0;
                do{
                    if(matrizB[0][0] == matrizA[i][j]){
                        int x = 0;
                        int y;
                        do{
                            y = 0;
                            do{
                                if(matrizB[x][y] == matrizA[i+x][j+y]){
                                    if(coordenadas == null){
                                        coordenadas = Integer.toString(i+x)
                                            + "-" + Integer.toString(j+y) + " ";
                                    }else{
                                        coordenadas = coordenadas + Integer.toString(i+x)
                                            + "-" + Integer.toString(j+y) + " ";
                                    }
                                    y++;
                                    encontrado = true;
                                }else{
                                    coordenadas = null;
                                    encontrado = false;
                                }
                            }while(coordenadas != null && y < 3);
                            x++;
                        }while(coordenadas != null && x < 3);
                    }
                    
//System.out.println
//(i + "-" + j);
                    j++;
                }while(j<8 && !encontrado);
                i++;
            }while(i<8 && !encontrado);
            
            a++;
        }while(!encontrado);
        for(int i = 0; i<10; i++){
            for(int j = 0; j <10; j++){
                if (j == 9) {
                    System.out.println(matrizA[i][j]);
                }else{
                    System.out.print(matrizA[i][j] + " ");
                }
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (j == 2) {
                    System.out.println(matrizB[i][j]);
                }else{
                    System.out.print(matrizB[i][j] + " ");
                }
            }
        }
        
        System.out.println("\n" + coordenadas);
        
        System.out.println("Intentos realizados: " + a);
        
    }
public static void llenarMatriz (int[][] matriz){
        
        Random random = new Random();
        for (int[] matriz1 : matriz) {
            for (int j = 0; j <matriz.length; j++) {
                matriz1[j] = random.nextInt(2);
            }
        }
    }    
    
    
}

