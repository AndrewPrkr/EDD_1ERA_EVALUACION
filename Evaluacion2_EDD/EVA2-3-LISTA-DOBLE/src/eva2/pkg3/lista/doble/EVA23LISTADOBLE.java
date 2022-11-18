/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2.pkg3.lista.doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saeol
 */
public class EVA23LISTADOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ListaDoble listaDoble = new ListaDoble();
        listaDoble.agregar(10); //0
        listaDoble.agregar(20); //1
        listaDoble.agregar(30); //2
        listaDoble.agregar(40); //3
        listaDoble.agregar(50); //4
        listaDoble.agregar(60); //5
        listaDoble.imprimir();
        try {
            listaDoble.insertarEn(5, 0);
        } catch (Exception ex) {
            Logger.getLogger(EVA23LISTADOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaDoble.imprimir();
        
        try {
            listaDoble.borrarEn(5);
        } catch (Exception ex) {
            Logger.getLogger(EVA23LISTADOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaDoble.imprimir();    
    }
    }
    
