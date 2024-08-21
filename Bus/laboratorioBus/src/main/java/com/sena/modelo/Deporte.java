
package com.sena.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Deporte {
    
    private Integer id; 
    private String nombreDeporte;

    public Deporte() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }
    
     public static Deporte load(ResultSet rs)throws SQLException{
        Deporte deporte= new Deporte();
        
        deporte.setId(rs.getInt(1));
        deporte.setNombreDeporte(rs.getString(2));
        
        
                       
        return deporte;
    }
    
    
    
}
