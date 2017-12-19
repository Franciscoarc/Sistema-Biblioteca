package Vistas;

import ConexionBD.Conexion;
import static Vistas.DetalleCompra.tablaLibros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ComprarLibros extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modelo = new DefaultTableModel();
    DetalleCompra crearFactura = new DetalleCompra();

    public ComprarLibros() {

        initComponents();
        modelo.addColumn("N° Serie");
        modelo.addColumn("ISBN");
        modelo.addColumn("Título");
        modelo.addColumn("Año");
        modelo.addColumn("Autores");
        modelo.addColumn("Páginas");
        modelo.addColumn("Precio");
        modelo.addColumn("Editorial");
        modelo.addColumn("Idioma");
        modelo.addColumn("Categoria");
        modelo.addColumn("Estado");
        llenarTablaLibrosDisponibles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibrosDisponibles = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibrosSeleccionados = new javax.swing.JTable();
        lblLibros = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVerFactura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Compra de Libros");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 20, 440, 40);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Catálogo de Libros");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 100, 140, 30);

        tablaLibrosDisponibles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibrosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLibrosDisponibles.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tablaLibrosDisponibles.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablaLibrosDisponibles.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLibrosDisponibles);
        tablaLibrosDisponibles.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 130, 710, 110);

        tablaLibrosSeleccionados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibrosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLibrosSeleccionados.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tablaLibrosSeleccionados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaLibrosSeleccionados);
        tablaLibrosSeleccionados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 310, 710, 130);

        lblLibros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblLibros.setForeground(new java.awt.Color(255, 255, 255));
        lblLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibros.setText("Libros seleccionados");
        jPanel1.add(lblLibros);
        lblLibros.setBounds(40, 290, 150, 17);

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar);
        btnSeleccionar.setBounds(640, 250, 110, 23);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(660, 450, 90, 23);

        btnVerFactura.setText("Ver Detalles");
        btnVerFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerFactura);
        btnVerFactura.setBounds(630, 20, 120, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFacturaActionPerformed
        crearFactura.setVisible(true);
        crearFactura.setResizable(false);

    }//GEN-LAST:event_btnVerFacturaActionPerformed

    private void RegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAutorActionPerformed
        RegistroAutor registroAutor = new RegistroAutor();
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

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        añadirLibro();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminarLibro();
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarLibros().setVisible(true);
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnVerFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JTable tablaLibrosDisponibles;
    public static javax.swing.JTable tablaLibrosSeleccionados;
    // End of variables declaration//GEN-END:variables

    public void llenarTablaLibrosDisponibles() {
        DefaultTableModel modelolibrosDisponibles = new DefaultTableModel();
        try {
            String sql = "SELECT li.NUMERO_DE_SERIE, li.ISBN, li.TITULO, li.\"AÑO_PUBLICACIÓN\", au.NOMBRE ||' ' || au.APELLIDO_PATERNO||' ' || au.APELLIDO_MATERNO AS \"NOMBRE COMPLETO\", li.\"NUMERO_DE_PÁGINAS\",li.PRECIO_REFERENCIA,li.EDITORIAL_NOMBRE,li.IDIOMA_IDIOMA,li.CATEGORIA_TIPO,li.REGISTRO_ESTADO\n"
                    + "from LIBRO li\n"
                    + "JOIN AUTOR_LIBRO auli\n"
                    + "on li.NUMERO_DE_SERIE = auli.LIBRO_NUMERO_DE_SERIE\n"
                    + "JOIN AUTOR au\n"
                    + "on auli.AUTOR_RUT = au.RUT\n"
                    + "WHERE li.REGISTRO_ESTADO =  'Disponible'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            modelolibrosDisponibles.addColumn("N° Serie");
            modelolibrosDisponibles.addColumn("ISBN");
            modelolibrosDisponibles.addColumn("Título");
            modelolibrosDisponibles.addColumn("Año");
            modelolibrosDisponibles.addColumn("Autores");
            modelolibrosDisponibles.addColumn("Páginas");
            modelolibrosDisponibles.addColumn("Precio");
            modelolibrosDisponibles.addColumn("Editorial");
            modelolibrosDisponibles.addColumn("Idioma");
            modelolibrosDisponibles.addColumn("Categoria");
            modelolibrosDisponibles.addColumn("Estado");

            while (rs.next()) {
                Object[] filas = new Object[cantColumnas];
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelolibrosDisponibles.addRow(filas);
            }
            tablaLibrosDisponibles.setModel(modelolibrosDisponibles);
        } catch (SQLException ex) {

        }
    }

    public void añadirLibro() {
        int filaSeleccionada = tablaLibrosDisponibles.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int fila = tablaLibrosDisponibles.getRowCount();
            int columnas = tablaLibrosDisponibles.getColumnCount();
            Object[] filas = new Object[columnas];
            for (int i = 0; i < filas.length; i++) {
                filas[i] = tablaLibrosDisponibles.getValueAt(filaSeleccionada, i);
            }
            modelo.addRow(filas);
            tablaLibros.setModel(modelo);
            tablaLibrosSeleccionados.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para añadir", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarLibro() {
        int filaSeleccionada = tablaLibrosSeleccionados.getSelectedRow();
        if (filaSeleccionada >= 0) {
            modelo.removeRow(filaSeleccionada);
            tablaLibrosSeleccionados.setModel(modelo);
            tablaLibros.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
