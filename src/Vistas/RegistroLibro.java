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
public class RegistroLibro extends javax.swing.JFrame implements CRUD {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    int modificar;

    public RegistroLibro() {
        initComponents();
        listar();
        limpiar();
        llenarCombo();
        llenarComboEditorial();
        llenarComboIdioma();
        llenarComboCategoria();
        llenarComboEstado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAñoPublicacionLibro = new javax.swing.JLabel();
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
        tablaLibros = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtISBNLibro = new javax.swing.JFormattedTextField();
        comboLibro = new javax.swing.JComboBox<>();
        lblNumeroSerie = new javax.swing.JLabel();
        txtNumeroSerieLibro = new javax.swing.JFormattedTextField();
        lblNumeroPaginas = new javax.swing.JLabel();
        txtNumeroPaginasLibro = new javax.swing.JFormattedTextField();
        lblPrecioReferencia = new javax.swing.JLabel();
        txtPrecioLibro = new javax.swing.JFormattedTextField();
        lblNombreEditorial = new javax.swing.JLabel();
        comboEditorial = new javax.swing.JComboBox<>();
        btnAñadirEditorial = new javax.swing.JButton();
        txtTituloLibro = new javax.swing.JTextField();
        txtAñoLibro = new javax.swing.JFormattedTextField();
        lblIdioma = new javax.swing.JLabel();
        comboIdioma = new javax.swing.JComboBox<>();
        btnAñadirEstado = new javax.swing.JButton();
        lblCategoria = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        btnAñadirIdioma = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
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

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Registrar Libro");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 430, 50));

        lblISBN.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblISBN.setForeground(new java.awt.Color(255, 255, 255));
        lblISBN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblISBN.setText("ISBN");
        PanelPrincipal.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 90, 20));

        lblTitulo.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Título");
        PanelPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 110, 20));

        lblAñoPublicacionLibro.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblAñoPublicacionLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblAñoPublicacionLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAñoPublicacionLibro.setText("Año de Publicación");
        PanelPrincipal.add(lblAñoPublicacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 120, 20));
        PanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 800, 10));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));
        PanelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));
        PanelPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));
        PanelPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 800, 10));

        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar por");
        PanelPrincipal.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 70, 20));
        PanelPrincipal.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 130, -1));

        tablaLibros = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibros.setAutoCreateRowSorter(true);
        tablaLibros.setBackground(new java.awt.Color(0, 204, 255));
        tablaLibros.setForeground(new java.awt.Color(255, 255, 255));
        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaLibros.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaLibros.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablaLibros.getTableHeader().setReorderingAllowed(false);
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaLibros);
        tablaLibros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        PanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 630, 130));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        try {
            txtISBNLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtISBNLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtISBNLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 150, -1));

        comboLibro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboLibro.setAutoscrolls(true);
        PanelPrincipal.add(comboLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 120, -1));

        lblNumeroSerie.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNumeroSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroSerie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroSerie.setText("Número de Serie");
        PanelPrincipal.add(lblNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 110, 20));

        try {
            txtNumeroSerieLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumeroSerieLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtNumeroSerieLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, -1));

        lblNumeroPaginas.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblNumeroPaginas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroPaginas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroPaginas.setText("Número de Páginas");
        PanelPrincipal.add(lblNumeroPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 20));

        try {
            txtNumeroPaginasLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumeroPaginasLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtNumeroPaginasLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, -1));

        lblPrecioReferencia.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblPrecioReferencia.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioReferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioReferencia.setText("Precio de Referencia");
        PanelPrincipal.add(lblPrecioReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 150, 20));

        try {
            txtPrecioLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPrecioLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtPrecioLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 150, -1));

        lblNombreEditorial.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblNombreEditorial.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEditorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreEditorial.setText("Nombre Editorial");
        PanelPrincipal.add(lblNombreEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 160, 90, -1));

        PanelPrincipal.add(comboEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 150, -1));

        btnAñadirEditorial.setText("Añadir");
        PanelPrincipal.add(btnAñadirEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 70, -1));
        PanelPrincipal.add(txtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, -1));

        try {
            txtAñoLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAñoLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtAñoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 150, -1));

        lblIdioma.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(255, 255, 255));
        lblIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdioma.setText("Idioma");
        PanelPrincipal.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 60, 20));

        PanelPrincipal.add(comboIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 130, -1));

        btnAñadirEstado.setText("Añadir");
        PanelPrincipal.add(btnAñadirEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 70, -1));

        lblCategoria.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("Categoria");
        PanelPrincipal.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 80, -1));

        PanelPrincipal.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 150, -1));

        jButton1.setText("Añadir");
        PanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 70, -1));

        lblEstado.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Estado");
        PanelPrincipal.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 60, -1));

        PanelPrincipal.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 130, -1));

        btnAñadirIdioma.setText("Añadir");
        PanelPrincipal.add(btnAñadirIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 70, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = tablaLibros.getSelectedRow();
            modificar = Integer.parseInt(tablaLibros.getValueAt(filaSeleccionada, 0).toString());
            String numeroSerie = tablaLibros.getValueAt(filaSeleccionada, 0).toString();
            String ISBN = tablaLibros.getValueAt(filaSeleccionada, 1).toString();
            String titulo = tablaLibros.getValueAt(filaSeleccionada, 2).toString();
            String año = tablaLibros.getValueAt(filaSeleccionada, 3).toString();
            String numeroPaginas = tablaLibros.getValueAt(filaSeleccionada, 4).toString();
            String precio = tablaLibros.getValueAt(filaSeleccionada, 5).toString();
            
            String editorial = tablaLibros.getValueAt(filaSeleccionada, 6).toString();
            String idioma = tablaLibros.getValueAt(filaSeleccionada, 7).toString();
            String categoria = tablaLibros.getValueAt(filaSeleccionada, 8).toString();
            String estado = tablaLibros.getValueAt(filaSeleccionada, 9).toString();
           

            txtNumeroSerieLibro.setText(numeroSerie);
            txtISBNLibro.setText(ISBN);
            txtTituloLibro.setText(titulo);
            txtAñoLibro.setText(año);
            txtNumeroPaginasLibro.setText(numeroPaginas);
            txtPrecioLibro.setText(precio);
           
            comboEditorial.setSelectedItem(editorial);
            comboIdioma.setSelectedItem(idioma);
            comboCategoria.setSelectedItem(categoria);
            comboEstado.setSelectedItem(estado);
            txtBusqueda.setText("");

        }
    }//GEN-LAST:event_tablaLibrosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPor();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void RegistrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarLibrosActionPerformed
        RegistroLibro registroLibro = new RegistroLibro();
        registroLibro.setVisible(true);
        registroLibro.setResizable(false);
    }//GEN-LAST:event_RegistrarLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
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
    private javax.swing.JPanel PanelPrincipal;
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
    private javax.swing.JButton btnAñadirEditorial;
    private javax.swing.JButton btnAñadirEstado;
    private javax.swing.JButton btnAñadirIdioma;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEditorial;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboIdioma;
    private javax.swing.JComboBox<String> comboLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAñoPublicacionLibro;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblNombreEditorial;
    private javax.swing.JLabel lblNumeroPaginas;
    private javax.swing.JLabel lblNumeroSerie;
    private javax.swing.JLabel lblPrecioReferencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JFormattedTextField txtAñoLibro;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JFormattedTextField txtISBNLibro;
    private javax.swing.JFormattedTextField txtNumeroPaginasLibro;
    private javax.swing.JFormattedTextField txtNumeroSerieLibro;
    private javax.swing.JFormattedTextField txtPrecioLibro;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiar() {
        txtNumeroSerieLibro.setText("");
        txtISBNLibro.setText("");
        txtTituloLibro.setText("");
        txtAñoLibro.setText("");
        txtNumeroPaginasLibro.setText("");
        txtPrecioLibro.setText("");
        comboEditorial.setSelectedItem(0);
        comboIdioma.setSelectedItem(0);
        comboCategoria.setSelectedItem(0);
        comboEstado.setSelectedItem(0);
        txtBusqueda.setText("");
    }

    @Override
    public void modificar() {
        try {
            int numeroSerie = Integer.parseInt(txtNumeroSerieLibro.getText().trim());
            String ISBN = txtISBNLibro.getText().trim();
            String titulo = txtTituloLibro.getText().trim();
            int año = Integer.parseInt(txtAñoLibro.getText().trim());
            int numeroPaginas = Integer.parseInt(txtNumeroPaginasLibro.getText().trim());
            int precio = Integer.parseInt(txtPrecioLibro.getText().trim());
            String editorial = comboEditorial.getSelectedItem().toString();
            String idioma = comboIdioma.getSelectedItem().toString();
            String categoria = comboCategoria.getSelectedItem().toString();
            String estado = comboEstado.getSelectedItem().toString();
            String sql = "UPDATE LIBRO SET NUMERO_DE_SERIE = " + numeroSerie + ", ISBN = " + ISBN + ", TITULO = '" + titulo + "', AÑO_PUBLICACIÓN = " + año + ", NUMERO_DE_PÁGINAS = " + numeroPaginas + ",PRECIO_REFERENCIA =" + precio + ",EDITORIAL_NOMBRE = '" + editorial + "', IDIOMA_IDIOMA = '" + idioma + "',CATEGORIA_TIPO = '" + categoria + "', REGISTRO_ESTADO = '" + estado + "' WHERE NUMERO_DE_SERIE =" + modificar + "";
            ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res > 0) {
                limpiar();
                listar();
                JOptionPane.showMessageDialog(null, "Se ha modificar satisfactoriamente su registro", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ya existe el nombre en nuestra Base de datos", "Confirmación", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void llenarCombo() {
        try {
            String sql = "SELECT * FROM Libro";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantColumnas; i++) {
                comboLibro.addItem(rsmd.getColumnName(i).replace('_', ' '));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void llenarComboEditorial() {
        try {
            String sql = "SELECT * FROM Editorial";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                comboEditorial.addItem(rs.getString("NOMBRE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void llenarComboIdioma() {
        try {
            String sql = "SELECT * FROM Idioma";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                comboIdioma.addItem(rs.getString("IDIOMA"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void llenarComboCategoria() {
        try {
            String sql = "SELECT * FROM Categoria";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                comboCategoria.addItem(rs.getString("TIPO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void llenarComboEstado() {
        try {
            String sql = "SELECT * FROM Registro";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                comboEstado.addItem(rs.getString("ESTADO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertar() {
        try {
            String sql = "INSERT INTO Libro VALUES(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            int numeroSerie = Integer.parseInt(txtNumeroSerieLibro.getText().trim());
            String ISBN = txtISBNLibro.getText().trim();
            String titulo = txtTituloLibro.getText().trim();
            int año = Integer.parseInt(txtAñoLibro.getText().trim());
            int numeroPaginas = Integer.parseInt(txtNumeroPaginasLibro.getText().trim());
            int precio = Integer.parseInt(txtPrecioLibro.getText().trim());
            String editorial = comboEditorial.getSelectedItem().toString();
            String idioma = comboIdioma.getSelectedItem().toString();
            String categoria = comboCategoria.getSelectedItem().toString();
            String estado = comboEstado.getSelectedItem().toString();
            
            ps.setInt(1, numeroSerie);
            ps.setString(2, ISBN);
            ps.setString(3, titulo);
            ps.setInt(4, año);
            ps.setInt(5, numeroPaginas);
            ps.setInt(6, precio);
            ps.setString(7, editorial);
            ps.setString(8, idioma);
            ps.setString(9, categoria);
            ps.setString(10, estado);
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente el valor a la BD", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                listar();
            }

        } catch (SQLException ex) {
            if (txtNumeroSerieLibro.getText().trim().length() == 0 || txtNumeroSerieLibro.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "No se ingresó Numero de Serie", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void eliminar() {

        int filaseleccionada;
        filaseleccionada = tablaLibros.getSelectedRow();
        if (filaseleccionada >= 0) {
            try {
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar este Registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (seleccionar == 0) {
                    String sql = "DELETE FROM Libro WHERE NUMERO_DE_SERIE = ?";
                    String valor = tablaLibros.getValueAt(filaseleccionada, 0).toString();
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
            String sql = "SELECT * FROM Libro";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            modelo.addColumn("Número de Serie");
            modelo.addColumn("ISBN");
            modelo.addColumn("Título");
            modelo.addColumn("Año de Publicación");
            modelo.addColumn("Número Páginas");
            modelo.addColumn("Precio");
            modelo.addColumn("Nombre Editorial");
            modelo.addColumn("Idioma");
            modelo.addColumn("Categoria");
            modelo.addColumn("Estado");

            while (rs.next()) {
                Object[] filas = new Object[cantColumnas];
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            tablaLibros.setModel(modelo);
        } catch (SQLException ex) {

        }
    }

    @Override
    public void buscarPor() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String datoCombo = (String) comboLibro.getSelectedItem();
            String buscar = txtBusqueda.getText().trim();
            if (buscar.equals("")) {
                listar();
            } else {
                String sql = "SELECT * FROM Libro WHERE UPPER(" + datoCombo + ")  like UPPER('%" + buscar + "%') ";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantColumnas = rsmd.getColumnCount();
                modelo.addColumn("Número de Serie");
                modelo.addColumn("ISBN");
                modelo.addColumn("Título");
                modelo.addColumn("Año de Publicación");
                modelo.addColumn("Número Páginas");
                modelo.addColumn("Precio");
                modelo.addColumn("Nombre Editorial");
                modelo.addColumn("Idioma");
                modelo.addColumn("Categoria");
                modelo.addColumn("Estado");
                while (rs.next()) {
                    Object[] filas = new Object[cantColumnas];
                    for (int i = 0; i < cantColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
                tablaLibros.setModel(modelo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
