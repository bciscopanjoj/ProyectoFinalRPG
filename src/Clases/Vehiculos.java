/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author braya
 */
public class Vehiculos {
    String tipo;
    String nombreV;
    String ataqueV;
    String punteriaV;
    String defensaV;
    String precioV;

    public Vehiculos(String tipo, String nombreV, String ataqueV, String punteriaV, String defensaV, String precioV) {
        this.tipo = tipo;
        this.nombreV = nombreV;
        this.ataqueV = ataqueV;
        this.punteriaV = punteriaV;
        this.defensaV = defensaV;
        this.precioV = precioV;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getAtaqueV() {
        return ataqueV;
    }

    public void setAtaqueV(String ataqueV) {
        this.ataqueV = ataqueV;
    }

    public String getPunteriaV() {
        return punteriaV;
    }

    public void setPunteriaV(String punteriaV) {
        this.punteriaV = punteriaV;
    }

    public String getDefensaV() {
        return defensaV;
    }

    public void setDefensaV(String defensaV) {
        this.defensaV = defensaV;
    }

    public String getPrecioV() {
        return precioV;
    }

    public void setPrecioV(String precioV) {
        this.precioV = precioV;
    }
    
   
            
    
}
