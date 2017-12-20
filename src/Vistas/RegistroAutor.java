/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ConexionBD.Conexion;
import DAO.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author panch
 */
public class RegistroAutor extends javax.swing.JFrame implements CRUD {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    String modificar;

    public RegistroAutor() {
        initComponents();
        listar();
        limpiar();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoP = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblBuscar = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAutor = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtNombreAutor = new javax.swing.JFormattedTextField();
        txtApellidoPAutor = new javax.swing.JFormattedTextField();
        txtApellidoMAutor = new javax.swing.JFormattedTextField();
        comboAutor = new javax.swing.JComboBox<>();
        lblRUT = new javax.swing.JLabel();
        txtRutAutor = new javax.swing.JFormattedTextField();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAutor = new javax.swing.JMenu();
        RegistrarAutor = new javax.swing.JMenuItem();
        MenuCategoria = new javax.swing.JMenu();
        RegistrarCategoria = new javax.swing.JMenuItem();
        MenuDistribuidor = new javax.swing.JMenu();
        RegistrarDistribuidor = new javax.swing.JMenuItem();
        MenuEditorial = new javax.swing.JMenu();
        RegistrarEditorial = new javax.swing.JMenuItem();
        MenuIdioma = new javax.swing.JMenu();
        RegistrarIdioma = new javax.swing.JMenuItem();
        MenuLibros = new javax.swing.JMenu();
        RegistrarLibros = new javax.swing.JMenuItem();
        MenuMetodosPago = new javax.swing.JMenu();
        RegistrarMetodoPago = new javax.swing.JMenuItem();
        MenuEstados = new javax.swing.JMenu();
        RegistrarEstadoLibro = new javax.swing.JMenuItem();
        MenuTrabajador = new javax.swing.JMenu();
        RegistrarTrabajador = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Registro de Autor");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 430, 50));

        lblNombre.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        PanelPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 90, 20));

        lblApellidoP.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoP.setText("Apellido Paterno");
        PanelPrincipal.add(lblApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 110, 20));

        lblApellidoM.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoM.setText("Apellido Materno");
        PanelPrincipal.add(lblApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 120, 20));
        PanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 182, 800, 10));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));
        PanelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));
        PanelPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));
        PanelPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 252, 800, 10));

        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar por");
        PanelPrincipal.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 70, 20));
        PanelPrincipal.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 130, -1));

        tablaAutor = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaAutor.setAutoCreateRowSorter(true);
        tablaAutor.setBackground(new java.awt.Color(0, 204, 255));
        tablaAutor.setForeground(new java.awt.Color(255, 255, 255));
        tablaAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaAutor.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaAutor.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablaAutor.getTableHeader().setReorderingAllowed(false);
        tablaAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAutorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAutor);
        tablaAutor.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        PanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 730, 110));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        try {
            txtNombreAutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("????????????????????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNombreAutor.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtNombreAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 150, -1));

        try {
            txtApellidoPAutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("??????????????????????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtApellidoPAutor.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtApellidoPAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, -1));

        try {
            txtApellidoMAutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("?????????????????????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtApellidoMAutor.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtApellidoMAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 150, -1));

        comboAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboAutor.setAutoscrolls(true);
        PanelPrincipal.add(comboAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 120, -1));

        lblRUT.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRUT.setForeground(new java.awt.Color(255, 255, 255));
        lblRUT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRUT.setText("RUT");
        PanelPrincipal.add(lblRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 50, -1));

        try {
            txtRutAutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRutAutor.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtRutAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        PanelPrincipal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 470));

        MenuAutor.setText("Autor");

        RegistrarAutor.setText("Registrar");
        RegistrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarAutorActionPerformed(evt);
            }
        });
        MenuAutor.add(RegistrarAutor);

        jMenuBar1.add(MenuAutor);

        MenuCategoria.setText("Categoría");

        RegistrarCategoria.setText("Registrar");
        RegistrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarCategoriaActionPerformed(evt);
            }
        });
        MenuCategoria.add(RegistrarCategoria);

        jMenuBar1.add(MenuCategoria);

        MenuDistribuidor.setText("Distribuidor");

        RegistrarDistribuidor.setText("Registrar");
        RegistrarDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarDistribuidorActionPerformed(evt);
            }
        });
        MenuDistribuidor.add(RegistrarDistribuidor);

        jMenuBar1.add(MenuDistribuidor);

        MenuEditorial.setText("Editorial");

        RegistrarEditorial.setText("Registrar");
        RegistrarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEditorialActionPerformed(evt);
            }
        });
        MenuEditorial.add(RegistrarEditorial);

        jMenuBar1.add(MenuEditorial);

        MenuIdioma.setText("Idioma");

        RegistrarIdioma.setText("Registrar");
        RegistrarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarIdiomaActionPerformed(evt);
            }
        });
        MenuIdioma.add(RegistrarIdioma);

        jMenuBar1.add(MenuIdioma);

        MenuLibros.setText("Libros");

        RegistrarLibros.setText("Registrar");
        RegistrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarLibrosActionPerformed(evt);
            }
        });
        MenuLibros.add(RegistrarLibros);

        jMenuBar1.add(MenuLibros);

        MenuMetodosPago.setText("Metodos de Pago");

        RegistrarMetodoPago.setText("Registrar");
        RegistrarMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMetodoPagoActionPerformed(evt);
            }
        });
        MenuMetodosPago.add(RegistrarMetodoPago);

        jMenuBar1.add(MenuMetodosPago);

        MenuEstados.setText("Estado Libros");

        RegistrarEstadoLibro.setText("Registrar");
        RegistrarEstadoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEstadoLibroActionPerformed(evt);
            }
        });
        MenuEstados.add(RegistrarEstadoLibro);

        jMenuBar1.add(MenuEstados);

        MenuTrabajador.setText("Trabajador");

        RegistrarTrabajador.setText("Registrar");
        RegistrarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarTrabajadorActionPerformed(evt);
            }
        });
        MenuTrabajador.add(RegistrarTrabajador);

        jMenuBar1.add(MenuTrabajador);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        insertar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAutorMouseClicked
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = tablaAutor.getSelectedRow();
            String RUT = tablaAutor.getValueAt(filaSeleccionada, 0).toString().trim();
            modificar = tablaAutor.getValueAt(filaSeleccionada, 0).toString().trim();
            String nombre = tablaAutor.getValueAt(filaSeleccionada, 1).toString().trim();
            String ApellidoP = tablaAutor.getValueAt(filaSeleccionada, 2).toString().trim();
            String ApellidoM = tablaAutor.getValueAt(filaSeleccionada, 3).toString().trim();
            txtRutAutor.setText(RUT);
            txtNombreAutor.setText(nombre);
            txtApellidoPAutor.setText(ApellidoP);
            txtApellidoMAutor.setText(ApellidoM);
        }
    }//GEN-LAST:event_tablaAutorMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPor();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void RegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAutorActionPerformed
        RegistroAutor registroAutor = new RegistroAutor();
        registroAutor.setVisible(true);
        registroAutor.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarAutorActionPerformed

    private void RegistrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarCategoriaActionPerformed
        RegistroCategoria registroCategoria = new RegistroCategoria();
        registroCategoria.setVisible(true);
        registroCategoria.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarCategoriaActionPerformed

    private void RegistrarDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarDistribuidorActionPerformed
        RegistroDistribuidor registroDistribuidor = new RegistroDistribuidor();
        registroDistribuidor.setVisible(true);
        registroDistribuidor.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarDistribuidorActionPerformed

    private void RegistrarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEditorialActionPerformed
        RegistroEditorial registroEditorial = new RegistroEditorial();
        registroEditorial.setVisible(true);
        registroEditorial.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarEditorialActionPerformed

    private void RegistrarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarIdiomaActionPerformed
        RegistroIdioma registroIdioma = new RegistroIdioma();
        registroIdioma.setVisible(true);
        registroIdioma.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarIdiomaActionPerformed

    private void RegistrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarLibrosActionPerformed
        RegistroLibro registroLibro = new RegistroLibro();
        registroLibro.setVisible(true);
        registroLibro.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarLibrosActionPerformed

    private void RegistrarMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMetodoPagoActionPerformed
        RegistroMetodoPago metodoPago = new RegistroMetodoPago();
        metodoPago.setVisible(true);
        metodoPago.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarMetodoPagoActionPerformed

    private void RegistrarEstadoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEstadoLibroActionPerformed
        RegistroEstadoLibro registroEstadoLibro = new RegistroEstadoLibro();
        registroEstadoLibro.setVisible(true);
        registroEstadoLibro.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarEstadoLibroActionPerformed

    private void RegistrarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarTrabajadorActionPerformed
        RegistroTrabajador registroTrabajador = new RegistroTrabajador();
        registroTrabajador.setVisible(true);
        registroTrabajador.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_RegistrarTrabajadorActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenu MenuAutor;
    private javax.swing.JMenu MenuCategoria;
    private javax.swing.JMenu MenuDistribuidor;
    private javax.swing.JMenu MenuEditorial;
    private javax.swing.JMenu MenuEstados;
    private javax.swing.JMenu MenuIdioma;
    private javax.swing.JMenu MenuLibros;
    private javax.swing.JMenu MenuMetodosPago;
    private javax.swing.JMenu MenuTrabajador;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JMenuItem RegistrarAutor;
    private javax.swing.JMenuItem RegistrarCategoria;
    private javax.swing.JMenuItem RegistrarDistribuidor;
    private javax.swing.JMenuItem RegistrarEditorial;
    private javax.swing.JMenuItem RegistrarEstadoLibro;
    private javax.swing.JMenuItem RegistrarIdioma;
    private javax.swing.JMenuItem RegistrarLibros;
    private javax.swing.JMenuItem RegistrarMetodoPago;
    private javax.swing.JMenuItem RegistrarTrabajador;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboAutor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRUT;
    private javax.swing.JTable tablaAutor;
    private javax.swing.JFormattedTextField txtApellidoMAutor;
    private javax.swing.JFormattedTextField txtApellidoPAutor;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JFormattedTextField txtNombreAutor;
    private javax.swing.JFormattedTextField txtRutAutor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiar() {
        txtRutAutor.setText("");
        txtNombreAutor.setText("");
        txtApellidoPAutor.setText("");
        txtApellidoMAutor.setText("");
        txtBusqueda.setText("");
    }

    @Override
    public void modificar() {
        try {
            String rut = txtRutAutor.getText().trim();
            String nombre = txtNombreAutor.getText().trim();
            String ApellidoP = txtApellidoPAutor.getText().trim();
            String ApellidoM = txtApellidoPAutor.getText().trim();
            String sql = "UPDATE Autor SET RUT='" + rut + "', NOMBRE='" + nombre + "', APELLIDO_PATERNO='" + ApellidoP + "', APELLIDO_MATERNO='" + ApellidoM + "' WHERE RUT ='" + modificar + "'";
            ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res > 0) {
                limpiar();
                listar();
                JOptionPane.showMessageDialog(null, "Se ha modificar satisfactoriamente su registro", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            String rut = txtRutAutor.getText().trim();
            int largo = rut.length();
            String verifica = rut.substring(largo - 1);
            String punto = Character.toString(rut.charAt(0));
            if (txtRutAutor.getText().trim().equals(".   .   -")) {
                JOptionPane.showMessageDialog(null, "No se ingresó RUT", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (verifica.equals("-") || punto.equals(".")) {
                JOptionPane.showMessageDialog(null, "RUT mal formado", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtNombreAutor.getText().trim().length() == 0 || txtNombreAutor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó Nombre", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtApellidoPAutor.getText().trim().length() == 0 || txtApellidoPAutor.getText().trim().equals("")) {

                JOptionPane.showMessageDialog(null, "No se ingresó el Apellido Paterno", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtApellidoMAutor.getText().trim().length() == 0 || txtApellidoMAutor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó el Apellido Materno", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha ingresado correctamente a la BD, ya está ese nombre en uso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void llenarCombo() {
        try {
            String sql = "SELECT * FROM Autor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantColumnas; i++) {
                comboAutor.addItem(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertar() {
        try {
            String sql = "INSERT INTO Autor VALUES(?,?,?,?)";
            ps = con.prepareStatement(sql);
            String rut = txtRutAutor.getText().trim();
            String nombre = txtNombreAutor.getText().trim();
            String ApellidoP = txtApellidoPAutor.getText().trim();
            String ApellidoM = txtApellidoMAutor.getText().trim();
            ps.setString(1, rut);
            ps.setString(2, nombre);
            ps.setString(3, ApellidoP);
            ps.setString(4, ApellidoM);
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente el valor a la BD", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                listar();
            }

        } catch (SQLException ex) {
            String rut = txtRutAutor.getText().trim();
            int largo = rut.length();
            String verifica = rut.substring(largo - 1);
            String punto = Character.toString(rut.charAt(0));
            if (txtRutAutor.getText().trim().equals(".   .   -")) {
                JOptionPane.showMessageDialog(null, "No se ingresó RUT", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (verifica.equals("-") || punto.equals(".")) {
                JOptionPane.showMessageDialog(null, "RUT mal formado", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtNombreAutor.getText().trim().length() == 0 || txtNombreAutor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó Nombre", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtApellidoPAutor.getText().trim().length() == 0 || txtApellidoPAutor.getText().trim().equals("")) {

                JOptionPane.showMessageDialog(null, "No se ingresó el Apellido Paterno", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtApellidoMAutor.getText().trim().length() == 0 || txtApellidoMAutor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó el Apellido Materno", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha ingresado correctamente a la BD, ya está ese nombre en uso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void eliminar() {

        int filaseleccionada;
        filaseleccionada = tablaAutor.getSelectedRow();
        if (filaseleccionada >= 0) {
            try {
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar este Registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (seleccionar == 0) {
                    String sql = "DELETE FROM Autor WHERE RUT = ?";
                    String valor = tablaAutor.getValueAt(filaseleccionada, 0).toString();
                    ps = con.prepareStatement(sql);
                    ps.setString(1, valor);
                    int res = ps.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Se ha Eliminado Correctamente el registro", "Mensaje de Eliminación", JOptionPane.INFORMATION_MESSAGE);
                        listar();
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el registro, el autor pertenece a un libro", "Ventana", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para eliminar", "Ventana", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String sql = "SELECT * FROM Autor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            modelo.addColumn("RUT");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido Paterno");
            modelo.addColumn("Apellido Materno");
            while (rs.next()) {
                Object[] filas = new Object[cantColumnas];
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            tablaAutor.setModel(modelo);
        } catch (SQLException ex) {

        }
    }

    @Override
    public void buscarPor() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String datoCombo = (String) comboAutor.getSelectedItem();
            String buscar = txtBusqueda.getText().trim();
            if (buscar.equals("")) {
                listar();
            } else {
                String sql = "SELECT * FROM Autor WHERE UPPER(" + datoCombo + ")  like UPPER('%" + buscar + "%') ";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantColumnas = rsmd.getColumnCount();
                modelo.addColumn("RUT");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido Paterno");
                modelo.addColumn("Apellido Materno");
                while (rs.next()) {
                    Object[] filas = new Object[cantColumnas];
                    for (int i = 0; i < cantColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
                tablaAutor.setModel(modelo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
