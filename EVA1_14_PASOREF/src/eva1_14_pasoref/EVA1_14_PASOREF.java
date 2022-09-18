/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_pasoref;

/**
 *
 * @author saeol
 */
public class EVA1_14_PASOREF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] arrayDatos = new int[100];
        llenar(arrayDatos);
        imprimir(arrayDatos);
        
    }
    public static void llenar(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 100;
        }
    }
    
    public static void imprimir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "]");   
        }
    }
    
}