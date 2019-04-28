/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class Estadisticas8 extends javax.swing.JFrame {
    
    private DefaultTableModel table;
    int capsu = 0;

    /**
     * Creates new form Estadisticas8
     */
    public Estadisticas8() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        readBin();
        CargarEstadistica();
        CargarInfo();
    }
    
    public void CargarEstadistica(){
    String datos [][]= {};
    String columna[]= {"NICKNAME","CLASE(V1)", "VEHICULO1", "CLASE(V2)", "VEHICULO2", "CLASE(V3)", "VEHICULO3"};
    String columna1[] = { "V1" };
    
        
    table= new DefaultTableModel(datos, columna);
    jTable1Estad.setModel(table);
    
    public void readBin(){
        list.clear();
        ObjectInputStream binario = null;
        try {
            String nameFile = nickname.getText();
            File file = new File("Persona");
            
            
            
            for (String string : file.list()) {
                
                binario = new ObjectInputStream(new FileInputStream(pathPersona+string));
                Persona p = (Persona) binario.readObject();
                list.add(p);
                
            }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Estad = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ciscoplay.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 200, 110));

        jTable1Estad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTable1Estad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 250));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 255));
        jButton1.setText("BORRAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 255, 255));
        jButton2.setText("REGRESAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estadisticas8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Estad;
    // End of variables declaration//GEN-END:variables
}