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
public class ClaseUsuario {
    String nickname;
    String Nvehiculo1;
    String Nvehiculo2;
    String Nvehiculo3;
    String Clase1;
    String Clase2;
    String Clase3;

    public ClaseUsuario(String Nvehiculo1, String Nvehiculo2, String Nvehiculo3, String Clase1, String Clase2, String Clase3) {
        this.Nvehiculo1 = Nvehiculo1;
        this.Nvehiculo2 = Nvehiculo2;
        this.Nvehiculo3 = Nvehiculo3;
        this.Clase1 = Clase1;
        this.Clase2 = Clase2;
        this.Clase3 = Clase3;
    }

    public String getNvehiculo1() {
        return Nvehiculo1;
    }

    public void setNvehiculo1(String Nvehiculo1) {
        this.Nvehiculo1 = Nvehiculo1;
    }

    public String getClase1() {
        return Clase1;
    }

    public void setClase1(String Clase1) {
        this.Clase1 = Clase1;
    }

    public String getClase2() {
        return Clase2;
    }

    public void setClase2(String Clase2) {
        this.Clase2 = Clase2;
    }

    public String getClase3() {
        return Clase3;
    }

    public void setClase3(String Clase3) {
        this.Clase3 = Clase3;
    }
    
    
     


    public ClaseUsuario(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
}
