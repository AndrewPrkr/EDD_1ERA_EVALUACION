/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_arreglos;

/**
 *
 * @author saeol
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //EDA -> Tipo abstracto de dato (objetos y clases)
        //Arreglos en JAVA -> Objetos -> EDA
        //Tipo de dato [] identificador = new tipo de dato [tamaño];
        //Funciones e identificadores -> Empiezan en minúsculas, Funciones -> Indican una acción -> Verbos, Clases -> Empiezan mayúscula.
        //Arreglo de enteros para capturar edades:
        int[] arrayEdades, arraySalario, arrayCalif;
        double arrayPromedio[], porcentaje;
        arrayEdades = new int[50];
        for (int i = 0; i < arrayEdades.length; i++) {
            arrayEdades[i] = (int)(Math.random() * 100);
        }
        for (int j = 0; j < arrayEdades.length; j++) {
            System.out.println("[" + j + "] - " + arrayEdades[j]);
        }
    }
    
}