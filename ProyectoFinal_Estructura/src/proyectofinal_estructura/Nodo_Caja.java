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
public class Nodo_Caja{//Clase Nodo Caja
    public Nodo_Caja sgte;
    public Cliente dato;
//metodo constructor de la clase
    /**
     * Método Constructor de Nodo Simple
     * @param pDato = Datos que se recibe dentro del nodo
     */
    public Nodo_Caja(Cliente pDato){
        this.dato = pDato;
        sgte = null;
    } 
}
