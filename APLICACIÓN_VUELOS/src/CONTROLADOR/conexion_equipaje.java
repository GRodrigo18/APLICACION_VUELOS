
package CONTROLADOR;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexion_equipaje {
     public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     Connection con=null;
     
     public Connection conexion_equipaje(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdsistema_vuelos","root","");
             System.err.println("Conexion establecida");
         } catch (ClassNotFoundException | SQLException e) {
              JOptionPane.showMessageDialog(null, "Error de conexión"+e.getMessage());
         }
         return con;
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
}
