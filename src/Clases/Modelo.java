/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author braya
 */
public class Modelo implements Serializable {
    
    
    String nombre;
    String punteria;
    String ataque;
    String precio;

    public Modelo(String nombre, String punteria, String ataque, String precio) {
        this.nombre = nombre;
        this.punteria = punteria;
        this.ataque = ataque;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPunteria() {
        return punteria;
    }

    public void setPunteria(String punteria) {
        this.punteria = punteria;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    

    
}
