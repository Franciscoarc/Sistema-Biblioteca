/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ConexionBD.Conexion;
import DAO.CRUD;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
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
    String modificar;

    public RegistroLibro() {

        initComponents();
        listar();
        limpiar();
        llenarCombo();
        llenarComboEditorial();
        llenarComboIdioma();
        llenarComboCategoria();
        llenarComboEstado();
        llenarListaAutores();
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
        tablaLibrosRegistrados = new javax.swing.JTable();
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
        btnAñadirCategoria = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        btnAñadirIdioma = new javax.swing.JButton();
        lblAutores = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaAutores = new javax.swing.JList<>();
        btnRecargar = new javax.swing.JButton();
        btnAñadirAutor = new javax.swing.JButton();
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
        PanelPrincipal.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 90, 20));

        lblTitulo.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Título");
        PanelPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 20));

        lblAñoPublicacionLibro.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblAñoPublicacionLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblAñoPublicacionLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAñoPublicacionLibro.setText("Año de Publicación");
        PanelPrincipal.add(lblAñoPublicacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 120, 20));
        PanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 890, 10));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, -1, -1));

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));
        PanelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));
        PanelPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));
        PanelPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 900, 10));

        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar por");
        PanelPrincipal.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 70, 20));
        PanelPrincipal.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 130, -1));

        tablaLibrosRegistrados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibrosRegistrados.setAutoCreateRowSorter(true);
        tablaLibrosRegistrados.setBackground(new java.awt.Color(0, 204, 255));
        tablaLibrosRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        tablaLibrosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLibrosRegistrados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaLibrosRegistrados.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaLibrosRegistrados.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablaLibrosRegistrados.getTableHeader().setReorderingAllowed(false);
        tablaLibrosRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosRegistradosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaLibrosRegistrados);
        tablaLibrosRegistrados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        PanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 800, 140));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        try {
            txtISBNLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtISBNLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtISBNLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 160, -1));

        comboLibro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboLibro.setAutoscrolls(true);
        PanelPrincipal.add(comboLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 160, -1));

        lblNumeroSerie.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNumeroSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroSerie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroSerie.setText("Número de Serie");
        PanelPrincipal.add(lblNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, 20));

        try {
            txtNumeroSerieLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumeroSerieLibro.setText("");
        txtNumeroSerieLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtNumeroSerieLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, -1));

        lblNumeroPaginas.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblNumeroPaginas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroPaginas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroPaginas.setText("Número de Páginas");
        PanelPrincipal.add(lblNumeroPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 120, 20));

        try {
            txtNumeroPaginasLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumeroPaginasLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtNumeroPaginasLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 160, -1));

        lblPrecioReferencia.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblPrecioReferencia.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioReferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioReferencia.setText("Precio de Referencia");
        PanelPrincipal.add(lblPrecioReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 150, 20));

        try {
            txtPrecioLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPrecioLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtPrecioLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 160, -1));

        lblNombreEditorial.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblNombreEditorial.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEditorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreEditorial.setText("Nombre Editorial");
        PanelPrincipal.add(lblNombreEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, -1));

        comboEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelPrincipal.add(comboEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, -1));

        btnAñadirEditorial.setText("Añadir");
        btnAñadirEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirEditorialActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAñadirEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, -1));
        PanelPrincipal.add(txtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        try {
            txtAñoLibro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAñoLibro.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        PanelPrincipal.add(txtAñoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 160, -1));

        lblIdioma.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(255, 255, 255));
        lblIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdioma.setText("Idioma");
        PanelPrincipal.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 60, 20));

        PanelPrincipal.add(comboIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 130, -1));

        btnAñadirEstado.setText("Añadir");
        btnAñadirEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirEstadoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAñadirEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 90, -1));

        lblCategoria.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("Categoria");
        PanelPrincipal.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 80, -1));

        PanelPrincipal.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 150, -1));

        btnAñadirCategoria.setText("Añadir");
        btnAñadirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCategoriaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAñadirCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 80, -1));

        lblEstado.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Estado");
        PanelPrincipal.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 60, 20));

        PanelPrincipal.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 130, -1));

        btnAñadirIdioma.setText("Añadir");
        btnAñadirIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirIdiomaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAñadirIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 90, -1));

        lblAutores.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblAutores.setForeground(new java.awt.Color(255, 255, 255));
        lblAutores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutores.setText("Autor(es)");
        PanelPrincipal.add(lblAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, -1));

        listaAutores.setToolTipText("");
        listaAutores.setName(""); // NOI18N
        listaAutores.setSelectedIndex(0);
        jScrollPane3.setViewportView(listaAutores);

        PanelPrincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, 80));

        btnRecargar.setText("Recargar Datos");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 120, -1));

        btnAñadirAutor.setText("Añadir");
        btnAñadirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirAutorActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAñadirAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 90, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLibro.jpg"))); // NOI18N
        PanelPrincipal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaLibrosRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosRegistradosMouseClicked
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = tablaLibrosRegistrados.getSelectedRow();
            modificar = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 0).toString();
            String numeroSerie = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 0).toString();
            String ISBN = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 1).toString();
            String titulo = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 2).toString();
            String año = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 3).toString();
            String autores = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 4).toString();
            String numeroPaginas = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 5).toString();
            String precio = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 6).toString();

            String editorial = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 7).toString();
            String idioma = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 8).toString();
            String categoria = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 9).toString();
            String estado = tablaLibrosRegistrados.getValueAt(filaSeleccionada, 10).toString();

            txtNumeroSerieLibro.setText(numeroSerie);
            txtNumeroSerieLibro.setEnabled(false);
            txtISBNLibro.setText(ISBN);
            txtTituloLibro.setText(titulo);
            txtAñoLibro.setText(año);
            listaAutores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listaAutores.setSelectedValue(autores, true);
            txtNumeroPaginasLibro.setText(numeroPaginas);
            txtPrecioLibro.setText(precio);

            comboEditorial.setSelectedItem(editorial);
            comboIdioma.setSelectedItem(idioma);
            comboCategoria.setSelectedItem(categoria);
            comboEstado.setSelectedItem(estado);
            txtBusqueda.setText("");

        }
    }//GEN-LAST:event_tablaLibrosRegistradosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPor();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        listar();
        llenarCombo();
        llenarComboEditorial();
        llenarComboIdioma();
        llenarComboCategoria();
        llenarComboEstado();
        llenarListaAutores();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnAñadirEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirEditorialActionPerformed
        RegistroEditorial registroEditorial = new RegistroEditorial();
        registroEditorial.setVisible(true);
        registroEditorial.setResizable(false);
    }//GEN-LAST:event_btnAñadirEditorialActionPerformed

    private void btnAñadirIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirIdiomaActionPerformed
        RegistroIdioma registroIdioma = new RegistroIdioma();
        registroIdioma.setVisible(true);
        registroIdioma.setResizable(false);
    }//GEN-LAST:event_btnAñadirIdiomaActionPerformed

    private void btnAñadirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCategoriaActionPerformed
        RegistroCategoria registroCategoria = new RegistroCategoria();
        registroCategoria.setVisible(true);
        registroCategoria.setResizable(false);
    }//GEN-LAST:event_btnAñadirCategoriaActionPerformed

    private void btnAñadirEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirEstadoActionPerformed
        RegistroEstadoLibro registroEstadoLibro = new RegistroEstadoLibro();
        registroEstadoLibro.setVisible(true);
        registroEstadoLibro.setResizable(false);
    }//GEN-LAST:event_btnAñadirEstadoActionPerformed

    private void btnAñadirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirAutorActionPerformed
        RegistroAutor registroAutor = new RegistroAutor();
        registroAutor.setVisible(true);
        registroAutor.setResizable(false);
    }//GEN-LAST:event_btnAñadirAutorActionPerformed

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
    private javax.swing.JButton btnAñadirAutor;
    private javax.swing.JButton btnAñadirCategoria;
    private javax.swing.JButton btnAñadirEditorial;
    private javax.swing.JButton btnAñadirEstado;
    private javax.swing.JButton btnAñadirIdioma;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEditorial;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboIdioma;
    private javax.swing.JComboBox<String> comboLibro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAutores;
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
    private javax.swing.JList<String> listaAutores;
    private javax.swing.JTable tablaLibrosRegistrados;
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
            con.setAutoCommit(false);

            //Extraer DATOS DESDE CAMPOS para Actualizar
            List<String> autores = listaAutores.getSelectedValuesList();
            //Pedir datos para la inserción en ambas tablas
            String numeroSerie = txtNumeroSerieLibro.getText().trim();
            String ISBN = txtISBNLibro.getText().trim();
            String titulo = txtTituloLibro.getText().trim();
            String año = txtAñoLibro.getText().trim();
            //List<String> autores = listaAutores.getSelectedValuesList();
            String numeroPaginas = txtNumeroPaginasLibro.getText().trim();
            String precio = txtPrecioLibro.getText().trim();
            String editorial = comboEditorial.getSelectedItem().toString();
            String idioma = comboIdioma.getSelectedItem().toString();
            String categoria = comboCategoria.getSelectedItem().toString();
            String estado = comboEstado.getSelectedItem().toString();

            //Busqueda de nombres y rut a partir de los autores elegidos
            ArrayList nombres = devuelveNombres(autores);
            String ruts = devuelveRut(nombres);

            //UPDATES PARA CADA LISTA
            String sqlLibro = "UPDATE LIBRO SET ISBN = '" + ISBN + "' , TITULO = '" + titulo + "' ,\n"
                    + "\"AÑO_PUBLICACIÓN\" = " + año + " , \"NUMERO_DE_PÁGINAS\" = " + numeroPaginas + " ,\n"
                    + "PRECIO_REFERENCIA = " + precio + " , EDITORIAL_NOMBRE = '" + editorial + "' ,\n"
                    + "IDIOMA_IDIOMA = '" + idioma + "' , CATEGORIA_TIPO = '" + categoria + "' ,\n"
                    + "REGISTRO_ESTADO  = '" + estado + "'\n"
                    + "WHERE NUMERO_DE_SERIE = '" + modificar + "' ";

            String sqlUnion = "UPDATE AUTOR_LIBRO \n"
                    + "SET AUTOR_RUT = '" + ruts + "'\n"
                    + "WHERE LIBRO_NUMERO_DE_SERIE = '" + modificar + "' ";

            //Inserción en la tabla Libros
            ps = con.prepareStatement(sqlLibro);
            ps.executeUpdate();

            ps = con.prepareStatement(sqlUnion);
            ps.executeUpdate();

            con.commit();
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el valor en la base de datos", "Mensaje de Confirmación", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            listar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getStackTrace(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            String mensaje = "";
            if (txtNumeroSerieLibro.getText().trim().length() == 1 || txtNumeroSerieLibro.getText().trim().equals("-")) {
                mensaje = mensaje.concat("No se ha ingresado ningún Número de Serie \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtISBNLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado ningún ISBN \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtISBNLibro.getText().trim().length() != 13) {
                mensaje = mensaje.concat("No se ha ingresado un ISBN válido \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtTituloLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado ningún Título \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtAñoLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado Año de Publicación \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtNumeroPaginasLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado Número de Páginas \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    con.rollback();
                } catch (SQLException ex1) {
                    mensaje = mensaje.concat("El Número de Serie y/o el Autor ya está en uso \n");
                    JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void llenarCombo() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboLibro.setModel(modelo);
        try {
            String sql = "SELECT * FROM Libro li";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantColumnas; i++) {
                comboLibro.addItem(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarComboEditorial() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboEditorial.setModel(modelo);
        try {
            String sql = "SELECT * FROM Editorial";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboEditorial.addItem(rs.getString("NOMBRE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarComboIdioma() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboIdioma.setModel(modelo);
        try {
            String sql = "SELECT * FROM Idioma";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboIdioma.addItem(rs.getString("IDIOMA"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarComboCategoria() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboCategoria.setModel(modelo);
        try {
            String sql = "SELECT * FROM Categoria";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboCategoria.addItem(rs.getString("TIPO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarComboEstado() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboEstado.setModel(modelo);
        try {
            String sql = "SELECT * FROM Registro";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboEstado.addItem(rs.getString("ESTADO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarListaAutores() {
        DefaultListModel modelolista = new DefaultListModel();

        try {
            String sql = "SELECT * FROM Autor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                modelolista.addElement(rs.getString("NOMBRE").concat(" ").concat(rs.getString("APELLIDO_PATERNO").concat(" ").concat(rs.getString("APELLIDO_MATERNO"))));
            }

            listaAutores.setModel(modelolista);

        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void insertar() {
        try {
            con.setAutoCommit(false);
            //Instrucciones sql para insertar los datos en sus respectivas tablas
            String sqlLibro = "INSERT INTO Libro VALUES(?,?,?,?,?,?,?,?,?,?)";
            String sqlUnion = "INSERT INTO AUTOR_LIBRO VALUES(?,?)";

            List<String> autores = listaAutores.getSelectedValuesList();
            //Pedir datos para la inserción en ambas tablas
            String numeroSerie = txtNumeroSerieLibro.getText().trim();
            String ISBN = txtISBNLibro.getText().trim();
            String titulo = txtTituloLibro.getText().trim();
            String año = txtAñoLibro.getText().trim();
            //List<String> autores = listaAutores.getSelectedValuesList();
            String numeroPaginas = txtNumeroPaginasLibro.getText().trim();
            String precio = txtPrecioLibro.getText().trim();
            String editorial = comboEditorial.getSelectedItem().toString();
            String idioma = comboIdioma.getSelectedItem().toString();
            String categoria = comboCategoria.getSelectedItem().toString();
            String estado = comboEstado.getSelectedItem().toString();

            //Busqueda de nombres y rut a partir de los autores elegidos
            ArrayList nombres = devuelveNombres(autores);
            ArrayList ruts = devuelveRuts(nombres);

            //Inserción en la tabla Libros
            ps = con.prepareStatement(sqlLibro);
            ps.setString(1, numeroSerie);
            ps.setString(2, ISBN);
            ps.setString(3, titulo);
            ps.setString(4, año);
            ps.setString(5, numeroPaginas);
            ps.setString(6, precio);
            ps.setString(7, editorial);
            ps.setString(8, idioma);
            ps.setString(9, categoria);
            ps.setString(10, estado);
            ps.executeUpdate();

            ps = con.prepareStatement(sqlUnion);
            for (int j = 0; j < ruts.size(); j++) {
                String numse = numeroSerie;
                String palabra = (String) ruts.get(j);
                ps.setString(1, palabra);
                ps.setString(2, numse);
                ps.addBatch();
            }
            int res[] = ps.executeBatch();
            con.commit();
            listar();
            JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente el valor a la base de datos", "Mensaje de Confirmación", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            String mensaje = "";
            if (txtNumeroSerieLibro.getText().trim().length() == 1 || txtNumeroSerieLibro.getText().trim().equals("-")) {
                mensaje = mensaje.concat("No se ha ingresado ningún Número de Serie \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtISBNLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado ningún ISBN \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtISBNLibro.getText().trim().length() != 13) {
                mensaje = mensaje.concat("No se ha ingresado un ISBN válido \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtTituloLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado ningún Título \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtAñoLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado Año de Publicación \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else if (txtNumeroPaginasLibro.getText().trim().length() == 0) {
                mensaje = mensaje.concat("No se ha ingresado Número de Páginas \n");
                JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else {

                try {
                    con.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        }
    }

    public ArrayList devuelveNombres(List<String> autores) {
        ArrayList nombres = new ArrayList();
        String nombre;
        String valor;
        int valorfinal;
        for (int i = 0; i < autores.size(); i++) {
            valor = autores.get(i);
            valorfinal = valor.indexOf(" ");
            nombre = valor.substring(0, valorfinal);
            nombres.add(nombre);
        }
        return nombres;

    }

    public String devuelveRut(ArrayList nombres) {
        String devolver = "";
        int i = 0;
        String consulta = "SELECT RUT FROM AUTOR WHERE NOMBRE = ?";
        try {
            ps = con.prepareStatement(consulta);
            String palabra = (String) nombres.get(i);
            ps.setString(1, palabra);
            rs = ps.executeQuery();
            if (rs.next()) {
                devolver = rs.getString("RUT");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
        return devolver;
    }

    public ArrayList devuelveRuts(ArrayList nombres) {
        ArrayList ruts = new ArrayList();
        int i = 0;
        String consulta = "SELECT RUT FROM AUTOR WHERE NOMBRE = ?";
        while (i < nombres.size()) {
            try {
                ps = con.prepareStatement(consulta);
                String palabra = (String) nombres.get(i);
                ps.setString(1, palabra);
                rs = ps.executeQuery();
                while (rs.next()) {
                    ruts.add(rs.getString("RUT"));
                }
                i++;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return ruts;
    }

    @Override
    public void eliminar() {

        int filaseleccionada;
        filaseleccionada = tablaLibrosRegistrados.getSelectedRow();
        if (filaseleccionada >= 0) {
            try {
                con.setAutoCommit(false);
                int seleccionar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar este Registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (seleccionar == 0) {
                    String sqlLibro = "DELETE FROM Libro WHERE NUMERO_DE_SERIE = '?'";
                    String sqlUnion = "DELETE FROM AUTOR_LIBRO WHERE LIBRO_NUMERO_DE_SERIE = '?'";
                    String valor = tablaLibrosRegistrados.getValueAt(filaseleccionada, 0).toString();
                    ps = con.prepareStatement(sqlLibro);
                    ps.setString(1, valor);
                    ps.addBatch();

                    ps = con.prepareStatement(sqlUnion);
                    ps.setString(1, valor);
                    ps.addBatch();

                    ps.executeBatch();

                    con.commit();
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el registro de la tabla ", "Ventana", JOptionPane.INFORMATION_MESSAGE);
                    listar();
                    limpiar();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Ventana", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para eliminar", "Ventana", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String sql = "SELECT li.NUMERO_DE_SERIE, li.ISBN, li.TITULO, li.\"AÑO_PUBLICACIÓN\", au.NOMBRE || ' ' || au.APELLIDO_PATERNO || ' ' || au.APELLIDO_MATERNO as \"Nombre Autor\", li.\"NUMERO_DE_PÁGINAS\",li.PRECIO_REFERENCIA,li.EDITORIAL_NOMBRE,li.IDIOMA_IDIOMA,li.CATEGORIA_TIPO,li.REGISTRO_ESTADO\n"
                    + "FROM LIBRO li\n"
                    + "JOIN AUTOR_LIBRO auli\n"
                    + "on auli.LIBRO_NUMERO_DE_SERIE = li.NUMERO_DE_SERIE\n"
                    + "JOIN AUTOR au\n"
                    + "on au.RUT = auli.AUTOR_RUT";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantColumnas = rsmd.getColumnCount();
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
            Object[] filas = new Object[cantColumnas];
            while (rs.next()) {
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            tablaLibrosRegistrados.setModel(modelo);
        } catch (SQLException ex) {

        }
    }

    @Override
    public void buscarPor() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String datoCombo = "li.".concat((String) comboLibro.getSelectedItem());
            String buscar = txtBusqueda.getText().trim();
            if (buscar.equals("")) {
                listar();
            } else {
                String sql = "SELECT li.NUMERO_DE_SERIE, li.ISBN, li.TITULO, li.\"AÑO_PUBLICACIÓN\", au.NOMBRE ||' ' || au.APELLIDO_PATERNO||' ' || au.APELLIDO_MATERNO AS \"NOMBRE COMPLETO\", li.\"NUMERO_DE_PÁGINAS\",li.PRECIO_REFERENCIA,li.EDITORIAL_NOMBRE,li.IDIOMA_IDIOMA,li.CATEGORIA_TIPO,li.REGISTRO_ESTADO\n"
                        + "from LIBRO li\n"
                        + "JOIN AUTOR_LIBRO auli\n"
                        + "on li.NUMERO_DE_SERIE = auli.LIBRO_NUMERO_DE_SERIE\n"
                        + "JOIN AUTOR au\n"
                        + "on auli.AUTOR_RUT = au.RUT\n"
                        + "WHERE " + datoCombo + " like '%" + buscar + "%' ";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantColumnas = rsmd.getColumnCount();
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
                while (rs.next()) {
                    Object[] filas = new Object[cantColumnas];
                    for (int i = 0; i < cantColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
                tablaLibrosRegistrados.setModel(modelo);

            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

}
