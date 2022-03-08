/*
Autor: Luis Fernando Vásquez Fabián
Fecha de creación: 7 de marzo del 2022
Fecha de modificación: 7 de marzo del 2022
Descripción: Clase producto
 */
package entity;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    String codigo;
    String nombre;
    String descripcion;
    double precio;

    public Producto() {
        
    }
    
   

    public Producto(String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    


       public static void main(String[] args) {
        Producto p1=new Producto("123","pantalon","rojo",100);
        Producto p2=new Producto("456","playera","verde",200);
        Producto p3=new Producto("789","camisa","amarillo",300);
        Producto p4=new Producto("321","tennis","gris",400);
        
        
        List<Producto>lista=new ArrayList<Producto>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
           for (Producto i: lista) {
               System.out.println(i.getCodigo());
               System.out.println(i.getNombre());
               System.out.println(i.getDescripcion());
               System.out.println(i.getPrecio());
           }
        
    }
       
      public class Persona{

        String nombre;
        String sexo;
        int edad;

        public Persona() {
        }

        public Persona(String nombre, String sexo, int edad) {
            this.nombre = nombre;
            this.sexo = sexo;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

    }
    
    public class usuario extends Persona{
    String codigo;
    String nombreUsuario;
    String contraseña;

        public usuario() {
        }

        public usuario(String codigo, String nombreUsuario, String contraseña) {
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

    
}
    

 


  
    
  
    
