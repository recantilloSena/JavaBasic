
package com.sena.controlador;

import com.sena.modelo.Conexion;
import com.sena.modelo.Deporte;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


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
    
    public void adicionarDeporte(Integer idDeporte, String nombreDeporte) throws SQLException{
        if (!hayConexion()) {
            throw new SQLException("SIN CONEXION");
        }
        PreparedStatement pst = null;
        ResultSet rst = null;
        try {
            pst = con.prepareStatement(" INSERT INTO `deportes` (`id`, `nombre_deporte`) "
                    + " VALUES (?, ?);");
            
            pst.setInt(1, idDeporte);
            pst.setString(2, nombreDeporte);
                  
           
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
    
    public List<Deporte> listarDeportes() throws SQLException{
        
         if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
        
        
        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        try {
            String query;
            query = "SELECT * FROM deportes ";    //Definir la consulta
            pst = con.prepareStatement(query);    //Prepararla
                  
            rst = pst.executeQuery();             //Ejecutarla 
            
            
            while (rst.next()) {
                lista.add(Deporte.load(rst));     //Recorre el RS y llena una lista
            }
            //System.out.println("El Query " + query );
            
        }  finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
        
        
        
    }
    
    
}
