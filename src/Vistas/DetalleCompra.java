/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author panch
 */
public class DetalleCompra extends javax.swing.JFrame {

    public static final double IVA = 0.19;
    public static final String VALORIVA = "19%";
    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modeloLibros = new DefaultTableModel();
    ComprarLibros comprarLibros = new ComprarLibros();
    int precioNeto;
    int precioTotal;
    int iva;

    public DetalleCompra() {
        initComponents();
        llenarComboDistribuidor();
        llenarComboPago();
        String sql = "123";

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVolverSeleccion = new javax.swing.JButton();
        btnCrearFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        lblMetodoPago = new javax.swing.JLabel();
        comboPago = new javax.swing.JComboBox<>();
        lblDistribuidor = new javax.swing.JLabel();
        comboDistribuidor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblPrecioNeto = new javax.swing.JLabel();
        txtPrecioNeto = new javax.swing.JTextField();
        txtPrecioConIVA = new javax.swing.JTextField();
        lblPrecioConIVA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCostodelIVA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaCompra = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detalle Compra");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 10, 270, 40);

        btnVolverSeleccion.setText("Volver a Comprar Libros");
        btnVolverSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverSeleccion);
        btnVolverSeleccion.setBounds(30, 440, 160, 40);

        btnCrearFactura.setText("Crear Factura");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearFactura);
        btnCrearFactura.setBounds(600, 440, 170, 40);

        tablaLibros = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLibros.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tablaLibros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLibros);
        tablaLibros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 740, 130);

        lblMetodoPago.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMetodoPago.setForeground(new java.awt.Color(255, 255, 255));
        lblMetodoPago.setText("Método de Pago");
        jPanel1.add(lblMetodoPago);
        lblMetodoPago.setBounds(440, 80, 100, 20);

        comboPago.setToolTipText("Seleccione su método de Pago");
        jPanel1.add(comboPago);
        comboPago.setBounds(550, 80, 150, 20);

        lblDistribuidor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDistribuidor.setForeground(new java.awt.Color(255, 255, 255));
        lblDistribuidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDistribuidor.setText("Distribuidor");
        jPanel1.add(lblDistribuidor);
        lblDistribuidor.setBounds(60, 80, 80, 20);

        jPanel1.add(comboDistribuidor);
        comboDistribuidor.setBounds(140, 80, 150, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Detalle Libros");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 110, 110, 30);

        lblPrecioNeto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPrecioNeto.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioNeto.setText("Precio Neto");
        jPanel1.add(lblPrecioNeto);
        lblPrecioNeto.setBounds(80, 300, 80, 20);

        txtPrecioNeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNeto.setEnabled(false);
        jPanel1.add(txtPrecioNeto);
        txtPrecioNeto.setBounds(180, 300, 110, 20);

        txtPrecioConIVA.setEnabled(false);
        jPanel1.add(txtPrecioConIVA);
        txtPrecioConIVA.setBounds(180, 380, 110, 20);

        lblPrecioConIVA.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPrecioConIVA.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioConIVA.setText("Precio Con IVA");
        jPanel1.add(lblPrecioConIVA);
        lblPrecioConIVA.setBounds(80, 380, 100, 20);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Costo del IVA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 340, 90, 14);

        txtCostodelIVA.setEnabled(false);
        jPanel1.add(txtCostodelIVA);
        txtCostodelIVA.setBounds(180, 340, 110, 20);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 310, 50, 20);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hora");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 350, 40, 17);

        txtFechaCompra.setEnabled(false);
        jPanel1.add(txtFechaCompra);
        txtFechaCompra.setBounds(610, 310, 140, 20);

        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(610, 350, 140, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        CrearFactura crearFactura = new CrearFactura();
        crearFactura.setVisible(true);
        crearFactura.setResizable(false);
    }//GEN-LAST:event_btnCrearFacturaActionPerformed

    private void btnVolverSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSeleccionActionPerformed

        comprarLibros.modelo = (DefaultTableModel) tablaLibros.getModel();
        comprarLibros.tablaLibrosSeleccionados.setModel(comprarLibros.modelo);
        comprarLibros.setVisible(true);
        comprarLibros.setResizable(false);
        this.dispose();

    }//GEN-LAST:event_btnVolverSeleccionActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAutor;
    private javax.swing.JMenu MenuCategoria;
    private javax.swing.JMenu MenuDistribuidor;
    private javax.swing.JMenu MenuEditorial;
    private javax.swing.JMenu MenuEstados;
    private javax.swing.JMenu MenuIdioma;
    private javax.swing.JMenu MenuLibros;
    private javax.swing.JMenu MenuMetodosPago;
    private javax.swing.JMenu MenuTrabajador;
    private javax.swing.JMenuItem RegistrarAutor;
    private javax.swing.JMenuItem RegistrarCategoria;
    private javax.swing.JMenuItem RegistrarDistribuidor;
    private javax.swing.JMenuItem RegistrarEditorial;
    private javax.swing.JMenuItem RegistrarEstadoLibro;
    private javax.swing.JMenuItem RegistrarIdioma;
    private javax.swing.JMenuItem RegistrarLibros;
    private javax.swing.JMenuItem RegistrarMetodoPago;
    private javax.swing.JMenuItem RegistrarTrabajador;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnVolverSeleccion;
    public static javax.swing.JComboBox<String> comboDistribuidor;
    private javax.swing.JComboBox<String> comboPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDistribuidor;
    private javax.swing.JLabel lblMetodoPago;
    private javax.swing.JLabel lblPrecioConIVA;
    private javax.swing.JLabel lblPrecioNeto;
    public static javax.swing.JTable tablaLibros;
    private javax.swing.JTextField txtCostodelIVA;
    private javax.swing.JTextField txtFechaCompra;
    private javax.swing.JTextField txtPrecioConIVA;
    private javax.swing.JTextField txtPrecioNeto;
    // End of variables declaration//GEN-END:variables

    public void llenarComboDistribuidor() {
        try {
            String sql = "SELECT * FROM Distribuidor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboDistribuidor.addItem(rs.getString("NOMBRE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarComboPago() {
        try {
            String sql = "SELECT * FROM Pago";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboPago.addItem(rs.getString("METODO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
