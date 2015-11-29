/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;

/**
 *  Fecha de Primera Edición 16/11/2015
 *  Fecha de Última Edición 29/11/2015
 * @author Jose Miguel y Diego
 */
public class Nodo_Fila{//Clase Nodo Fila  
    //atributos de la clase
    public Nodo_Fila sgte;
    public Nodo_Cliente dato; 
//metodo constructor de la clase
    /**
     * Método Constructor de Nodo Doble
     * @param pDato: Dato que recibe el Nodo
     */
    public Nodo_Fila(Nodo_Cliente pDato){
        this.dato = pDato;
        sgte = null;
    } 
}
