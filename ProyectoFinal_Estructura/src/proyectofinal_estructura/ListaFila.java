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
public class ListaFila {//Lista Circular
    
    //atributos de la clase
    public Nodo_Fila primero;
    public Nodo_Fila ultimo;
    public int tamaño;
    //método constructor vacío
    public ListaFila(){
        this.primero = this.ultimo = null;
        this.tamaño = 0;
    }
    //método que agrege al Final de la lista
    /**
     * Método que agrega al Final de la Lista
     * @param pDato: Recibe el dato que se almacenará en el nodo en lista
     * @return: Dato falso ó verdadero, sobre el estado del nodo agregado
     */
    public boolean agregar(Cliente pDato) {
        boolean retorno = true;
        try {
            //en caso que la lista esté vacía
            if (this.primero == null) {
                Nodo_Fila nuevo = new Nodo_Fila(pDato);
                this.primero = nuevo;
                this.ultimo = nuevo;
                this.ultimo.sgte = this.primero;
                this.primero.ant = this.ultimo;
            } //inserta al inicio de la lista cuando ya hay al menos un elemento
            else {
                 Nodo_Fila nuevo = new Nodo_Fila(pDato);
                this.ultimo.sgte = nuevo;
                nuevo.ant = this.ultimo;
                this.ultimo = nuevo;
                this.ultimo.sgte = this.primero;
                this.primero.ant = this.ultimo;
            }
            //incrementa el tamaño de la lista
            tamaño++;
        } catch (Exception e) {
            retorno = false;
        }
        return (retorno); //Retorna verdadero ó falso
    }
    //método que borra el primer elemento de la lista
    public boolean borrar() {
        boolean retorno = true;
        //si la lista está vacía no puede borrar
        if (this.primero == null) {
            retorno = false;
        } //en caso de que la lista tenga elementos
        else {
            //si la lista tiene únicamente un elemento
            if (this.primero == this.ultimo) {
                this.primero = this.ultimo = null;
            } //si la lista tiene más de un elemento
            else {
                Nodo_Fila actual = this.primero;
                this.primero = actual.sgte;
                this.primero.ant = this.ultimo;
                actual = null;
            }
            this.tamaño--;
        }
        return (retorno);
    }
  
}
