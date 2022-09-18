/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_recursividad;

/**
 *
 * @author saeol
 */
public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /* Condiciones:
        1. Método que se llama a sí mismo. Algún tipo de trabajo.
        2. Un mecanismo para detener la recursividad.
        */
        falseForDes(5);
        falseForAsc(5,1);
        
    }
    // False for
    //Imprimir una lista de menor a mayor de manera resursiva
    //Recibe un valor falseForDes(5) --> "5, 4, 3, 2, 1"
    public static void falseForDes(int valor){
        //Qué voy a hacer "Imprimir valor"
        //Llamada recursiva "falseForDes(valor = 1)"
        //Detener la llamada recursiva "Cuando valor = 1"
        //Si es 1 me detengo, sino, llamada recursiva
        if(valor == 1)
            System.out.println(valor);
        else{
            System.out.print(valor + " - ");
            falseForDes(valor - 1);
        }
    }
    //falseForAsc(5,1) -> 1 - 2 - 3 - 4 - 5
    public static void falseForAsc(int valor, int ini){
        if(ini <= valor){
            System.out.print(ini + " - ");
            falseForAsc(valor,ini + 1);
        }
    }
}