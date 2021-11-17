 
package VISTA;

import CONTROLADOR.Metodos_sql_Usuario;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
        setLocationRelativeTo(null); //Centra la vantana en la pantalla
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        this.ocultar.setVisible(false);
        btnIngresar.setVisible(false);
       
    }
    Metodos_sql_Usuario metodos =new Metodos_sql_Usuario();
    
    public boolean ValidarEmail(String correo){
        Pattern pattern= Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather =pattern.matcher(correo);
        return mather.find();
    }
    public void validar(){
        
        if(txtCorreo.getText().isEmpty()){
            lblcorreo.setText("*Campo Vacio");
        }else if(ValidarEmail(txtCorreo.getText())){
            lblcorreo.setText("Correo valido");
        }else{
            lblcorreo.setText("*No valido");
        }
        
        if(txtContraseña.getText().isEmpty()){
            lblcontraseña.setText("*Campo Vacio");
        }else{
            lblcontraseña.setText("");
        }
        
        if(txtContraseña.getText().isEmpty()|| txtCorreo.getText().isEmpty() || lblcorreo.getText().equals("*No valido")){
            btnIngresar.setVisible(false);
        }else{
            btnIngresar.setVisible(true);
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnIngresar = new javax.swing.JButton();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(67, 108, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 275, 53));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar_sesión.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 70, 50));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CORREO ELECTRÓNICO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/@.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 48, 36));

        jSeparator1.setBackground(new java.awt.Color(109, 175, 223));
        jSeparator1.setForeground(new java.awt.Color(109, 175, 223));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 10));

        txtCorreo.setBackground(new java.awt.Color(67, 108, 180));
        txtCorreo.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(109, 175, 223));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(73, 181, 172));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 40));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 48, 42));

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
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 170, 36));

        jSeparator2.setBackground(new java.awt.Color(109, 175, 223));
        jSeparator2.setForeground(new java.awt.Color(109, 175, 223));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, 10));

        jCheckBox1.setBackground(new java.awt.Color(67, 108, 180));
        jCheckBox1.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recuérdame");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(90, 95, 99));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnIngresarMouseMoved(evt);
            }
        });
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 130, 40));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_eye_32px.png"))); // NOI18N
        ver.setText(" ");
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 40, -1));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_invisible_32px.png"))); // NOI18N
        ocultar.setText(" ");
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel2.setBackground(new java.awt.Color(67, 108, 180));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear nueva cuenta");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 50));

        lblcorreo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblcorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblcorreo.setText(" ");
        jPanel1.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 90, 20));

        lblcontraseña.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblcontraseña.setText(" ");
        jPanel1.add(lblcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 90, 20));

        jSeparator3.setBackground(new java.awt.Color(109, 175, 223));
        jSeparator3.setForeground(new java.awt.Color(109, 175, 223));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 250, 10));

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
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 50));

        jLabel1.setBackground(new java.awt.Color(67, 108, 180));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" -");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 40, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 380, 530));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eslogan.jpg"))); // NOI18N
        jLabel13.setText(" ");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, 230));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avión.png"))); // NOI18N
        jLabel12.setText(" ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 280));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
      
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        String busqueda_usuario = metodos.buscarUsuarioRegistrado(txtCorreo.getText().trim(), txtContraseña.getText().trim());
        
        if(txtCorreo.getText().trim().equals("root")&& txtContraseña.getText().trim().equals("20"))
        {
            Icon e= new ImageIcon(getClass().getResource("/Imagenes/entrar.png"));
            JOptionPane.showMessageDialog(this, "Bienvenido inciaste sesión como root (Administrador)","BIENVENIDO",JOptionPane.INFORMATION_MESSAGE,e);
            Menu_Principal ventana=new Menu_Principal();
            ventana.lblnombre.setText("Administrador");
            ventana.setVisible(true);
            this.dispose();
        }
        else if(busqueda_usuario.equals("usuario encontrado"))
        {
            Icon i= new ImageIcon(getClass().getResource("/Imagenes/entrar.png"));
            String busque_nombre= metodos.buscarNombre(txtCorreo.getText());
            JOptionPane.showMessageDialog(this, "Bienvenido (a)\n "+busque_nombre,"BIENVENIDO",JOptionPane.INFORMATION_MESSAGE,i);
            Menu_Principal ventana=new Menu_Principal();
            ventana.lblnombre.setText(busque_nombre);
            ventana.setVisible(true);
            this.dispose();
        }
        else{
            Icon n=new ImageIcon(getClass().getResource("/Imagenes/error.png"));
            JOptionPane.showMessageDialog(null,"Crear una nueva cuenta","Usuario no registrado",JOptionPane.ERROR_MESSAGE,n);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       Icon a =new ImageIcon(getClass().getResource("/Imagenes/close.png"));
       int s=JOptionPane.YES_NO_OPTION;
       int mensaje= JOptionPane.showConfirmDialog(this,"¿DESEA SALIR?","SALIR",s,JOptionPane.YES_NO_OPTION,a);
       if(mensaje==0){
           System.exit(s);
       }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
       ver.setVisible(false);
       ocultar.setVisible(true);
       txtContraseña.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
       ver.setVisible(true);
       ocultar.setVisible(false);
       txtContraseña.setEchoChar('●');
    }//GEN-LAST:event_ocultarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
          
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        frm_CrearCuenta nuevacuenta=new frm_CrearCuenta();
        nuevacuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        validar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        validar();
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void btnIngresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseMoved
        btnIngresar.setBackground(new java.awt.Color(54,6,55));
    }//GEN-LAST:event_btnIngresarMouseMoved

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
         btnIngresar.setBackground(new java.awt.Color(78,34,88));
    }//GEN-LAST:event_btnIngresarMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
