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
public class Caja {//Clase Caja
    //atributos de la clase
    public ListaCaja clientes;
    public String nombre;
//metodo constructor de la clase
    /**
     * Método Constructor de la Clase Caja
     * @param Nombre: Recibe un string con el nombre de la caja
     */
    public Caja(String Nombre) {
        clientes = new ListaCaja();
        nombre = Nombre;
    }
}
