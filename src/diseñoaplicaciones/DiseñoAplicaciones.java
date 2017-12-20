/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseñoaplicaciones;

import ConexionBD.Conexion;
import Vistas.VentanaPrincipal;

/**
 *
 * @author panch
 */
public class DiseñoAplicaciones {

    public static void main(String[] args){

        Conexion conexion = new Conexion();
        conexion.conectar();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
    }

}
