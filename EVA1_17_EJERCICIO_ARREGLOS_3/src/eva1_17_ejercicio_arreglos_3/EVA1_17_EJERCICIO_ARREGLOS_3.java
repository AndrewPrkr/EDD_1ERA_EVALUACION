/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author saeol
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Generar una matriz de 5 x 5 enteros. Llenar con números aleatorios entre 1 y 100 e imprimir.
    //Generar una copia de la matriz, pero en orden inverso.
   int[][] matriz = new int[5][5];
    for (int i = 0; i < matriz.length; i++) { 
        for (int j = 0; j < matriz[i].length; j++) {
             matriz[i][j] = ((int)(Math.random() * 100))+1;
            }
    }
    for(int i=0; i < matriz.length; i++){//ordena la matriz de abajo hacia arriba
	for(int j=0; j < matriz.length; j++){
            for(int x=0; x < matriz.length; x++){
		for(int y=0; y < matriz.length; y++){
                    if(matriz[i][j] > matriz[x][y]){
			int t = matriz[i][j];
			matriz[i][j] = matriz[x][y];
			matriz[x][y] = t;
                    }
		}
            }
	}
    }
            System.out.println("");
            for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz.length-1; j >= 0; j--) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
            
    int[][] copiaMatriz = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
             copiaMatriz[i] = matriz[(matriz.length - 1) - i];

            for(int j = 0; j < matriz.length; j++){
                copiaMatriz[j] = matriz[(matriz.length - 1) - j];
            }
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
            System.out.print("[" + copiaMatriz[i][j] + "]"); 
            }
            System.out.println("");
        }
	
    }
}