/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_ejercicio_arreglos;

/**
 *
 * @author saeol
 */
public class EVA1_16_EJERCICIO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un arreglo con 50 elementos, llenarlo con valores aleatorios entre 1 y 100 e imprimir una lista con los valores pares que contenga.
        //Guardar los pares en un arreglo nuevo (tamaño exacto)
   int[] arrayDatos = new int[50];
    int contPar = 0, contImpar = 0;
    for (int i = 0; i < arrayDatos.length; i++) {
            arrayDatos[i] = ((int)(Math.random() * 100))+1;
            if((arrayDatos[i]%2)==0){
                contPar++;
            }
            else{
                contImpar++;
            }
    }
    int[] arrayPares = new int[contPar];
    int[] arrayImpares = new int[contImpar];
    int contPares = 0, contImpares = 0;
    for (int i = 0; i < arrayDatos.length; i++) {
        if(arrayDatos[i]%2==0){
            arrayPares[contPares] = arrayDatos[i];
            contPares++;
        }
        else{
            arrayImpares[contImpares] = arrayDatos[i];
            contImpares++;
        }
    }
        System.out.println("Los números pares en el arreglo son: ");
    for(int i = 0; i <arrayPares.length; i++){
        System.out.print("[" + arrayPares[i] + "]");
    }
        System.out.println("");
        System.out.println("Los números impares en el arreglo son: ");
    for(int i = 0; i <arrayImpares.length; i++){
        System.out.print("[" + arrayImpares[i] + "]");
    }
    
    }
}