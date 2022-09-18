/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_heap;

/**
 *
 * @author saeol
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int x = 10;
        // obj y obj2 guardan referencias (direcciones de memoria en la VM), en otros lenguajes se les llama apuntadores (memoria física)
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    }  
}

class Prueba{
    public int valor = 100;
}