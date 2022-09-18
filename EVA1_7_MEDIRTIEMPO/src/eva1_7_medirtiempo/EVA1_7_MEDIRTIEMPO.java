/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_medirtiempo;

/**
 *
 * @author saeol
 */
public class EVA1_7_MEDIRTIEMPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int[] datos = new int[100000000];
       long ini = System.nanoTime();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 100;
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
}