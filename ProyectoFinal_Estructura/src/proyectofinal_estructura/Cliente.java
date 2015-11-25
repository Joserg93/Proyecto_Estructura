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
public class Cliente {//Clase Cliente
    //atributos de la clase
    private String nombre;
    private char prioridad;
    private int tiempoTramite;
//metodo constructor de la clase
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
//metodos set y get de los atributos de la clase

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }
    public int getTiempoTramite() {
        return tiempoTramite;
    }
    public void setTiempoTramite(int tiempoTramite) {
        this.tiempoTramite = tiempoTramite;
    }

}
