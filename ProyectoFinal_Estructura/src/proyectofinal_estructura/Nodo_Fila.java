/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;

/**
 *
 * @author joser
 */
public class Nodo_Fila{//Clase Nodo Fila  
    //atributos de la clase
    public Nodo_Fila sgte;
    public Nodo_Fila ant;
    public Cliente dato; 
//metodo constructor de la clase
    /**
     * Método Constructor de Nodo Doble
     * @param pDato: Dato que recibe el Nodo
     */
    public Nodo_Fila(Cliente pDato){
        this.dato = pDato;
        sgte = ant = null;
    } 
}
