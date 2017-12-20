package Vistas;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Prestamos extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelolibrosDisponibles = new DefaultTableModel();
    Date fecha = new Date();

    public Prestamos() {
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
        llenarTablaLibrosDisponibles();
        fechaArriendo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusquedaTrabajador = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibrosDisponibles = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLibrosArrendados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        SeleccionarLibro = new javax.swing.JButton();
        EliminarLibro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFechaArriendo = new javax.swing.JTextField();
        fechaEstimadaDevolucion = new com.toedter.calendar.JDateChooser();
        ArrendarLibro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fechaEntrega = new com.toedter.calendar.JDateChooser();
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Prestamos");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 330, 50));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Trabajador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, 20));

        try {
            txtBusquedaTrabajador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBusquedaTrabajador.setText(".   .   -");
        txtBusquedaTrabajador.setToolTipText("");
        txtBusquedaTrabajador.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jPanel1.add(txtBusquedaTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, -1));

        tablaLibrosDisponibles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibrosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaLibrosDisponibles.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLibrosDisponibles);
        tablaLibrosDisponibles.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 820, 120));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Libros Disponibles");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, 14));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Libros Seleccionados");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 20));

        tablaLibrosArrendados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibrosArrendados.setBackground(new java.awt.Color(0, 153, 204));
        tablaLibrosArrendados.setForeground(new java.awt.Color(255, 255, 255));
        tablaLibrosArrendados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLibrosArrendados.setColumnSelectionAllowed(true);
        tablaLibrosArrendados.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaLibrosArrendados);
        tablaLibrosArrendados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 820, 130));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Arriendo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        SeleccionarLibro.setText("Seleccionar");
        SeleccionarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(SeleccionarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 120, -1));

        EliminarLibro.setText("Eliminar");
        EliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 130, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha Estimada Devolución");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 180, 20));

        txtFechaArriendo.setEditable(false);
        jPanel1.add(txtFechaArriendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 80, -1));

        fechaEstimadaDevolucion.setDateFormatString("YYYY-MM-dd");
        jPanel1.add(fechaEstimadaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        ArrendarLibro.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ArrendarLibro.setText("Arrendar");
        ArrendarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrendarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(ArrendarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 170, 40));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fecha de Entrega");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 120, 20));

        fechaEntrega.setDateFormatString("YYYY-MM-dd");
        fechaEntrega.setMaxSelectableDate(new java.util.Date(253370779260000L));
        fechaEntrega.setMinSelectableDate(new java.util.Date(-2208968174000L));
        jPanel1.add(fechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 120, -1));
        fechaEntrega.getAccessibleContext().setAccessibleName("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLibro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void SeleccionarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarLibroActionPerformed
        añadirLibro();
    }//GEN-LAST:event_SeleccionarLibroActionPerformed

    private void EliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarLibroActionPerformed
        eliminarLibro();
    }//GEN-LAST:event_EliminarLibroActionPerformed

    private void ArrendarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrendarLibroActionPerformed
        arrendarLibro();
    }//GEN-LAST:event_ArrendarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArrendarLibro;
    private javax.swing.JButton EliminarLibro;
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
    private javax.swing.JButton SeleccionarLibro;
    private javax.swing.JLabel Titulo;
    private com.toedter.calendar.JDateChooser fechaEntrega;
    private com.toedter.calendar.JDateChooser fechaEstimadaDevolucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaLibrosArrendados;
    private javax.swing.JTable tablaLibrosDisponibles;
    private javax.swing.JFormattedTextField txtBusquedaTrabajador;
    private javax.swing.JTextField txtFechaArriendo;
    // End of variables declaration//GEN-END:variables

    public void llenarTablaLibrosDisponibles() {
        try {
            String sql = "SELECT li.NUMERO_DE_SERIE, li.ISBN, li.TITULO, li.\"AÑO_PUBLICACIÓN\", au.NOMBRE || ' ' || au.APELLIDO_PATERNO || ' ' || au.APELLIDO_MATERNO as \"Nombre Autor\", li.\"NUMERO_DE_PÁGINAS\",li.PRECIO_REFERENCIA,li.EDITORIAL_NOMBRE,li.IDIOMA_IDIOMA,li.CATEGORIA_TIPO\n"
                    + "FROM LIBRO li\n"
                    + "JOIN AUTOR_LIBRO auli\n"
                    + "on auli.LIBRO_NUMERO_DE_SERIE = li.NUMERO_DE_SERIE\n"
                    + "JOIN AUTOR au\n"
                    + "on au.RUT = auli.AUTOR_RUT\n"
                    + "WHERE li.REGISTRO_ESTADO = 'Disponible'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();

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
            int columnas = tablaLibrosDisponibles.getColumnCount();
            int fila = tablaLibrosDisponibles.getRowCount();
            Object[] filas = new Object[columnas];
            for (int i = 0; i < filas.length; i++) {
                filas[i] = tablaLibrosDisponibles.getValueAt(filaSeleccionada, i);
            }
            modelo.addRow(filas);
            tablaLibrosArrendados.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún Libro para añadir a su Compra", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void eliminarLibro() {
        int filaSeleccionada = tablaLibrosArrendados.getSelectedRow();
        if (filaSeleccionada >= 0) {
            modelo.removeRow(filaSeleccionada);
            tablaLibrosArrendados.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void fechaArriendo() {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String fechaArriendo = dateFormat.format(fecha);
        txtFechaArriendo.setText(fechaArriendo);
    }

    public void arrendarLibro() {
        int total;
        try {
            con.setAutoCommit(false);
            String rut = txtBusquedaTrabajador.getText().trim();
            int filas = tablaLibrosArrendados.getRowCount();
            boolean verificar = consultarRut(rut);
            if (filas > 0 && verificar) {
                //Rescatar valores
                String generado = generarCodigo();//Genero Código

                ArrayList ISSN = obtenerISSN();
                //INSERTAR EN ESTE ORDEN: CÓDIGO PRESTAMO, FECHA_ARRIENDO, FECHA_DEVOLUCION,FECHA_ENTREGA;TRABAJADOR_RUT
                String sqlPrestamo = "INSERT INTO PRESTAMO VALUES(?,TO_DATE(?,'YYYY-MM-dd'),TO_DATE(?,'YYYY-MM-dd'),TO_DATE(?,'YYYY-MM-dd'),?)";

                //INSERTAR EN ESTE ORDEN: LIBRO_NUMERO_DE_SERIE , PRESTAMO_CODIGO_PRESTAMO
                String sqlRelacion = "INSERT INTO PRESTAMO_LIBRO VALUES(?,?)";

                String sqlActualizarLibro = "UPDATE LIBRO SET REGISTRO_ESTADO = 'Arrendado'\n"
                        + "WHERE NUMERO_DE_SERIE = ?";

                ps = con.prepareStatement(sqlPrestamo);
                ps.setString(1, generado);
                ps.setDate(2, new java.sql.Date(fecha.getTime()));
                ps.setDate(3, new java.sql.Date(fechaEstimadaDevolucion.getDate().getTime()));
                ps.setDate(4, new java.sql.Date(fechaEntrega.getDate().getTime()));
                ps.setString(5, rut);

                ps.executeUpdate();

                ps = con.prepareStatement(sqlRelacion);
                for (int i = 0; i < filas; i++) {
                    ps.setString(1, (String) ISSN.get(i));
                    ps.setString(2, generado);
                    ps.executeUpdate();
                }

                ps = con.prepareStatement(sqlActualizarLibro);
                for (int i = 0; i < filas; i++) {
                    ps.setString(1, (String) ISSN.get(i));
                    ps.executeUpdate();
                }

                ps.executeUpdate();
                llenarTablaLibrosDisponibles();
                JOptionPane.showMessageDialog(null, "Solicitud COMPLETADA", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                
                con.commit();
            } else if (filas > 0 && !verificar) {
                JOptionPane.showMessageDialog(null, "No se ha podido encontrar el Trabajador con ese RUT o su RUT está mal puesto");
            } else if (filas == 0) {
                JOptionPane.showMessageDialog(null, "No se ha solicitado ningún Libro");

            }

        } catch (NullPointerException | SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex1);
            }

            String rut = txtBusquedaTrabajador.getText().trim();
            int largo = rut.length();
            String verifica = rut.substring(largo - 1);
            String punto = Character.toString(rut.charAt(0));
            if (rut.equals(".   .   -")) {
                JOptionPane.showMessageDialog(null, "No se ha Ingresado RUT", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (largo <= 10 || verifica.equals("-") || punto.equals(".")) {
                JOptionPane.showMessageDialog(null, "No se ha Ingreasdo el Rut Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (fechaEstimadaDevolucion.getDate() == null) {
                JOptionPane.showMessageDialog(null, "No se ha Ingresado la fecha Estimada de su devolución", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (fechaEntrega.getDate() == null) {
                JOptionPane.showMessageDialog(null, "No se ha ingresado la fecha de Entrega de los Libros", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public String generarCodigo() {
        String generado = "P";
        Random aleatorio = new Random();
        int numero;
        for (int i = 0; i < 7; i++) {
            numero = aleatorio.nextInt(8) + 1;
            generado = generado.concat(String.valueOf(numero));
        }
        return generado;
    }

    public ArrayList obtenerISSN() {
        ArrayList ISSN = new ArrayList();
        int filas = tablaLibrosArrendados.getRowCount();
        for (int i = 0; i < filas; i++) {
            ISSN.add(tablaLibrosArrendados.getValueAt(i, 0));
        }
        return ISSN;
    }

    public boolean consultarRut(String rut) {
        boolean valida = false;
        try {
            String sqlRut = "SELECT RUT FROM Trabajador WHERE RUT = '" + rut + "'";
            ps = con.prepareStatement(sqlRut);
            rs = ps.executeQuery();
            if (rs.next()) {
                valida = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valida;
    }

}
