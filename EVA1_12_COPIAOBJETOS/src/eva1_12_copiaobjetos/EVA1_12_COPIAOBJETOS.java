/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copiaobjetos;

/**
 *
 * @author saeol
 */
public class EVA1_12_COPIAOBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int valor, copiaValor;
        //Paso por valor
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor++;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        //Copia por dirección
        PruebaValor prueba = new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba;
        System.out.println("Ahora con objetos: ");
        System.out.println("Prueba: " + prueba.x);
        System.out.println("Prueba Copia: " + pruebaCopia.x);
        prueba.x++;
        System.out.println("Prueba: " + prueba.x);
        System.out.println("Prueba Copia: " + pruebaCopia.x);
    }
    
}

class PruebaValor{
    int x;
}