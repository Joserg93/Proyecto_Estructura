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
    //método que agrege al inicio de la lista
    /**
     * Método para Agregar Datos
     * @param pDato: Dato que se recibe del Nodo
     * @return: Dato falso ó verdadero, sobre el estado del nodo agregado
     */
    public boolean agregar(Cliente pDato) {
        boolean retorno = true;
        try {
            //en caso que la lista esté vacía
            if (this.primero == null) {
                Nodo_Caja nuevo = new Nodo_Caja(pDato);
                this.primero = nuevo;
                this.ultimo = nuevo;
            } //inserta al inicio de la lista cuando ya hay al menos un elemento
            else {
                Nodo_Caja nuevo = new Nodo_Caja(pDato);
                nuevo.sgte = this.primero;
                this.primero = nuevo;
            }
            //incrementa el tamaño de la lista
            tamaño++;
        } catch (Exception e) { //En caso de errores
            retorno = false;
        }
        return (retorno); //Retorna verdadero o falso
    }
    //método que borra el último elemento de la lista
    /**
     * Método para Borrar los Datos
     * @return: Dato falso ó verdadero, sobre el estado del nodo agregado
     */
//    public boolean borrar() {
//        boolean retorno = true;
//        //si la lista está vacía no puede borrar
//        if (this.primero == null) {
//            retorno = false;
//        } //en caso de que la lista tenga elementos
//        else {
//            //si la lista tiene únicamente un elemento
//            if (this.primero == this.ultimo) {
//                this.primero = this.ultimo = null;
//            } //si la lista tiene más de un elemento
//            else {
//                Nodo_Caja actual = this.primero;
//                this.primero = actual.sgte;
//                actual = null;
//            }
//            this.tamaño--; //Reduce de tamaño la lista
//        }
//        return (retorno); //Devuelve falso o verdadero
//    }

}
