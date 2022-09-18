/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EVA1_1_STACK;

/**
 *
 * @author saeol
 */
public class EVA1_1_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println("INICIA MAIN");
        A();
        System.out.println("RETOMA EJECUCIÓN MAIN");
        System.out.println("TERMINA MAIN");
    }
    
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("RETOMA EJECUCIÓN A");
        System.out.println("TERMINA A");
    }
    
    public static void B(){
     System.out.println("INICIA B");
     int i = 1;
     double d = 10.0;   
     System.out.println("TERMINA B");
    }
}