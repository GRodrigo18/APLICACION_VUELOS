
package CONTROLADOR;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexion_vuelos {
     Connection con = null;
        
     public conexion_vuelos(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdsistema_vuelos","root","");
                System.out.println("Conexion establecida");
            
            } catch (Exception e) {
                System.out.println("Error de conexión"+e);
            }
        }
        public int ejecutarsentenciasql(String strSentenciasql){
            try {
                PreparedStatement pstm=(PreparedStatement) con.prepareStatement(strSentenciasql);
                pstm.execute();
                return 1;
            } catch (SQLException e) {
                System.out.print(e);
                return 0;
            }
        }
        public ResultSet consultarRegistros(String strSentenciasql){
            try {
                PreparedStatement pstm=(PreparedStatement) con.prepareStatement(strSentenciasql);
                ResultSet respuesta = pstm.executeQuery();
                return respuesta;
                
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        }
}
