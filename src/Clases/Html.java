/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinalrpg.ProyectoFinalRPG;

/**
 *
 * @author braya
 */
public class Html {
    
    private ArrayList<ClaseUsuario> listado = new ArrayList<>();
    //enviar el nombre del archivo
    public void recuperarUsuario(String path){
        try {
            
            ObjectInputStream leerArchivo = new ObjectInputStream(new
                    FileInputStream(path));
            
            ClaseUsuario usuario= (ClaseUsuario) leerArchivo.readObject();
            listado.add(usuario);
           leerArchivo.close();
        } catch (Exception ex) {
            Logger.getLogger(Html.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
    public void exportar(){
        FileWriter fichero = null;
        BufferedWriter pw = null;
        
        
        try {
            fichero = new FileWriter(ProyectoFinalRPG.pathReport+"ClaseJugadores.txt");
            pw = new BufferedWriter(fichero);
            
            File claseJugadores = new File(ProyectoFinalRPG.pathUSUARIO);
         
             pw.write("<!DOCTYPE HTML>\n" +
                            "<html>\n" +
                            "	<head>\n" +
                            "		<title>Reportes</title>\n" +
                            "		<meta charset=\"utf-8\" />\n" +
                            "		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n" +
                            "		<meta name=\"description\" content=\"\" />\n" +
                            "		<meta name=\"keywords\" content=\"\" />\n" +
                            "	</head>"+
                            "	<body >"
                          
             
             
             );
              pw.write(  "<h1>Clase Usuario </h1>");
                pw.write("	<table style=\"border-collapse: collapse;\">");
                
                pw.write("<tr>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NickName</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NVehiculo1</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NVehiculo2</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NVehiculo3</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Clase 1</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Clase 2</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Clase 3</th>\n" +
                            "</tr>");
                
            for (String list : claseJugadores.list()) {
                recuperarUsuario(ProyectoFinalRPG.pathUSUARIO+list);
            }
            
         
                
            for (int i = 0; i < listado.size(); i++) {
                
                
             pw.write("<tr>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNickname()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNvehiculo1()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNvehiculo2()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNvehiculo3()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getClase1()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getClase2()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getClase3()+"</td>\n" +
                            "</tr>");

            }
                pw.write("</body>"+
                "</html>");
        } catch (IOException ex) {
            Logger.getLogger(Html.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (null != fichero)
                try {
                    fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(Html.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
            
        
    }
   public void test(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(ProyectoFinalRPG.pathReport+"text.html");
            pw = new PrintWriter(fichero);

            pw.write("<!DOCTYPE HTML>\n" +
                            "<html>\n" +
                            "	<head>\n" +
                            "		<title>Reportes</title>\n" +
                            "		<meta charset=\"utf-8\" />\n" +
                            "		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n" +
                            "		<meta name=\"description\" content=\"\" />\n" +
                            "		<meta name=\"keywords\" content=\"\" />\n" +
                            "	</head>"+
                            "	<body >"
                          
             
             
             );
              pw.write(  "<h1>Clase Usuario </h1>");
                pw.write("	<table style=\"border-collapse: collapse;\">");
                
                pw.write("<tr>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NickName</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NVehiculo1</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NVehiculo2</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">NVehiculo3</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Clase 1</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Clase 2</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Clase 3</th>\n" +
                            "</tr>");
            File claseJugadores = new File(ProyectoFinalRPG.pathUSUARIO);
            for (String list : claseJugadores.list()) {
                recuperarUsuario(ProyectoFinalRPG.pathUSUARIO+list);
            }
            
         
                
            for (int i = 0; i < listado.size(); i++) {
                
                
             pw.write("<tr>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNickname()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNvehiculo1()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNvehiculo2()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getNvehiculo3()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getClase1()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getClase2()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+listado.get(i).getClase3()+"</td>\n" +
                            "</tr>");

            }
                pw.write("</body>"+
                "</html>");
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
           }
   }
}
