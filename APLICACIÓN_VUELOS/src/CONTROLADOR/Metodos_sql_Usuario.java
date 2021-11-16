 
package CONTROLADOR;
 
import CONTROLADOR.Conexionbd_Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

public class Metodos_sql_Usuario {
    public static Conexionbd_Usuario conexion=new Conexionbd_Usuario();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero=0;
    
    //LOGIN VALIDAÓN DE INGRESO
    public static String buscarUsuarioRegistrado(String correo,String contraseña){
        String busqueda_usuario=null;
        Connection conexion= null;
        try {
            conexion=Conexionbd_Usuario.conectar();
            String sentencia_buscarusuario=("SELECT Nombre,Correo,Contraseña FROM ingreso WHERE Correo='"
                        +correo+"'&& Contraseña='"+ contraseña+"'");
            sentencia_preparada=(PreparedStatement) conexion.prepareStatement(sentencia_buscarusuario);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario = "usuario encontrado";
            }else{
                busqueda_usuario = "usuario no encontrado";
            }
            
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
    
    
    public static String buscarNombre(String correo){
        String busqueda_nombre=null;
        Connection conexion= null;
        try {
            conexion=Conexionbd_Usuario.conectar();
            String sentencia_buscar=("SELECT Nombre,Apellido FROM ingreso WHERE Correo='"+correo+"'");
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_buscar);
            resultado= sentencia_preparada.executeQuery();
            if(resultado.next()){
                String nombre= resultado.getString("Nombre");
                String apellidos=resultado.getString("Apellido");
                busqueda_nombre=(nombre+" "+apellidos);
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }
    
   
    
    //GUARDAR O CREAR USUARIO NUEVO O CUENTA NUEVA 
    public int guardar(String nombre,String apellidos,String correo,String contraseña){
        int resultado=0;
        Connection conexion = null;
        String sentencia_guardar=("INSERT INTO ingreso (Nombre,Apellido,Correo,Contraseña)"
                + "VALUES (?,?,?,?)");
        try {
            conexion =Conexionbd_Usuario.conectar();
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);
            
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return resultado;
    }
}
