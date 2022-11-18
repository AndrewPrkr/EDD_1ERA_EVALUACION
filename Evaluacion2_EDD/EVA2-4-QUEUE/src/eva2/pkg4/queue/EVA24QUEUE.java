/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2.pkg4.queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saeol
 */
public class EVA24QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyQueue myQueue = new MyQueue();
        //FIFO --> FIRST IN, FIRST OUT
        myQueue.agregar(10); //Primero en llegar, primero en ser atendido
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50); //Último en llegar, último en ser atendiendo.
        System.out.println("Primer valor en llegar es " + myQueue.peek());
        myQueue.imprimir(); 
        try {
            System.out.println("Primer valor en llegar es " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA24QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }
    
    }
    

