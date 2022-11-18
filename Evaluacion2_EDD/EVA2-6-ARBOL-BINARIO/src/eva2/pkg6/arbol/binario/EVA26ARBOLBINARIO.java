/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2.pkg6.arbol.binario;

/**
 *
 * @author saeol
 */
public class EVA26ARBOLBINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArbolBinario arbol = new ArbolBinario();
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        arbol.inOrder();
        arbol.preOrder();
        arbol.posOrder();
    }   
    }
    
