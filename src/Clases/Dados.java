/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;

/**
 *
 * @author braya
 */
public class Dados {
    
    
    public int dadoDeCuatro(){
        Random r = new Random();
        return r.nextInt(3)+1;
    }
    public int dadoDeSeis(){
         Random r = new Random();
        return r.nextInt(3)+1;
    }
    public int dadoDeCien(){
         Random r = new Random();
        return r.nextInt(3)+1;
    }
}
