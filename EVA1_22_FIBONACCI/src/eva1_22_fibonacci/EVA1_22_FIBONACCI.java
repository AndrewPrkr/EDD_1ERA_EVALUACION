/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_22_fibonacci;

/**
 *
 * @author saeol
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     for (int i = 5; i >= 0; i--) {
             System.out.println(calcularFibo(i));
        }
        }
  
    public static int calcularFibo(int pos){
        //Llamada recurisiva
        //Detener la llamada recursiva
        if(pos <= 1)
            return 1;
        else
            return calcularFibo(pos-1) + calcularFibo(pos - 2);
    }
}
    
}
