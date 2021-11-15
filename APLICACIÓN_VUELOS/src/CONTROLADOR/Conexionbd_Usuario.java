 
package CONTROLADOR;
 
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexionbd_Usuario {
    
    public static String url ="jdbc:mysql://localhost/bdsistema_vuelos";
    public static String correo = "root";
    public static String contraseña = "";
    public static String clase ="com.mysql.jdbc.Driver";
    
    public static Connection conectar(){
        com.mysql.jdbc.Connection conexion=null;
        try {
            Class.forName(clase);
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,correo,contraseña);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
             System.out.println(e);
        }
        return conexion;
    }
   
    
}
