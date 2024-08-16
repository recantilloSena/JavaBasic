
package com.sena.modelo;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Controlador extends Conexion{

    //INSERT INTO personas ( `nombre`, `edad`, `id_deporte`) VALUES ('HEINER CABARCAS', '35', '2');
    
    
    public Controlador() throws SQLException, IOException {
        this.conectar();
    }
    
     public void adicionarPersona(String nombre, Integer edad, Integer idDeporte) throws SQLException, IOException {
        if (!hayConexion()) {
            throw new SQLException("SIN CONEXION");
        }
        PreparedStatement pst = null;
        ResultSet rst = null;
        try {
            pst = con.prepareStatement(" INSERT INTO personas "
                                     + "( `nombre`, `edad`, `id_deporte`) "
                                     + "VALUES (?, ?, ?)");
            
            pst.setString(1, nombre);
            pst.setInt(2, edad);
            pst.setInt(3, idDeporte);        
           
            pst.execute();

        }catch(Exception Ex){
            System.out.println("Error en Adiciona rDato : \n"+Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }
    
    
    
}
