
package com.sena.laboratoriobus;

import com.sena.modelo.Controlador;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertarDatos {
    
     public static void main(String[] args) throws SQLException, IOException  {
        
         Scanner scanner = new Scanner(System.in);
         
         String nombre;
         Integer edad;
         Integer idDeporte;
         
         System.out.println("Digite Nombre = ");
         nombre = scanner.next();
         
         System.out.println("Digite La edad = ");
         edad = scanner.nextInt();
         
         System.out.println("Digite El Código del Deporte = ");
         idDeporte = scanner.nextInt();
         
         
         
         Controlador controlador = new Controlador();
         
         controlador.adicionarPersona(nombre, edad, idDeporte);
         
         
         
         
     }
    
}
