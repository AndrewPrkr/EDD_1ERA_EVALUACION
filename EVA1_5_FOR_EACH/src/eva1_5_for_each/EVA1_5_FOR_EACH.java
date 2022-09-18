/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_for_each;

/**
 *
 * @author saeol
 */
public class EVA1_5_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] arrayDatos = new int[50];
        for (int i = 0; i < arrayDatos.length; i++) {
            arrayDatos[i] = (int)(Math.random() * 100);
        }
        for (int arrayDato : arrayDatos) { //For Each -> Va del 1° al último, uno por uno.
            System.out.print("[" + arrayDato + "]");
        }
    }
    
}