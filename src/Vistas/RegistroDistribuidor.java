/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ConexionBD.Conexion;
import DAO.CRUD;
import java.awt.event.KeyEvent;
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
public class RegistroDistribuidor extends javax.swing.JFrame implements CRUD {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    String modificar;

    public RegistroDistribuidor() {
        initComponents();
        limpiar();
        listar();
        llenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelPrincipal = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblNombreDistribuidor = new javax.swing.JLabel();
        lblTeléfonoDistribuidor = new javax.swing.JLabel();
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
        tablaDistribuidor = new javax.swing.JTable();
        lblDireccionDistribuidor = new javax.swing.JLabel();
        txtDireccionDistribuidor = new javax.swing.JTextField();
        txtRutDistribuidor = new javax.swing.JFormattedTextField();
        txtTelefonoDistribuidor = new javax.swing.JFormattedTextField();
        comboDistribuidor = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtNombreDistribuidor = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Registrar Distribuidor");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 430, 50));

        lblRut.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblRut.setForeground(new java.awt.Color(255, 255, 255));
        lblRut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRut.setText("RUT");
        PanelPrincipal.add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, 20));

        lblNombreDistribuidor.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblNombreDistribuidor.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDistribuidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreDistribuidor.setText("Nombre");
        PanelPrincipal.add(lblNombreDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 110, 20));

        lblTeléfonoDistribuidor.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblTeléfonoDistribuidor.setForeground(new java.awt.Color(255, 255, 255));
        lblTeléfonoDistribuidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeléfonoDistribuidor.setText("Número Telefónico");
        PanelPrincipal.add(lblTeléfonoDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 20));
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
        PanelPrincipal.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 80, 20));
        PanelPrincipal.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 130, -1));

        tablaDistribuidor = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaDistribuidor.setAutoCreateRowSorter(true);
        tablaDistribuidor.setBackground(new java.awt.Color(0, 204, 255));
        tablaDistribuidor.setForeground(new java.awt.Color(255, 255, 255));
        tablaDistribuidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tablaDistribuidor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaDistribuidor.setGridColor(new java.awt.Color(255, 0, 0));
        tablaDistribuidor.setSelectionBackground(new java.awt.Color(153, 255, 0));
        tablaDistribuidor.getTableHeader().setReorderingAllowed(false);
        tablaDistribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDistribuidorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDistribuidor);
        tablaDistribuidor.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        PanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 630, 150));

        lblDireccionDistribuidor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDireccionDistribuidor.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccionDistribuidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDireccionDistribuidor.setText("Calle");
        PanelPrincipal.add(lblDireccionDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 120, 90, -1));
        PanelPrincipal.add(txtDireccionDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 160, -1));

        try {
            txtRutDistribuidor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRutDistribuidor.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtRutDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        try {
            txtTelefonoDistribuidor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoDistribuidor.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtTelefonoDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, -1));

        PanelPrincipal.add(comboDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 120, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 100, -1));

        txtNombreDistribuidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDistribuidorKeyTyped(evt);
            }
        });
        PanelPrincipal.add(txtNombreDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 160, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        PanelPrincipal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        insertar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPor();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaDistribuidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDistribuidorMouseClicked
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = tablaDistribuidor.getSelectedRow();
            String RUT = tablaDistribuidor.getValueAt(filaSeleccionada, 0).toString().trim();
            modificar = tablaDistribuidor.getValueAt(filaSeleccionada, 0).toString().trim();
            String nombre = tablaDistribuidor.getValueAt(filaSeleccionada, 1).toString().trim();
            String telefono = tablaDistribuidor.getValueAt(filaSeleccionada, 2).toString().trim();
            String direccion = tablaDistribuidor.getValueAt(filaSeleccionada, 3).toString().trim();
            txtRutDistribuidor.setText(RUT);
            txtNombreDistribuidor.setText(nombre);
            txtTelefonoDistribuidor.setText(telefono);
            txtDireccionDistribuidor.setText(direccion);
        }
    }//GEN-LAST:event_tablaDistribuidorMouseClicked

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

    private void txtNombreDistribuidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDistribuidorKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_txtNombreDistribuidorKeyTyped

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
            java.util.logging.Logger.getLogger(RegistroDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDistribuidor().setVisible(true);
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
    private javax.swing.JComboBox<String> comboDistribuidor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDireccionDistribuidor;
    private javax.swing.JLabel lblNombreDistribuidor;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTeléfonoDistribuidor;
    private javax.swing.JTable tablaDistribuidor;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDireccionDistribuidor;
    private javax.swing.JTextField txtNombreDistribuidor;
    private javax.swing.JFormattedTextField txtRutDistribuidor;
    private javax.swing.JFormattedTextField txtTelefonoDistribuidor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiar() {
        txtRutDistribuidor.setText("");
        txtNombreDistribuidor.setText("");
        txtTelefonoDistribuidor.setText("");
        txtDireccionDistribuidor.setText("");
        txtBusqueda.setText("");
    }

    @Override
    public void modificar() {
        try {
            String RUT = txtRutDistribuidor.getText().trim();
            String nombre = txtNombreDistribuidor.getText().trim();
            String telefono = txtTelefonoDistribuidor.getText().trim();
            String calle = txtDireccionDistribuidor.getText().trim();
            String sql = "UPDATE Distribuidor SET RUT= '" + RUT + "', NOMBRE = '" + nombre + "' , TELEFONO = '" + telefono + "', CALLE = '" + calle + "' WHERE RUT ='" + modificar + "'";
            ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res > 0) {
                limpiar();
                listar();
                JOptionPane.showMessageDialog(null, "Se ha modificar satisfactoriamente su registro", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ya existe el RUT en nuestra Base de datos", "Confirmación", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void insertar() {
        try {
            String sqlDistri = "INSERT INTO Distribuidor VALUES(?,?,?,?)";
            ps = con.prepareStatement(sqlDistri);
            int rut = txtRutDistribuidor.getText().trim().length();
            ps.setString(1, txtRutDistribuidor.getText().trim());
            ps.setString(2, txtNombreDistribuidor.getText().trim());
            ps.setString(3, txtTelefonoDistribuidor.getText().trim());
            ps.setString(4, txtDireccionDistribuidor.getText().trim());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente el valor a la BD", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                listar();
            }

        } catch (SQLException ex) {
            if (txtRutDistribuidor.getText().trim().equals(".   .   -")) {
                JOptionPane.showMessageDialog(null, "No se ingresó RUT", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtRutDistribuidor.getText().trim().length() <11 ) {
                JOptionPane.showMessageDialog(null, "Su Rut está mal formado", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtNombreDistribuidor.getText().trim().length() == 0 || txtNombreDistribuidor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó Nombre", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtTelefonoDistribuidor.getText().trim().length() == 0 || txtTelefonoDistribuidor.getText().trim().equals("")) {

                JOptionPane.showMessageDialog(null, "No se ingresó un Número Telefónico ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtDireccionDistribuidor.getText().trim().length() == 0 || txtDireccionDistribuidor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó el no se ingresó una dirección", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Este Rut ya está en nuestra Base de datos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void eliminar() {
        int filaseleccionada;
        filaseleccionada = tablaDistribuidor.getSelectedRow();
        if (filaseleccionada >= 0) {
            try {
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar este Registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (seleccionar == 0) {
                    String sql = "DELETE FROM Distribuidor WHERE RUT = ?";
                    String valor = tablaDistribuidor.getValueAt(filaseleccionada, 0).toString();
                    ps = con.prepareStatement(sql);
                    ps.setString(1, valor);
                    int res = ps.executeUpdate();
                    if (res > 0) {
                        limpiar();
                        JOptionPane.showMessageDialog(null, "Se ha Eliminado Correctamente el registro", "Mensaje de Eliminación", JOptionPane.INFORMATION_MESSAGE);
                        listar();
                    }
                }
            } catch (SQLException ex) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para eliminar", "Ventana", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        tablaDistribuidor.setModel(modelo);
        try {
            String sql = "SELECT * FROM Distribuidor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            modelo.addColumn("RUT");
            modelo.addColumn("Nombre");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Calle");
            while (rs.next()) {
                Object[] filas = new Object[cantColumnas];
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            tablaDistribuidor.setModel(modelo);
        } catch (SQLException ex) {

        }
    }

    public void llenarCombo() {
        try {
            String sql = "SELECT * FROM Distribuidor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantColumnas; i++) {
                comboDistribuidor.addItem(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void buscarPor() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String datoCombo = (String) comboDistribuidor.getSelectedItem();
            String buscar = txtBusqueda.getText().trim();
            if (buscar.equals("")) {
                listar();
            } else {
                String sql = "SELECT * FROM Distribuidor WHERE  UPPER(" + datoCombo + ")  like UPPER('%" + buscar + "%') ";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantColumnas = rsmd.getColumnCount();
                modelo.addColumn("RUT");
                modelo.addColumn("Nombre");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Calle");
                while (rs.next()) {
                    Object[] filas = new Object[cantColumnas];
                    for (int i = 0; i < cantColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
                tablaDistribuidor.setModel(modelo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void validarLetras(KeyEvent evt){
        char letraespacio = evt.getKeyChar();
        if(!Character.isLetter(letraespacio) && letraespacio != KeyEvent.VK_SPACE){
            evt.consume();
        }
    }

}
