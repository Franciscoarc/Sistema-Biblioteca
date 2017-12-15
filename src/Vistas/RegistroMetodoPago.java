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
public class RegistroMetodoPago extends javax.swing.JFrame implements CRUD {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    String modificar;

    public RegistroMetodoPago() {
        initComponents();
        limpiar();
        listar();
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
        jLabel1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMetodoPago = new javax.swing.JTable();
        lblBusqueda = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtMetodoPago = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAutor = new javax.swing.JMenu();
        RegistrarAutor = new javax.swing.JMenuItem();
        MenuCategoria = new javax.swing.JMenu();
        RegistrarCategoria = new javax.swing.JMenuItem();
        MenuDireccion = new javax.swing.JMenu();
        RegistrarDireccion = new javax.swing.JMenuItem();
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
        MenuTelefono = new javax.swing.JMenu();
        RegistrarTelefono = new javax.swing.JMenuItem();
        MenuTrabajador = new javax.swing.JMenu();
        RegistrarTrabajador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        Titulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Registrar Método de Pago");
        jPanel1.add(Titulo);
        Titulo.setBounds(240, 20, 400, 30);

        lblCategoria.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("Método de Pago");
        jPanel1.add(lblCategoria);
        lblCategoria.setBounds(250, 90, 120, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 140, 800, 10);

        btnLimpiar.setText("Limpiar Campo");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(60, 190, 140, 30);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(240, 190, 150, 30);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(420, 190, 140, 30);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(590, 190, 150, 30);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 260, 800, 10);

        tablaMetodoPago = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaMetodoPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMetodoPago.setCellSelectionEnabled(true);
        tablaMetodoPago.getTableHeader().setReorderingAllowed(false);
        tablaMetodoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMetodoPagoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMetodoPago);
        tablaMetodoPago.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 320, 640, 150);

        lblBusqueda.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        lblBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusqueda.setText("Buscar Por");
        jPanel1.add(lblBusqueda);
        lblBusqueda.setBounds(360, 280, 80, 20);
        jPanel1.add(txtBusqueda);
        txtBusqueda.setBounds(450, 280, 140, 20);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(610, 280, 100, 23);

        try {
            txtMetodoPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("????????????????????????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtMetodoPago.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMetodoPago.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jPanel1.add(txtMetodoPago);
        txtMetodoPago.setBounds(370, 90, 150, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

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

        MenuDireccion.setText("Direccion");

        RegistrarDireccion.setText("Registrar");
        RegistrarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarDireccionActionPerformed(evt);
            }
        });
        MenuDireccion.add(RegistrarDireccion);

        jMenuBar1.add(MenuDireccion);

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

        MenuEstados.setText("Estados");

        RegistrarEstadoLibro.setText("Registrar");
        RegistrarEstadoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEstadoLibroActionPerformed(evt);
            }
        });
        MenuEstados.add(RegistrarEstadoLibro);

        jMenuBar1.add(MenuEstados);

        MenuTelefono.setText("Telefono");

        RegistrarTelefono.setText("Registrar");
        RegistrarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarTelefonoActionPerformed(evt);
            }
        });
        MenuTelefono.add(RegistrarTelefono);

        jMenuBar1.add(MenuTelefono);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tablaMetodoPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMetodoPagoMouseClicked
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = tablaMetodoPago.getSelectedRow();
            String metodo = tablaMetodoPago.getValueAt(filaSeleccionada, 0).toString().trim();
            modificar = tablaMetodoPago.getValueAt(filaSeleccionada, 0).toString();
            txtMetodoPago.setText(metodo);
        }
    }//GEN-LAST:event_tablaMetodoPagoMouseClicked

    private void RegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAutorActionPerformed
        RegistroLibro registroAutor = new RegistroLibro();
        registroAutor.setVisible(true);
        registroAutor.setResizable(false);
    }//GEN-LAST:event_RegistrarAutorActionPerformed

    private void RegistrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarCategoriaActionPerformed
        RegistroCategoria registroCategoria = new RegistroCategoria();
        registroCategoria.setVisible(true);
        registroCategoria.setResizable(false);
    }//GEN-LAST:event_RegistrarCategoriaActionPerformed

    private void RegistrarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarDireccionActionPerformed
        RegistroDireccion registroDireccion = new RegistroDireccion();
        registroDireccion.setVisible(true);
        registroDireccion.setResizable(false);
    }//GEN-LAST:event_RegistrarDireccionActionPerformed

    private void RegistrarDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarDistribuidorActionPerformed
        RegistroDistribuidor registroDistribuidor = new RegistroDistribuidor();
        registroDistribuidor.setVisible(true);
        registroDistribuidor.setResizable(false);
    }//GEN-LAST:event_RegistrarDistribuidorActionPerformed

    private void RegistrarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEditorialActionPerformed
        RegistroEditorial registroEditorial = new RegistroEditorial();
        registroEditorial.setVisible(true);
        registroEditorial.setResizable(false);
    }//GEN-LAST:event_RegistrarEditorialActionPerformed

    private void RegistrarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarIdiomaActionPerformed
        RegistroIdioma registroIdioma = new RegistroIdioma();
        registroIdioma.setVisible(true);
        registroIdioma.setResizable(false);
    }//GEN-LAST:event_RegistrarIdiomaActionPerformed

    private void RegistrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarLibrosActionPerformed
        RegistroLibro registroLibro = new RegistroLibro();
        registroLibro.setVisible(true);
        registroLibro.setResizable(false);
    }//GEN-LAST:event_RegistrarLibrosActionPerformed

    private void RegistrarMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMetodoPagoActionPerformed
        RegistroMetodoPago metodoPago = new RegistroMetodoPago();
        metodoPago.setVisible(true);
        metodoPago.setResizable(false);
    }//GEN-LAST:event_RegistrarMetodoPagoActionPerformed

    private void RegistrarEstadoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEstadoLibroActionPerformed
        RegistroEstadoLibro registroEstadoLibro = new RegistroEstadoLibro();
        registroEstadoLibro.setVisible(true);
        registroEstadoLibro.setResizable(false);
    }//GEN-LAST:event_RegistrarEstadoLibroActionPerformed

    private void RegistrarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarTelefonoActionPerformed
        RegistroTelefono registroTelefono = new RegistroTelefono();
        registroTelefono.setVisible(true);
        registroTelefono.setResizable(false);
    }//GEN-LAST:event_RegistrarTelefonoActionPerformed

    private void RegistrarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarTrabajadorActionPerformed
        RegistroTrabajador registroTrabajador = new RegistroTrabajador();
        registroTrabajador.setVisible(true);
        registroTrabajador.setResizable(false);
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
            java.util.logging.Logger.getLogger(RegistroMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMetodoPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAutor;
    private javax.swing.JMenu MenuCategoria;
    private javax.swing.JMenu MenuDireccion;
    private javax.swing.JMenu MenuDistribuidor;
    private javax.swing.JMenu MenuEditorial;
    private javax.swing.JMenu MenuEstados;
    private javax.swing.JMenu MenuIdioma;
    private javax.swing.JMenu MenuLibros;
    private javax.swing.JMenu MenuMetodosPago;
    private javax.swing.JMenu MenuTelefono;
    private javax.swing.JMenu MenuTrabajador;
    private javax.swing.JMenuItem RegistrarAutor;
    private javax.swing.JMenuItem RegistrarCategoria;
    private javax.swing.JMenuItem RegistrarDireccion;
    private javax.swing.JMenuItem RegistrarDistribuidor;
    private javax.swing.JMenuItem RegistrarEditorial;
    private javax.swing.JMenuItem RegistrarEstadoLibro;
    private javax.swing.JMenuItem RegistrarIdioma;
    private javax.swing.JMenuItem RegistrarLibros;
    private javax.swing.JMenuItem RegistrarMetodoPago;
    private javax.swing.JMenuItem RegistrarTelefono;
    private javax.swing.JMenuItem RegistrarTrabajador;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JTable tablaMetodoPago;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JFormattedTextField txtMetodoPago;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiar() {
        txtMetodoPago.setText("");
        txtBusqueda.setText("");
    }

    @Override
    public void modificar() {
        try {
            String nombre = txtMetodoPago.getText().trim();
            String sql = "UPDATE PAGO SET METODO='" + nombre + "' WHERE METODO ='" + modificar + "'";
            ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res > 0) {
                limpiar();
                listar();
                JOptionPane.showMessageDialog(null, "Se ha modificar satisfactoriamente su registro", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ya existe el Método de Pago en nuestra Base de datos", "Confirmación", JOptionPane.ERROR_MESSAGE);
        }
    }


    @Override
    public void insertar() {
        try {
            String sql = "INSERT INTO PAGO VALUES(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, txtMetodoPago.getText().trim());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente el valor a la BD", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                listar();
            }

        } catch (SQLException ex) {
            if (txtMetodoPago.getText().trim().length() == 0 || txtMetodoPago.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó Método de Pago", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }  else {
                JOptionPane.showMessageDialog(null, "No se ha ingresado correctamente a la BD, ya está ese Método de Pago", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void eliminar() {

        int filaseleccionada;
        filaseleccionada = tablaMetodoPago.getSelectedRow();
        if (filaseleccionada >= 0) {
            try {
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar este Registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (seleccionar == 0) {
                    String sql = "DELETE FROM PAGO WHERE METODO = ?";
                    String valor = tablaMetodoPago.getValueAt(filaseleccionada, 0).toString();
                    ps = con.prepareStatement(sql);
                    ps.setString(1, valor);
                    int res = ps.executeUpdate();
                    if (res > 0) {
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
        try {
            String sql = "SELECT * FROM PAGO";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            modelo.addColumn("Método de Pago");

            while (rs.next()) {
                Object[] filas = new Object[cantColumnas];
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            tablaMetodoPago.setModel(modelo);
        } catch (SQLException ex) {

        }
    }

    @Override
    public void buscarPor() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String buscar = txtBusqueda.getText().trim();
            if (buscar.equals("")) {
                listar();
            } else {
                String sql = "SELECT * FROM PAGO WHERE UPPER(METODO)  like UPPER('%" + buscar + "%') ";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantColumnas = rsmd.getColumnCount();
                modelo.addColumn("Método de Pago");
                while (rs.next()) {
                    Object[] filas = new Object[cantColumnas];
                    for (int i = 0; i < cantColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
                tablaMetodoPago.setModel(modelo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
