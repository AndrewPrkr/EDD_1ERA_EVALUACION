/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_arreglos_multidim;

/**
 *
 * @author saeol
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int[][] matrizDatos = new int[3][5];
        System.out.println("FILAS: " + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) { //1D (3 filas)
            System.out.println("COLUMNAS: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) { //2D (5 columnas)
                matrizDatos[i][j] = 100;
            }
        }
        System.out.println("");
        for (int i = 0; i < matrizDatos.length; i++) { //1D (3 filas)
            for (int j = 0; j < matrizDatos[i].length; j++) { //2D (5 columnas)
                System.out.print("[" + matrizDatos[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
