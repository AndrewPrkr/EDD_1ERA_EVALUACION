/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author saeol
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Declaramos el arreglo
            int[][] arrayCali;
            //Pedir número de grupos
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de grupos: ");
            int grupos = sc.nextInt();
            arrayCali = new int[grupos][];            
            for (int i = 0; i < arrayCali.length; i++) {
                //Pedir número de alumnos por grupo
                System.out.println("Ingrese la cantidad de alumnos por grupo: ");
                int alumnos = sc.nextInt();
                arrayCali[i] = new int[alumnos];
        }
            //Capturar calificaciones
            for (int i = 0; i < arrayCali.length; i++) {
                 System.out.println("Inserte las calificaciones del grupo " + i + ":");
            for (int j = 0; j < arrayCali[i].length; j++) {
                int calificaciones = sc.nextInt();
                arrayCali[i][j] = calificaciones;
                }  
            } 
        System.out.println("");
        for (int i = 0; i < arrayCali.length; i++) { //1D
             System.out.println("Las calificaciones del grupo " + i + " son:");

            for (int j = 0; j < arrayCali[i].length; j++) { //2D

                System.out.print("[" + arrayCali[i][j] + "]");
                System.out.println("");
            }
            System.out.println("");
        }              
    }
    
}
