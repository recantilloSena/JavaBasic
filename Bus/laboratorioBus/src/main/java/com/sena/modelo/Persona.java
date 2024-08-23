
package com.sena.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Persona {
    
    private Integer id; 
    private String nombre ;
    private Integer edad ; 
    private Integer idDeporte;

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }
    
    
    public static Persona load(ResultSet rs)throws SQLException{
        Persona persona= new Persona();        
        
        persona.setId(rs.getInt(1));
        persona.setNombre(rs.getString(2));
        persona.setEdad(rs.getInt(3));
        persona.setIdDeporte(rs.getInt(4));
        
        
                       
        return persona;
    }
    
    
}
