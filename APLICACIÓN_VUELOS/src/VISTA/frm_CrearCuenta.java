
package VISTA;

import CONTROLADOR.Metodos_sql_Usuario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frm_CrearCuenta extends javax.swing.JFrame {

    public frm_CrearCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lvlocultar.setVisible(false);
        btnCrearCuenta.setVisible(false);
    }
    Metodos_sql_Usuario metodos=new Metodos_sql_Usuario();
    
    public boolean ValidarEmail(String correo){
        Pattern pattern= Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather =pattern.matcher(correo);
        return mather.find();
    }
    public void validar(){
        
        if(txtcorreo.getText().isEmpty()){
            lblcorreo.setText("*Campo Vacio");
        }else if(ValidarEmail(txtcorreo.getText())){
            lblcorreo.setText("Correo valido");
        }else{
            lblcorreo.setText("*No valido");
        }
        
        if(txtContraseña.getText().isEmpty()){
            lblcontraseña.setText("*Campo Vacio");
        }else{
            lblcontraseña.setText("");
        }
        
        if(txtnombre.getText().isEmpty()){
            lblnombres.setText("*Campo Vacio");
        }else{
            lblnombres.setText("");
        }
        
        if(txtapellido.getText().isEmpty()){
            lblapellidos.setText("*Campo Vacio");
        }else{
            lblapellidos.setText("");
        }
        
        if(txtContraseña.getText().isEmpty()|| txtcorreo.getText().isEmpty() || lblapellidos.getText().equals("*No valido")){
            btnCrearCuenta.setVisible(false);
        }else{
            btnCrearCuenta.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        lblver = new javax.swing.JLabel();
        lvlocultar = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnCrearCuenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(67, 108, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear Cuenta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 275, 53));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombres:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtnombre.setBackground(new java.awt.Color(67, 108, 180));
        txtnombre.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(109, 175, 223));
        txtnombre.setBorder(null);
        txtnombre.setCaretColor(new java.awt.Color(73, 181, 172));
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, 40));

        jSeparator2.setBackground(new java.awt.Color(109, 175, 223));
        jSeparator2.setForeground(new java.awt.Color(109, 175, 223));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 250, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_account_60px.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 57, -1));

        jLabel9.setBackground(new java.awt.Color(67, 108, 180));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" -");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, 40));

        jLabel14.setBackground(new java.awt.Color(67, 108, 180));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" x");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 40, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_contact_30px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 48, -1));

        jSeparator5.setBackground(new java.awt.Color(109, 175, 223));
        jSeparator5.setForeground(new java.awt.Color(109, 175, 223));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/@.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 48, 36));

        txtapellido.setBackground(new java.awt.Color(67, 108, 180));
        txtapellido.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(109, 175, 223));
        txtapellido.setBorder(null);
        txtapellido.setCaretColor(new java.awt.Color(73, 181, 172));
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 210, 40));

        jSeparator6.setBackground(new java.awt.Color(109, 175, 223));
        jSeparator6.setForeground(new java.awt.Color(109, 175, 223));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 250, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 48, 36));

        txtcorreo.setBackground(new java.awt.Color(67, 108, 180));
        txtcorreo.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(109, 175, 223));
        txtcorreo.setBorder(null);
        txtcorreo.setCaretColor(new java.awt.Color(73, 181, 172));
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 210, 40));

        jSeparator7.setBackground(new java.awt.Color(109, 175, 223));
        jSeparator7.setForeground(new java.awt.Color(109, 175, 223));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 250, 10));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_name_30px.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 48, 36));

        lblver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_eye_32px.png"))); // NOI18N
        lblver.setText(" ");
        lblver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblverMouseClicked(evt);
            }
        });
        jPanel1.add(lblver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 30, -1));

        lvlocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_invisible_32px.png"))); // NOI18N
        lvlocultar.setText(" ");
        lvlocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlocultarMouseClicked(evt);
            }
        });
        jPanel1.add(lvlocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 30, -1));

        txtContraseña.setBackground(new java.awt.Color(67, 108, 180));
        txtContraseña.setFont(txtContraseña.getFont().deriveFont(txtContraseña.getFont().getSize()+7f));
        txtContraseña.setForeground(new java.awt.Color(109, 175, 223));
        txtContraseña.setBorder(null);
        txtContraseña.setCaretColor(new java.awt.Color(73, 181, 172));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 160, 40));

        btnCrearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(90, 95, 99));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 300, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_left_52px.png"))); // NOI18N
        jLabel2.setText(" ");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        lblcontraseña.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblcontraseña.setText(" ");
        lblcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblcontraseñaKeyReleased(evt);
            }
        });
        jPanel1.add(lblcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 90, 30));

        lblapellidos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblapellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblapellidos.setText(" ");
        lblapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblapellidosKeyReleased(evt);
            }
        });
        jPanel1.add(lblapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 90, 30));

        lblnombres.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblnombres.setForeground(new java.awt.Color(255, 255, 255));
        lblnombres.setText(" ");
        lblnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblnombresKeyReleased(evt);
            }
        });
        jPanel1.add(lblnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 90, 30));

        lblcorreo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblcorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblcorreo.setText(" ");
        jPanel1.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        validar();
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char validar=evt.getKeyChar();
                 if(Character.isDigit(validar))
                 {
                    getToolkit().beep();
                    evt.consume();
                    
                    JOptionPane.showMessageDialog(rootPane,"Ingresar solo Letras");
                 }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Icon a =new ImageIcon(getClass().getResource("/Imagenes/close.png"));
       int s=JOptionPane.YES_NO_OPTION;
       int mensaje= JOptionPane.showConfirmDialog(this,"¿DESEA SALIR?","SALIR",s,JOptionPane.YES_NO_OPTION,a);
       if(mensaje==0){
           System.exit(s);
       }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void txtapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyReleased
        validar();
    }//GEN-LAST:event_txtapellidoKeyReleased

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char validar=evt.getKeyChar();
                 if(Character.isDigit(validar))
                 {
                    getToolkit().beep();
                    evt.consume();
                    
                    JOptionPane.showMessageDialog(rootPane,"Ingresar solo Letras");
                 }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void txtcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyReleased
        validar();
    }//GEN-LAST:event_txtcorreoKeyReleased

    private void lblverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblverMouseClicked
        lblver.setVisible(false);
        lvlocultar.setVisible(true);
        txtContraseña.setEchoChar((char)0);
    }//GEN-LAST:event_lblverMouseClicked

    private void lvlocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlocultarMouseClicked
        lblver.setVisible(true);
        lvlocultar.setVisible(false);
        txtContraseña.setEchoChar('●');
    }//GEN-LAST:event_lvlocultarMouseClicked

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed

    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
       validar();
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed

        int i=metodos.guardar(txtnombre.getText(),txtapellido.getText(), txtcorreo.getText(), txtContraseña.getText());
        if (i>0){
            JOptionPane.showMessageDialog(this, "Datos Guardados correctamente");    
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo guardar los datos");
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       Login regresar =new Login();
       regresar.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblnombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblnombresKeyReleased
      
    }//GEN-LAST:event_lblnombresKeyReleased

    private void lblapellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblapellidosKeyReleased
       
    }//GEN-LAST:event_lblapellidosKeyReleased

    private void lblcontraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblcontraseñaKeyReleased
  
    }//GEN-LAST:event_lblcontraseñaKeyReleased

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
            java.util.logging.Logger.getLogger(frm_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lblver;
    private javax.swing.JLabel lvlocultar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
