/*
Autor:Ramiro
Fecha creación:07/03/2022
Fecha actualización: 07/03/2022
Descripción: Se crea una clase de nombre Usuario.

 */
package entity;

/**
 *
 * @author labtw08
 */
public class Usuario extends Persona {
    private String codigo;
    private String nombreUsuario;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(String codigo, String nombreUsuario, String contraseña) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public Usuario(String codigo, String nombreUsuario, String contraseña, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    
   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
   
    
}
