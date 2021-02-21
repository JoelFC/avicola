/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pantallas;

import clases.Conex;
import clases.DaoUsuario;
import clases.Datos;
import clases.Hash;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.DigestMethod;

/**
 *
 * @author joelfc
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public FrmLogin() {
        initComponents();
        btnCfg.setVisible(false);
        this.setLocationRelativeTo(null);
        btnInicioSesion.setEnabled(validar());
    }

     public final boolean validar(){
         boolean res = false;
         
        try {
            Connection con = Conex.getConnection();
         if(con != null){
             res = true;
            
            con.close();
         }
        } catch (SQLException ex) {
            System.out.println("Error: "+ ex.getMessage());
        }
         return res;
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnInicioSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        btnCfg = new javax.swing.JButton();
        lblActivar = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña");
        lblContraseña.setToolTipText("");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 150, -1));

        txtContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtContraseña.setToolTipText("");
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 150, -1));

        btnInicioSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInicioSesion.setText("INICIAR SESION");
        btnInicioSesion.setToolTipText("");
        btnInicioSesion.setEnabled(false);
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 40));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 40));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ambos.png"))); // NOI18N
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 380, 210));

        btnCfg.setText("CFG");
        btnCfg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCfgActionPerformed(evt);
            }
        });
        getContentPane().add(btnCfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 60, 30));

        lblActivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activaBoton(evt);
            }
        });
        getContentPane().add(lblActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoVerde.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -20, 620, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
public Image getIconImage(){
    Image retval = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Icono.png"));
    return retval;
}
    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        Connection cone = Conex.getConnection();
        String cadSha1;
        Statement stm;
        try {
            stm = cone.createStatement();
            
            String cadena = new String(txtContraseña.getPassword());
            cadena = Hash.sha1(cadena);
            ResultSet rs = stm.executeQuery("select * from usuarios where clave='" +txtUsuario.getText() + "' and password= '"+ cadena+"'");
            if(rs.next()){
                Datos.idusuario=rs.getInt("idusuario");
                Datos.nombre = rs.getString("nombre");
                Datos.modRec = rs.getInt("mRecoleccion");
                Datos.modMed = rs.getInt("mMedicamentos");
                Datos.modUser = rs.getInt("mUsuarios");
                Datos.modGastos = rs.getInt("mGastos");
                Datos.modVentas = rs.getInt("mVentas");   
               // Datos.modUsuarios = rs.getInt("");
                FrmPrincipal ppal = new FrmPrincipal();
                ppal.setVisible(true);
                this.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(this, "usuario o Password inválido");
            }           
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
       
            
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void activaBoton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activaBoton
        // TODO add your handling code here:
        btnCfg.setVisible(!btnCfg.isVisible());
    }//GEN-LAST:event_activaBoton

    private void btnCfgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCfgActionPerformed
//         FrmCambioPwd fcpw = new FrmCambioPwd();
//         fcpw.setVisible(true);
        PantConfig pcfg = new PantConfig();
        pcfg.setVisible(true);
        btnCfg.setVisible(false);
    }//GEN-LAST:event_btnCfgActionPerformed
      
    
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCfg;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblActivar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
