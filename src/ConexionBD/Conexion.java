package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {



    public Connection conectar() {
        Connection conexion = null;
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String usuario = "pancho";
        String contraseña = "123";
        try{
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            if(conexion!=null){
                System.out.println("Conectado a la base de datos");
            }
        }
        catch(SQLException e){
            System.out.println("No se ha conectado a la base de datos");
        }
       return conexion;
    }
}
