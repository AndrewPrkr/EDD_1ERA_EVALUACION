/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_copia_arreglos;

/**
 *
 * @author saeol
 */
public class EVA1_15_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int[] arrayDatos = new int[100];
        //Copia de los valores almecenados en el arreglo
        int[] arrayCopia = new int[arrayDatos.length];
        //Llenar el arregl con números aleatorios
        llenar(arrayDatos);
        //Imprimir el arreglo
        imprimir(arrayDatos);
        
        //Copia de los valores
        for (int i = 0; i < arrayDatos.length; i++) {
            arrayCopia[i] = arrayDatos[i];
        }
        
        //Imprimir el arreglo Copia
        System.out.println("");
        imprimir(arrayCopia);
        System.out.println("");
        
        //Ciclo que agrega del último valor al primero
        for (int i = 0; i < arrayDatos.length; i++) {
            for(int j = 0; j < arrayDatos.length; j++){
                arrayCopia[j] = arrayDatos[(arrayDatos.length - 1) - j];
            }
        }
        
        //Imprimir el arreglo Copia
        imprimir(arrayCopia);
 
    }
    public static void llenar(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
        }
    }
    
    public static void imprimir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");   
        }
    }
}