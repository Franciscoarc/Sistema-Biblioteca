package Vistas;

import ConexionBD.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DevolverLibros extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modelo = new DefaultTableModel();

    public DevolverLibros() {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDevolverLibros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibrosDevueltos = new javax.swing.JTable();
        btnBuscarLibros = new javax.swing.JButton();
        txtBusquedaPorRUT = new javax.swing.JFormattedTextField();
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

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Devolución de Libros");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 10, 370, 60);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese su RUT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 90, 110, 20);

        btnDevolverLibros.setText("Devolver");
        btnDevolverLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverLibrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDevolverLibros);
        btnDevolverLibros.setBounds(700, 80, 120, 40);

        tablaLibrosDevueltos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaLibrosDevueltos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLibrosDevueltos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLibrosDevueltos);
        tablaLibrosDevueltos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 200, 780, 120);

        btnBuscarLibros.setText("Buscar");
        btnBuscarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarLibros);
        btnBuscarLibros.setBounds(360, 80, 140, 40);

        try {
            txtBusquedaPorRUT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBusquedaPorRUT.setText(".   .   -");
        txtBusquedaPorRUT.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jPanel1.add(txtBusquedaPorRUT);
        txtBusquedaPorRUT.setBounds(200, 90, 140, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLibro.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 520);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnBuscarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibrosActionPerformed
        buscarLibrosArrendados();
    }//GEN-LAST:event_btnBuscarLibrosActionPerformed

    private void btnDevolverLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverLibrosActionPerformed
        devolverLibros();
    }//GEN-LAST:event_btnDevolverLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(DevolverLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolverLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolverLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolverLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevolverLibros().setVisible(true);
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
    private javax.swing.JButton btnBuscarLibros;
    private javax.swing.JButton btnDevolverLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLibrosDevueltos;
    private javax.swing.JFormattedTextField txtBusquedaPorRUT;
    // End of variables declaration//GEN-END:variables

    public void buscarLibrosArrendados() {
        Object[] datos;
        try {
            String rut = txtBusquedaPorRUT.getText().trim();
            boolean verificar = consultarRut(rut);
            if (verificar) {
                //Consulta que devuelve si existe, los libros arrendados al trabajador;
                String sqlBusqueda = "SELECT libro.NUMERO_DE_SERIE, libro.ISBN, libro.TITULO, libro.\"AÑO_PUBLICACIÓN\", au.NOMBRE || ' ' || au.APELLIDO_PATERNO ||' ' || au.APELLIDO_MATERNO as \"NOMBRE COMPLETO\", libro.\"NUMERO_DE_PÁGINAS\",libro.PRECIO_REFERENCIA, libro.EDITORIAL_NOMBRE,libro.IDIOMA_IDIOMA, libro.CATEGORIA_TIPO \n"
                        + "FROM LIBRO libro\n"
                        + "JOIN AUTOR_LIBRO auli\n"
                        + "on auli.LIBRO_NUMERO_DE_SERIE = libro.NUMERO_DE_SERIE\n"
                        + "JOIN AUTOR au\n"
                        + "on auli.AUTOR_RUT = au.RUT\n"
                        + "JOIN PRESTAMO_LIBRO preli\n"
                        + "ON preli.LIBRO_NUMERO_DE_SERIE = libro.NUMERO_DE_SERIE\n"
                        + "JOIN PRESTAMO pres\n"
                        + "on preli.PRESTAMO_CODIGO_PRESTAMO = pres.CODIGO_PRESTAMO\n"
                        + "JOIN TRABAJADOR tra\n"
                        + "on pres.TRABAJADOR_RUT = tra.RUT\n"
                        + "WHERE pres.TRABAJADOR_RUT = '" + rut + "'";

                ps = con.prepareStatement(sqlBusqueda);
                rs = ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int cantColumnas = rsmd.getColumnCount();
                while (rs.next()) {
                    datos = new Object[cantColumnas];
                    for (int i = 0; i < cantColumnas; i++) {
                        datos[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(datos);
                    tablaLibrosDevueltos.setModel(modelo);
                }
            } else {
                modelo.setRowCount(0);
                JOptionPane.showMessageDialog(null, "No existe un Trabajador con este RUT", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (HeadlessException | SQLException ex) {
            String rut = txtBusquedaPorRUT.getText().trim();
            int largo = rut.length();
            String verificalinea = rut.substring(largo - 1);
            String punto = Character.toString(rut.charAt(0));
            if (rut.equals(".   .   -")) {
                JOptionPane.showMessageDialog(null, "No se ha ingresado RUT", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (largo <= 10 || verificalinea.equals("-") || punto.equals(".")) {
                JOptionPane.showMessageDialog(null, "RUT imcompleto", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }

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

    public void devolverLibros() {
        String actualizarLibro = "UPDATE LIBRO SET REGISTRO_ESTADO ='Disponible' WHERE NUMERO_DE_SERIE = ?";
        String sqlEliminarRelacion = "DELETE FROM PRESTAMO_LIBRO WHERE LIBRO_NUMERO_DE_SERIE = ?  AND PRESTAMO_CODIGO_PRESTAMO = ?";
        int fila = tablaLibrosDevueltos.getSelectedRow();
        String rut = txtBusquedaPorRUT.getText().trim();
        boolean verificar = consultarRut(rut);
        if (fila >= 0) {
            if (verificar) {
                try {
                    con.setAutoCommit(false);
                    String codigoPrestamo = obtenerCodigo(rut);
                    String ISSN = tablaLibrosDevueltos.getValueAt(fila, 0).toString();

                    ps = con.prepareStatement(sqlEliminarRelacion);
                    ps.setString(1, ISSN);
                    ps.setString(2, codigoPrestamo);
                    ps.executeUpdate();
                    
                    con.commit();

                    ps = con.prepareStatement(actualizarLibro);
                    ps.setString(1, ISSN);
                    ps.executeUpdate();
                    
                    con.commit();
                    
                    recargar(fila);
                    JOptionPane.showMessageDialog(null, "Se ha devuelvo correctamente el libro", "Error", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "No existe un Trabajador con ese RUT. Por favor verificar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila Por favor verificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String obtenerCodigo(String rut) {
        String codigo = "";
        try {
            String sqlCodigo = "SELECT * FROM PRESTAMO WHERE TRABAJADOR_RUT ='" + rut + "' ";

            ps = con.prepareStatement(sqlCodigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                codigo = rs.getString("CODIGO_PRESTAMO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return codigo;

    }

    private void recargar(int fila) {
        modelo.removeRow(fila);
        tablaLibrosDevueltos.setModel(modelo);
    }

}
