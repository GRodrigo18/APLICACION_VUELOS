
package CONTROLADOR;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion_vuelos {
     Connection conectar=null;
     
     public Connection conexion_vuelos(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdsistema_vuelos","root","");
             JOptionPane.showMessageDialog(null, "Conexion establecida");
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error de conexión"+e.getMessage());
         }
         return conectar;
     }
        
}
