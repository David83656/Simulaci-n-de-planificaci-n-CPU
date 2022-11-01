/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author Lucas
 */
public class FIFOgraph extends javax.swing.JFrame {

    /**
     * Creates new form JSFDgraph
     */
    public FIFOgraph() {
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
        volverButton = new javax.swing.JButton();
        mostrarButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverButton.setBackground(new java.awt.Color(204, 204, 204));
        volverButton.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        volverButton.setText("VOLVER");
        volverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverButtonMouseClicked(evt);
            }
        });
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });
        jPanel1.add(volverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 230, 60));

        mostrarButton.setBackground(new java.awt.Color(204, 204, 204));
        mostrarButton.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        mostrarButton.setText("MOSTRAR");
        mostrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarButtonMouseClicked(evt);
            }
        });
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 230, 60));

        guardarButton.setBackground(new java.awt.Color(204, 204, 204));
        guardarButton.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        guardarButton.setText("GUARDAR");
        guardarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtonMouseClicked(evt);
            }
        });
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/650043d8d746e5e29efde3534c60f823.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

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

    private void volverButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_volverButtonMouseClicked

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        // TODO add your handling code here:
        DataFrame abrir=new DataFrame();
        abrir.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_volverButtonActionPerformed

    private void mostrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarButtonMouseClicked

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarButtonActionPerformed

    private void guardarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarButtonMouseClicked

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FIFOgraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIFOgraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIFOgraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIFOgraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FIFOgraph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
