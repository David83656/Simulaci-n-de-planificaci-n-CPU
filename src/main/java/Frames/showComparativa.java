/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import javax.swing.JTextArea;

import Global.ProccessColecction;
import Global.ScannerController;
import Global.Tabla;
import Helpers.OptionHelper;
import Helpers.PrintHelper;
import Helpers.RSO;
import Helpers.comparador;
import Models.Politicas;
import Models.Resultados;

/**
 *
 * @author 54261
 */
public class showComparativa extends javax.swing.JFrame {
    private static int[] results = new int[4];
    
    

    /**
     * Creates new form showComparativa
     */
    public showComparativa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        campoTxt4 = new javax.swing.JLabel();
        campoTxt3 = new javax.swing.JLabel();
        campoTxt2 = new javax.swing.JLabel();
        campoTxt1 = new javax.swing.JLabel();
        campoTxt = new javax.swing.JLabel();
        cargar4 = new javax.swing.JButton();
        cargar3 = new javax.swing.JButton();
        cargar2 = new javax.swing.JButton();
        cargar1 = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 120, 30));

        Titulo.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        Titulo.setText("                    COMPARATIVA");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 480, 60));

        campoTxt4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        campoTxt4.setText("RESULTADOS");
        jPanel1.add(campoTxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, 20));

        campoTxt3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        campoTxt3.setText("ROUND ROBIN");
        jPanel1.add(campoTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 110, -1));

        campoTxt2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        campoTxt2.setText(" FIFO");
        jPanel1.add(campoTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 40, 20));

        campoTxt1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        campoTxt1.setText("SJF/D");
        jPanel1.add(campoTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 20));

        campoTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        campoTxt.setText("SJF");
        jPanel1.add(campoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));

        cargar4.setBackground(new java.awt.Color(204, 204, 204));
        cargar4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cargar4.setText("MOSTRAR");
        cargar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar4ActionPerformed(evt);
            }
        });
        jPanel1.add(cargar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 100, 40));

        cargar3.setBackground(new java.awt.Color(204, 204, 204));
        cargar3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cargar3.setText("MOSTRAR");
        cargar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar3ActionPerformed(evt);
            }
        });
        jPanel1.add(cargar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 100, 40));

        cargar2.setBackground(new java.awt.Color(204, 204, 204));
        cargar2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cargar2.setText("MOSTRAR");
        cargar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar2ActionPerformed(evt);
            }
        });
        jPanel1.add(cargar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 100, 40));

        cargar1.setBackground(new java.awt.Color(204, 204, 204));
        cargar1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cargar1.setText("MOSTRAR");
        cargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar1ActionPerformed(evt);
            }
        });
        jPanel1.add(cargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 40));

        cargar.setBackground(new java.awt.Color(204, 204, 204));
        cargar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cargar.setText("MOSTRAR TODO");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/650043d8d746e5e29efde3534c60f823.jpg"))); // NOI18N
        Fondo.setText("jLabel1");
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DataFrame abrir=new DataFrame();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        comparador.fillResults();
        comparador.showResults();
    }//GEN-LAST:event_cargarActionPerformed

    private void cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar1ActionPerformed
        // TODO add your handling code here:
        ProccessColecction.submit();
        RSO.run(Politicas.JSF);
        results[0] = RSO.i - 1;
        System.out.println("Politica: JSF" );
        Resultados jsf = new Resultados(Tabla.tabla, ProccessColecction.getProcesos(), RSO.i - 1);
        jsf.calcularTiempoDeFinalizacionDeProcesos();
        RSO.resetRSO();
    }//GEN-LAST:event_cargar1ActionPerformed

    private void cargar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar2ActionPerformed
        // TODO add your handling code here:
        ProccessColecction.submit();
        RSO.run(Politicas.JSFD);
        results[1] = RSO.i - 1;
        System.out.println("Politica: JSFD" );
        Resultados jsfd = new Resultados(Tabla.tabla, ProccessColecction.getProcesos(), RSO.i - 1);
        jsfd.calcularTiempoDeFinalizacionDeProcesos();
        RSO.resetRSO();
    }//GEN-LAST:event_cargar2ActionPerformed

    private void cargar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar3ActionPerformed
        // TODO add your handling code here:
        ProccessColecction.submit();
        RSO.run(Politicas.FIFO);
        results[2] = RSO.i - 1;
        System.out.println("Politica: FIFO" );
        Resultados fifo = new Resultados(Tabla.tabla, ProccessColecction.getProcesos(), RSO.i - 1);
        fifo.calcularTiempoDeFinalizacionDeProcesos();
        RSO.resetRSO();
    }//GEN-LAST:event_cargar3ActionPerformed

    private void cargar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar4ActionPerformed
       ProccessColecction.submit();
        RSO.run(Politicas.RR);
        results[3] = RSO.i - 1;
        System.out.println("Politica: Round Robin" );
        Resultados rr = new Resultados(Tabla.tabla, ProccessColecction.getProcesos(), RSO.i - 1);
        rr.calcularTiempoDeFinalizacionDeProcesos();
        RSO.resetRSO();
        
        
    }//GEN-LAST:event_cargar4ActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(showComparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showComparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showComparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showComparativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showComparativa().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel campoTxt;
    private javax.swing.JLabel campoTxt1;
    private javax.swing.JLabel campoTxt2;
    private javax.swing.JLabel campoTxt3;
    private javax.swing.JLabel campoTxt4;
    private javax.swing.JButton cargar;
    private javax.swing.JButton cargar1;
    private javax.swing.JButton cargar2;
    private javax.swing.JButton cargar3;
    private javax.swing.JButton cargar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
