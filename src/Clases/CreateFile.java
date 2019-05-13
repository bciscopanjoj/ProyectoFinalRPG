/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;

/**
 *
 * @author braya
 */
public class CreateFile {
    private File file;
    
    public String crearCarpeta(String nombreCarpeta){
        
       file= new File(nombreCarpeta);
        
        if (!file.exists()) {
            file.mkdir();
            return file.getAbsolutePath();
        }
         return file.getAbsolutePath();
    }
    
}
