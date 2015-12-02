/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;

/**
 *  Fecha de Primera Edición 16/11/2015
 *  Fecha de Última Edición 1/12/2015
 * @author Jose Miguel y Diego
 */
public class ListaCaja {
    //atributos de la clase
    public Nodo_Caja primero;
    public Nodo_Caja ultimo;
    public int tamaño;
    //método constructor
    public ListaCaja() {
        this.primero = this.ultimo = null;
        this.tamaño = 0;
    }
    
    /**
     *metodo para agregar un nuevo cliente a la lista caja 
     * @param Dato_Cliente:recibe un dato de tipo cliente
     * 
     */
    public void agregar(Cliente Dato_Cliente) {
            //en caso que la lista esté vacía
            if (this.primero == null) {
                Nodo_Caja nuevo = new Nodo_Caja(Dato_Cliente);
                this.primero = nuevo;
                this.ultimo = nuevo;
            } 
            else {//inserta al inicio de la lista cuando ya hay al menos un elemento en la lista
                Nodo_Caja nuevo = new Nodo_Caja(Dato_Cliente);
                nuevo.sgte = this.primero;
                this.primero = nuevo;
            }
            //incrementa el tamaño de la lista
            tamaño++;
    }
    
    /**
     *metodo para borrar todos los nodos de la lista de la caja
     */
    public void Borrar_Todo() {
        this.primero=null;
        this.ultimo=null;
        tamaño=0;
    }

}
