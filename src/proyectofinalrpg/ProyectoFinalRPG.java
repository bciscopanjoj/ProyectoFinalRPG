/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalrpg;

import Clases.CreateFile;
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
        
        CreateFile c = new CreateFile();
    
        pathUSUARIO = c.crearCarpeta("Usuario")+File.separatorChar;
        pathARMAS = c.crearCarpeta("Armas")+File.separatorChar;
        pathAVIONES = c.crearCarpeta("Aviones")+File.separatorChar;
        pathTANQUES = c.crearCarpeta("Tanques")+File.separatorChar;
        pathVehiculos = c.crearCarpeta("Vehiculos")+File.separatorChar;
        pathReport = c.crearCarpeta("Reportes")+File.separatorChar;
        System.out.println("Carpetas creadas");
        
        
        Inicio1 principal = new Inicio1();
        principal.show();

    
  
    }
    public static  String pathReport;
    public static  String pathVehiculos;
    public static String pathUSUARIO;
    public static String pathARMAS;
    public static String pathAVIONES;
    public static String pathTANQUES;
    
}
