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
public class Nodo {
     private int valor;
    private Nodo derecha;
    private Nodo izquierda;

    //Por dafault, un nuevo nodo va al final de la lista
    //El final de la lista
    public Nodo() {
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
}
