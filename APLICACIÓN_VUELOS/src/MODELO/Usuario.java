 
package MODELO;

public class Usuario {
    String correo;
    String contraseña;
    
    public Usuario(){
        correo="";
        contraseña="";
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}

