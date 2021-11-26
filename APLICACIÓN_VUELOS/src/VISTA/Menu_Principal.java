 
package VISTA;
import CONTROLADOR.conexion_equipaje;
import java.sql.ResultSet;
import CONTROLADOR.conexion_vuelos;
import MODELO.Equipaje;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Menu_Principal extends javax.swing.JFrame implements Runnable {
    String hora,minutos,segundos;
    Thread hilo;
    DefaultTableModel model,modelo;
    Statement pst;
    public Menu_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
        
        lblfechactual.setText(fecha());
        
        String[] titulos={"ID","Nombre","Apellido","sexo","Tipo doc.","N°doc.","Pasaporte","Origen","Destino","Salida","Retorno"};
        model=new DefaultTableModel(null,titulos);
        tblRegistrovuelos.setModel(model);
        
        String[] titulo = {"Nombre","Apellido","N°equip.","Peso","Precio"};
        modelo=new DefaultTableModel(null,titulo);
        tbRegistroequipaje.setModel(modelo);
        MostrarVuelos("vuelos");
        Limpiarvuelos();

    }
    public void hora()
    {
       Calendar calendario=new GregorianCalendar();
       Date horactual=new Date();
       calendario.setTime(horactual);
       hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+
            calendario.get(Calendar.HOUR_OF_DAY):"0"+
            calendario.get(Calendar.HOUR_OF_DAY);
       minutos=calendario.get(Calendar.MINUTE)>9?""+
               calendario.get(Calendar.MINUTE):"0"+
               calendario.get(Calendar.MINUTE);
       segundos=calendario.get(Calendar.SECOND)>9?""+
                calendario.get(Calendar.SECOND):"0"+
                calendario.get(Calendar.SECOND);
    }
    public void run()
    {
        Thread current=Thread.currentThread();
        while(current==hilo){
            hora();
            lblhoraactual.setText(hora+":"+minutos+":"+segundos);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones_sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        registroVuelos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registroEquipaje = new javax.swing.JLabel();
        infoVuelos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblfechactual = new javax.swing.JLabel();
        lblhoraactual = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        registro_vuelos = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cxbtipodocu = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtnumdocu = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtpasaporte = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cxborigen = new javax.swing.JComboBox<>();
        cxbdestino = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrovuelos = new javax.swing.JTable();
        fechsali = new com.toedter.calendar.JDateChooser();
        fechretor = new com.toedter.calendar.JDateChooser();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtid_vuelos = new javax.swing.JTextField();
        botonMasculino = new javax.swing.JRadioButton();
        botonfemenino = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        registro_equipaje1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnumequipaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtapellido1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRegistroequipaje = new javax.swing.JTable();
        btnAgregar1 = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        info_vuelos = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(67, 108, 180));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(54, 127, 168));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ACCESO AL SISTEMA");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIO DE SESIÓN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 40));

        salir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida-de-emergencia.png"))); // NOI18N
        salir.setText("Salir ");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 240, 30));

        registroVuelos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        registroVuelos.setForeground(new java.awt.Color(255, 255, 255));
        registroVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarse (2).png"))); // NOI18N
        registroVuelos.setText("Registro de Vuelos");
        registroVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroVuelosMouseClicked(evt);
            }
        });
        jPanel2.add(registroVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, 240, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("online");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_64px.png"))); // NOI18N
        jLabel8.setText(" ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 60, 70));

        registroEquipaje.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        registroEquipaje.setForeground(new java.awt.Color(255, 255, 255));
        registroEquipaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escala-de-equipaje.png"))); // NOI18N
        registroEquipaje.setText("Registro de Equipaje");
        registroEquipaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroEquipajeMouseClicked(evt);
            }
        });
        jPanel2.add(registroEquipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 240, 40));

        infoVuelos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        infoVuelos.setForeground(new java.awt.Color(255, 255, 255));
        infoVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion-de-vuelo.png"))); // NOI18N
        infoVuelos.setText("Información de vuelos");
        infoVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoVuelosMouseClicked(evt);
            }
        });
        jPanel2.add(infoVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 240, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj_1.png"))); // NOI18N
        jLabel9.setText("HORA:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fecha-tope_1.png"))); // NOI18N
        jLabel10.setText("FECHA:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblfechactual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblfechactual.setForeground(new java.awt.Color(0, 204, 204));
        lblfechactual.setText("DD/MM/YYYY");
        jPanel2.add(lblfechactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 100, 50));

        lblhoraactual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblhoraactual.setForeground(new java.awt.Color(0, 204, 204));
        lblhoraactual.setText("00:00:00");
        jPanel2.add(lblhoraactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, 50));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vuelos.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 458, 210, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 660));

        jPanel3.setBackground(new java.awt.Color(54, 127, 168));
        jPanel3.setForeground(new java.awt.Color(16, 78, 146));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INICIO DE SESIÓN COMO: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 40));

        lblnombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText(" ");
        jPanel3.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 240, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 850, 40));

        jPanel5.setLayout(new java.awt.CardLayout());

        registro_vuelos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setBackground(new java.awt.Color(175, 209, 236));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("REGISTRO DE VUELOS ");
        jLabel15.setOpaque(true);

        jPanel4.setBackground(new java.awt.Color(175, 209, 236));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Buscar:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtnombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtnombre.setText(" ");
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel4.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 14, 172, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Apellidos:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 53, 65, -1));

        txtapellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtapellido.setText(" ");
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel4.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 52, 172, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sexo:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tipo de documento:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 15, -1, -1));

        cxbtipodocu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cxbtipodocu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "DNI", "Carnet de extranjeria" }));
        jPanel4.add(cxbtipodocu, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 14, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Número de documento:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 53, -1, -1));

        txtnumdocu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtnumdocu.setText(" ");
        txtnumdocu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumdocuKeyTyped(evt);
            }
        });
        jPanel4.add(txtnumdocu, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 52, 125, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Pasaporte:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 84, -1, -1));

        txtpasaporte.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtpasaporte.setText(" ");
        txtpasaporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasaporteKeyTyped(evt);
            }
        });
        jPanel4.add(txtpasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 83, 127, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Origen:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Destino:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 128, -1, -1));

        cxborigen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cxborigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lima", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Huancavelica" }));
        jPanel4.add(cxborigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 127, -1, -1));

        cxbdestino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cxbdestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tokio", "New York", "Los Angeles", "Paris", "Seul", "Londres", "Moscu", "Boston", " ", " ", " " }));
        jPanel4.add(cxbdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 127, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Fecha de salida:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 133, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Fecha de retorno:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 161, -1, -1));

        tblRegistrovuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRegistrovuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblRegistrovuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrovuelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistrovuelos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 830, 238));

        fechsali.setBackground(new java.awt.Color(255, 255, 255));
        fechsali.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(fechsali, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 133, 131, -1));

        fechretor.setBackground(new java.awt.Color(255, 255, 255));
        fechretor.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(fechretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 161, 131, -1));

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-archivo.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        txtid_vuelos.setEditable(false);
        txtid_vuelos.setBackground(new java.awt.Color(175, 209, 236));
        txtid_vuelos.setForeground(new java.awt.Color(175, 209, 236));
        txtid_vuelos.setText(" ");
        txtid_vuelos.setBorder(null);
        txtid_vuelos.setOpaque(true);
        jPanel4.add(txtid_vuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 528, -1, -1));

        botonMasculino.setBackground(new java.awt.Color(175, 209, 236));
        botones_sexo.add(botonMasculino);
        botonMasculino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonMasculino.setForeground(new java.awt.Color(0, 0, 0));
        botonMasculino.setText("Masculino");
        botonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasculinoActionPerformed(evt);
            }
        });
        jPanel4.add(botonMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 20));

        botonfemenino.setBackground(new java.awt.Color(175, 209, 236));
        botones_sexo.add(botonfemenino);
        botonfemenino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonfemenino.setForeground(new java.awt.Color(0, 0, 0));
        botonfemenino.setText("Femenino");
        botonfemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonfemeninoActionPerformed(evt);
            }
        });
        jPanel4.add(botonfemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 20));

        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Nombres:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 15, -1, -1));

        txtbuscar.setText(" ");
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        jPanel4.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));

        jButton1.setBackground(new java.awt.Color(175, 209, 236));
        jButton1.setForeground(new java.awt.Color(175, 209, 236));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresion.png"))); // NOI18N
        jButton1.setText(" ");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 120, 60));

        javax.swing.GroupLayout registro_vuelosLayout = new javax.swing.GroupLayout(registro_vuelos);
        registro_vuelos.setLayout(registro_vuelosLayout);
        registro_vuelosLayout.setHorizontalGroup(
            registro_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registro_vuelosLayout.setVerticalGroup(
            registro_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro_vuelosLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(registro_vuelos, "card2");

        registro_equipaje1.setBackground(new java.awt.Color(255, 255, 255));
        registro_equipaje1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setBackground(new java.awt.Color(175, 209, 236));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("REGISTRO DE EQUIPAJE");
        jLabel23.setOpaque(true);

        jPanel6.setBackground(new java.awt.Color(175, 209, 236));

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel26.setText("Precio en S/.:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Nombres:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel1.setText("Nº de equipaje:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("Apellidos:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel11.setText("Peso: ");

        tbRegistroequipaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbRegistroequipaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRegistroequipajeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbRegistroequipaje);

        btnAgregar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar1.setText("AGREGAR");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        btnBorrar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBorrar1.setText("BORRAR");

        btnEditar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar1.setText("EDITAR");

        btnCancelar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar1.setText("CANCELAR");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(271, 271, 271)
                        .addComponent(btnBorrar1)
                        .addGap(75, 75, 75)
                        .addComponent(btnCancelar1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAgregar1)
                        .addGap(73, 73, 73)
                        .addComponent(btnEditar1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellido1))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumequipaje, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumequipaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar1)
                            .addComponent(btnEditar1)
                            .addComponent(btnBorrar1)
                            .addComponent(btnCancelar1)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registro_equipaje1Layout = new javax.swing.GroupLayout(registro_equipaje1);
        registro_equipaje1.setLayout(registro_equipaje1Layout);
        registro_equipaje1Layout.setHorizontalGroup(
            registro_equipaje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registro_equipaje1Layout.setVerticalGroup(
            registro_equipaje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro_equipaje1Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(registro_equipaje1, "card3");

        info_vuelos.setBackground(new java.awt.Color(255, 255, 255));
        info_vuelos.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setBackground(new java.awt.Color(175, 209, 236));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("INFORMACIÓN DE VUELOS");
        jLabel24.setOpaque(true);

        jPanel7.setBackground(new java.awt.Color(175, 209, 236));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        jLabel28.setText("ORIGENES DISPONIBLES");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel28)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 37, -1, -1));

        jLabel29.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        jLabel29.setText("DESTINOS DISPONIBLES");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel29)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 37, 370, 478));

        javax.swing.GroupLayout info_vuelosLayout = new javax.swing.GroupLayout(info_vuelos);
        info_vuelos.setLayout(info_vuelosLayout);
        info_vuelosLayout.setHorizontalGroup(
            info_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        info_vuelosLayout.setVerticalGroup(
            info_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_vuelosLayout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(info_vuelos, "card4");

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 850, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroVuelosMouseClicked
        registroVuelos.setBackground(new java.awt.Color(44,59,66));
        registro_vuelos.setVisible(true);
        
        registroEquipaje.setBackground(new java.awt.Color(44,59,66));
        registro_equipaje1.setVisible(false);
        
        infoVuelos.setBackground(new java.awt.Color(44,59,66));
        info_vuelos.setVisible(false);
    }//GEN-LAST:event_registroVuelosMouseClicked

    private void registroEquipajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroEquipajeMouseClicked
        registroVuelos.setBackground(new java.awt.Color(34,45,49));
        registro_vuelos.setVisible(false);
        
        registroEquipaje.setBackground(new java.awt.Color(34,45,49));
        registro_equipaje1.setVisible(true);
        
        infoVuelos.setBackground(new java.awt.Color(34,45,49));
        info_vuelos.setVisible(false);
    }//GEN-LAST:event_registroEquipajeMouseClicked

    private void infoVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoVuelosMouseClicked
        registroVuelos.setBackground(new java.awt.Color(34,45,49));
        registro_vuelos.setVisible(false);
        
        registroEquipaje.setBackground(new java.awt.Color(34,45,49));
        registro_equipaje1.setVisible(false);
        
        infoVuelos.setBackground(new java.awt.Color(44,59,66));
        info_vuelos.setVisible(true);
    }//GEN-LAST:event_infoVuelosMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        conexion_vuelos objconexion=new conexion_vuelos();
        Connection cn=objconexion.conexion_vuelos();
        String sexo;
        if(botonMasculino.isSelected()== true){
            sexo="Masculino";
        }else if (botonfemenino.isSelected()== true){
            sexo="Femenino";
        }else{
            sexo="Masculino";
        }
        try {
            String sql="UPDATE vuelos SET Nombre=?,Apellido=?,sexo=?,tip_documento=?,num_documento=?,num_pasaporte=?,"
                    + "origen=?,destino=?,fecha_salida=?,fecha_retorno=? WHERE id_vuelos=?";
            PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);
            int id=Integer.parseInt(txtid_vuelos.getText().trim());
            pst.setString(1,txtnombre.getText().trim());
            pst.setString(2,txtapellido.getText().trim());
            pst.setString(3,sexo);
            pst.setString(4,cxbtipodocu.getSelectedItem().toString().trim());
            pst.setString(5,txtnumdocu.getText().trim());
            pst.setString(6,txtpasaporte.getText().trim());
            pst.setString(7,cxborigen.getSelectedItem().toString().trim());
            pst.setString(8,cxbdestino.getSelectedItem().toString().trim());
            pst.setString(9,((JTextField)fechsali.getDateEditor().getUiComponent()).getText().trim());
            pst.setString(10,((JTextField)fechretor.getDateEditor().getUiComponent()).getText().trim());
            pst.setInt(11,id);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registro modificado");
            Limpiarvuelos();
            MostrarVuelos("vuelos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de Registro"+e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        conexion_vuelos objconexion=new conexion_vuelos();
        Connection cn=objconexion.conexion_vuelos();  
        try {
            Icon a =new ImageIcon(getClass().getResource("/Imagenes/eliminar.png"));
            int s=JOptionPane.YES_NO_OPTION;
            int mensaje= JOptionPane.showConfirmDialog(this,"¿Seguro que desea eliminar este registro?","ELIMINAR REGISTRO",s,JOptionPane.YES_NO_OPTION,a);
            if(mensaje==0){
               String sql="DELETE FROM vuelos WHERE id_vuelos=?";
               PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);
               int id=Integer.parseInt(txtid_vuelos.getText().trim());
               pst.setInt(1,id);
               pst.executeUpdate();
               JOptionPane.showMessageDialog(null,"Registro eliminado");
            }else if(mensaje==1){
               JOptionPane.showMessageDialog(null,"Se cancelo la eliminación");
            }
            
            Limpiarvuelos();
            MostrarVuelos("vuelos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de Registro"+e.getMessage());
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       registro_datos();
       MostrarVuelos("vuelos");
       Limpiarvuelos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        conexion_equipaje Objconexion= new conexion_equipaje();
        Equipaje Oequipaje= recupeDatosGUI();
        String strSentenciaInsert=String.format("INSERT INTO equipaje(Nombre,Apellido,Num_equipaje,Peso,Precio) "
            + "VALUES ('%s','%s','%s','%s','%s')",Oequipaje.getNombre1(),Oequipaje.getApellido1(),Oequipaje.getNum_equipaje(),Oequipaje.getPeso(),Oequipaje.getPrecio());

        Objconexion.ejecutarsentenciasql(strSentenciaInsert);
         
    }//GEN-LAST:event_btnAgregar1ActionPerformed
     
    
    public void MostrarDatos1(){
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        conexion_equipaje Objconexion=new conexion_equipaje();
        try {
            ResultSet resultado=Objconexion.consultarRegistros("SELECT * FROM equipaje");
            while (resultado.next()) {                
                System.out.println(resultado.getString("Nombre"));
                System.out.println(resultado.getString("Apellido"));
                System.out.println(resultado.getString("Num_equipaje"));
                System.out.println(resultado.getString("Peso"));
                System.out.println(resultado.getString("Precio"));
                Object[] Oequipaje={resultado.getString("Nombre"),resultado.getString("Apellido"),resultado.getString("Correo")};
                modelo.addRow(Oequipaje);
            }
        } catch (Exception e) {
            System.out.println(e);
        }   
    }
    
    private void tbRegistroequipajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRegistroequipajeMouseClicked
    }//GEN-LAST:event_tbRegistroequipajeMouseClicked

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
      
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
      char validar=evt.getKeyChar();
                 if(Character.isDigit(validar))
                 {
                    getToolkit().beep();
                    evt.consume();
                    
                    JOptionPane.showMessageDialog(rootPane,"Ingresar solo Letras");
                 }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char validar=evt.getKeyChar();
                 if(Character.isDigit(validar))
                 {
                    getToolkit().beep();
                    evt.consume();
                    
                    JOptionPane.showMessageDialog(rootPane,"Ingresar solo Letras");
                 }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtnumdocuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumdocuKeyTyped

        ValidarLongitudCadena(txtnumdocu.getText(),12, evt);
                ValidarLetrasNumeros(Character.isLetter(evt.getKeyChar()), evt);     
    }//GEN-LAST:event_txtnumdocuKeyTyped

    private void txtpasaporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasaporteKeyTyped
       ValidarLongitudCadena(txtpasaporte.getText(),12, evt);
                ValidarLetrasNumeros(Character.isLetter(evt.getKeyChar()), evt);
    }//GEN-LAST:event_txtpasaporteKeyTyped

    private void botonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasculinoActionPerformed
       sexo="Masculino";
    }//GEN-LAST:event_botonMasculinoActionPerformed

    private void botonfemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonfemeninoActionPerformed
       sexo="Femenino";
    }//GEN-LAST:event_botonfemeninoActionPerformed

    private void tblRegistrovuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrovuelosMouseClicked
         
        try {
            int i=tblRegistrovuelos.getSelectedRow();
            txtid_vuelos.setText((String) model.getValueAt(i, 0));
            txtnombre.setText(model.getValueAt(i, 1).toString());
            txtapellido.setText(model.getValueAt(i, 2).toString());
            String sex=model.getValueAt(i, 3).toString();
            if(sex.equals("Masculino")){
                botonMasculino.setSelected(true);
            }else{
                botonfemenino.setSelected(true);
            }
            String tip_docu=model.getValueAt(i, 4).toString();
            if(tip_docu.equals("DNI")){
                cxbtipodocu.setSelectedIndex(1);
            }else{
                cxbtipodocu.setSelectedIndex(2);
            }
            txtnumdocu.setText(model.getValueAt(i, 5).toString());
            txtpasaporte.setText(model.getValueAt(i, 6).toString());
            String origen=model.getValueAt(i, 7).toString();
            switch(origen){
                case "Lima":
                 cxborigen.setSelectedIndex(1);
                 break;
                case "Amazonas":
                 cxborigen.setSelectedIndex(2);
                 break;
                case "Ancash":
                 cxborigen.setSelectedIndex(3);
                 break;
                case "Apurimac":
                 cxborigen.setSelectedIndex(4);
                 break;
                case "Arequipa":
                 cxborigen.setSelectedIndex(5);
                 break;
                case "Ayacucho":
                 cxborigen.setSelectedIndex(6);
                 break;
                case "Cajamarca":
                 cxborigen.setSelectedIndex(7);
                 break;
                case "Callao":
                 cxborigen.setSelectedIndex(8);
                 break;
                case "Huancavelica":
                 cxborigen.setSelectedIndex(9);
                 break;
            }
            String destino=model.getValueAt(i, 8).toString();
                switch(destino){
                case "Tokio":
                    cxbdestino.setSelectedIndex(1);
                    break;
                case "New York":
                    cxbdestino.setSelectedIndex(2);
                    break;
                case "Los Angeles":
                    cxbdestino.setSelectedIndex(3);
                    break;
                case "Paris":
                    cxbdestino.setSelectedIndex(4);
                    break;
                case "Seul":
                    cxbdestino.setSelectedIndex(5);
                    break;
                case "Londres":
                    cxbdestino.setSelectedIndex(6);
                    break;
                case "Moscu":
                    cxbdestino.setSelectedIndex(7);
                    break;
                case "Boston":
                    cxbdestino.setSelectedIndex(8);
                    break;
                }
           
            Date fechasali=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i, 9).toString());
            Date fecharetor=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i, 10).toString()); 
            fechsali.setDate(fechasali);
            fechretor.setDate(fecharetor);

        } catch (Exception e) {
        }
        
        
 
         btnAgregar.setEnabled(false);
         btnEditar.setEnabled(true);
         btnBorrar.setEnabled(true);
    }//GEN-LAST:event_tblRegistrovuelosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       Limpiarvuelos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        String buscar=txtbuscar.getText().trim();
        BuscarNombre(buscar);
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             try {
                 tblRegistrovuelos.print(); // Imprime el jTable
                 } catch (PrinterException ex) { } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    //METODOS 
    public static String fecha()
    {
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    
    public void registro_datos(){
       
        conexion_vuelos objconexion=new conexion_vuelos();
        Connection cn=objconexion.conexion_vuelos();
        
        try {
            String sql="INSERT INTO vuelos(id_vuelos,Nombre,Apellido,sexo,tip_documento,num_documento,num_pasaporte,origen,destino,fecha_salida,fecha_retorno)VALUES(null,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sql);
            //pst.setInt(1,Integer.parseInt(txtid_vuelos.getText().trim()));
            pst.setString(1,txtnombre.getText().trim());
            pst.setString(2,txtapellido.getText().trim());
            pst.setString(3,sexo);
            pst.setString(4,cxbtipodocu.getSelectedItem().toString().trim());
            pst.setString(5,txtnumdocu.getText().trim());
            pst.setString(6,txtpasaporte.getText().trim());
            pst.setString(7,cxborigen.getSelectedItem().toString().trim());
            pst.setString(8,cxbdestino.getSelectedItem().toString().trim());
            pst.setString(9,((JTextField)fechsali.getDateEditor().getUiComponent()).getText().trim());
            pst.setString(10,((JTextField)fechretor.getDateEditor().getUiComponent()).getText().trim());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Registro Exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de Registro"+e.getMessage());
        }
 
    }
    public void MostrarVuelos (String tabla){
        while (model.getRowCount()>0) {
            model.removeRow(0);
        }
        String sql="SELECT * FROM "+tabla;
        conexion_vuelos con=new conexion_vuelos();
        Connection conexion=con.conexion_vuelos();
        Statement st;
        
        
        String []datos=new String[11];
        int[]anchos = {4,55,90,44,40,71,71,50,55,55,55};
        for(int i=0; i<tblRegistrovuelos.getColumnCount();i++){
            tblRegistrovuelos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try {
            st=conexion.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while (rs.next()) {                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);
                model.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
    }
    
    public void BuscarNombre(String texto){
     
        conexion_vuelos objconexion=new conexion_vuelos();
        Connection cn=objconexion.conexion_vuelos();
         try {
            String[] titulos={"ID","Nombre","Apellido","sexo","Tipo doc.","N°doc.","Pasaporte","Origen","Destino","Salida","Retorno"};
            String filtro=""+texto+"%";
            String sql="";
            if(texto.equals("")){
                sql="SELECT * FROM vuelos";
            }else{
                sql="SELECT * FROM vuelos WHERE Nombre LIKE"+'"'+filtro+'"';
            }
            
            model=new DefaultTableModel(null,titulos);
            pst=(PreparedStatement) cn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery(sql);
            String[] fila=new String[11];
            while(rs.next()){
                fila[0]=rs.getString("id_vuelos");
                fila[1]=rs.getString("Nombre");
                fila[2]=rs.getString("Apellido");
                fila[3]=rs.getString("sexo");
                fila[4]=rs.getString("tip_documento");
                fila[5]=rs.getString("num_documento");
                fila[6]=rs.getString("num_pasaporte");
                fila[7]=rs.getString("origen");
                fila[8]=rs.getString("destino");
                fila[9]=rs.getString("fecha_salida");
                fila[10]=rs.getString("fecha_retorno");
                model.addRow(fila);
            }
            tblRegistrovuelos.setModel(model);
            rs.close();
            pst.close();
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error"+e.toString());        
        }
    }
    
    
    //VALIDACIÓN DE INGRESO DE DATOS 
    public void ValidarLongitudCadena(String cadena,int tamanio,KeyEvent ev)
    {
        if(cadena.trim().length()==tamanio){ev.consume();}
    }
    public void ValidarLetrasNumeros(boolean dt, KeyEvent e){
        if(dt){e.consume();}
    }
    
    public void Limpiarvuelos(){
         txtnombre.setText("");
         txtapellido.setText("");
         botones_sexo.clearSelection();
         cxbtipodocu.setSelectedIndex(0);
         txtnumdocu.setText("");
         txtpasaporte.setText("");
         cxborigen.setSelectedIndex(0);
         cxbdestino.setSelectedIndex(0);
         fechsali.setCalendar(null);
         fechretor.setCalendar(null);
         txtnombre.requestFocus();
         
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnBorrar.setEnabled(false);
    }
    
    public void Limpiar1(){
        
    }
    
    public Equipaje recupeDatosGUI(){
        Equipaje OEquipajes=new Equipaje();
        OEquipajes.setNombre1(txtnombre1.getText().trim());
        OEquipajes.setApellido1(txtapellido.getText().trim());
        OEquipajes.setNum_equipaje(txtnumequipaje.getText().trim());
        OEquipajes.setPeso(cxbtipodocu.getSelectedItem().toString().trim());
        OEquipajes.setPrecio(txtnumdocu.getText().trim());
        
        return OEquipajes;
    }
  
    
    
    
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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonMasculino;
    private javax.swing.ButtonGroup botones_sexo;
    private javax.swing.JRadioButton botonfemenino;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JComboBox<String> cxbdestino;
    private javax.swing.JComboBox<String> cxborigen;
    private javax.swing.JComboBox<String> cxbtipodocu;
    private com.toedter.calendar.JDateChooser fechretor;
    private com.toedter.calendar.JDateChooser fechsali;
    private javax.swing.JLabel infoVuelos;
    private javax.swing.JPanel info_vuelos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblfechactual;
    private javax.swing.JLabel lblhoraactual;
    public javax.swing.JLabel lblnombre;
    private javax.swing.JLabel registroEquipaje;
    private javax.swing.JLabel registroVuelos;
    private javax.swing.JPanel registro_equipaje1;
    private javax.swing.JPanel registro_vuelos;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tbRegistroequipaje;
    private javax.swing.JTable tblRegistrovuelos;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtapellido1;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtid_vuelos;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnumdocu;
    private javax.swing.JTextField txtnumequipaje;
    private javax.swing.JTextField txtpasaporte;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
private String sexo;
}

