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
public class Cliente {//Clase Cliente
    //atributos de la clase
    private String nombre;
    private char prioridad;
    private int lugarFila;
    private int duracionTramite;
//metodo constructor de la clase cliente
    public Cliente(String nombre,char prioridad,int lugarFila,int duracionTramite) {
        this.nombre = nombre;
        this.prioridad=prioridad;
        this.lugarFila=lugarFila;
        this.duracionTramite=duracionTramite;
    }
//metodos set y get de los atributos de la clase cliente

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
    public int getLugarFila() {
        return lugarFila;
    }
    public void setLugarFila(int lugarFila) {
        this.lugarFila = lugarFila;
    }
    public int getDuracionTramite() {
        return duracionTramite;
    }
    public void setDuracionTramite(int duracionTramite) {
        this.duracionTramite = duracionTramite;
    }

}
