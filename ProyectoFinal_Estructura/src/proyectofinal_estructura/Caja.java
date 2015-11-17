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
public class Caja {//Clase Caja
    //atributos de la clase
    public ListaCaja clientes;
    public String nombre;
    private boolean ocupado;
//metodo constructor de la clase
    /**
     * Método Constructor de la Clase Caja
     * @param pNombre: Recibe una Cadena de Letras para formar un "Nombre"
     */
    public Caja(String pNombre) {
        this.ocupado = false;
        clientes = new ListaCaja();
        nombre = pNombre;
    }
//metodos set y get de los atributos de la clase
    /**
     *
     * @return: Método que avisa que el cajero está ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }
    /**
     * Método que "setea" el estado de "ocupado"
     * @param ocupado: Recibe por dato, si se está ocupado ó no
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
