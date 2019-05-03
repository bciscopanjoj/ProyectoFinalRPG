/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalrpg;

import Interfaces.Inicio1;
import java.io.File;



/**
 *
 * @author braya
 */
public class ProyectoFinalRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLamar Inicio1
        Inicio1 principal = new Inicio1();
        principal.show();

        
        
        File createCarpeta = new File("Usuario");
        File createCarpeta1 = new File("Armas");
        File createCarpeta2 = new File("Aviones");
        File createCarpeta3 = new File("Tanques");
        
        
        if (!createCarpeta.exists()) {
            createCarpeta.mkdir();
            
        }
        
        pathUSUARIO = createCarpeta.getAbsolutePath()+File.separatorChar;
        pathARMAS = createCarpeta1.getAbsolutePath()+File.separatorChar;
        pathAVIONES = createCarpeta2.getAbsolutePath()+File.separatorChar;
        pathTANQUES = createCarpeta3.getAbsolutePath()+File.separatorChar;
        
  
    }
    public static String pathUSUARIO;
    public static String pathARMAS;
    public static String pathAVIONES;
    public static String pathTANQUES;
    
}
