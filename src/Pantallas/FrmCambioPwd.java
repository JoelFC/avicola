/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pantallas;

import javax.swing.JOptionPane;

/**
 *
 * @author joelfc
 */
public class FrmCambioPwd extends javax.swing.JFrame {

    /**
     * Creates new form FrmCambioPwd
     */
    public FrmCambioPwd() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPwdActual = new javax.swing.JPasswordField();
        txtPwdNuevo = new javax.swing.JPasswordField();
        txtPwdConfirma = new javax.swing.JPasswordField();
        btnCambiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 320));
        setPreferredSize(new java.awt.Dimension(550, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cambio de Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password Actual");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password Nuevo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Confirmar Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        txtPwdActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPwdActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 156, -1));

        txtPwdNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPwdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 156, -1));

        txtPwdConfirma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPwdConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 156, -1));

        btnCambiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, 40));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ambos1.png"))); // NOI18N
        jLabel6.setLabelFor(jLabel6);
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // TODO add your handling code here:
        /*
        verificar que password nuevo y confirmar sean el mismo
        verificar que el password actual sea correcto
        Si todo está bien, entonces modificar el password       
        */ 
        String pwdNvo,pwdConf;
        pwdNvo = new String(txtPwdNuevo.getPassword());
        JOptionPane.showMessageDialog(this, pwdNvo);
    }//GEN-LAST:event_btnCambiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCambioPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCambioPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCambioPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCambioPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCambioPwd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtPwdActual;
    private javax.swing.JPasswordField txtPwdConfirma;
    private javax.swing.JPasswordField txtPwdNuevo;
    // End of variables declaration//GEN-END:variables
}
