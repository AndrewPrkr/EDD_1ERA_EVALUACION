/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2.pkg1.lista.simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saeol
 */
public class EVA21LISTASIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Lista miLista = new Lista();
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.agregar(10);//0
        miLista.agregar(20);//1
        miLista.agregar(30);//2
        miLista.agregar(40);//3 <------
        miLista.agregar(50);//4
        miLista.agregar(60);
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        try {
            miLista.insertarEn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try{
        miLista.borrarEn(4);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        miLista.vaciarLista();
        miLista.imprimir();
        try {
            System.out.println("Valor en 4; " + miLista.obtenerValorEn(3));
        } catch (Exception ex) {
            Logger.getLogger(EVA21LISTASIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }    
            //int[] arreglo = new int[1000000];
            //for(int i = 0; i < 1000000;i++){ //O(N2) -> O(1)
            //arreglo[i] = 1000;
            //  miLista.agregar(1000);
        
        //System.out.println("Conteo de nodos: " + miLista.tamaLista());
        //miLista.imprimir();
    }
    

