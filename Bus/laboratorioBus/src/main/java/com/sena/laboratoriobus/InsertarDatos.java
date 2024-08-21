
package com.sena.laboratoriobus;

import com.sena.controlador.Controlador;
import com.sena.modelo.Deporte;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class InsertarDatos {
    
    
     public static void main(String[] args) throws SQLException, IOException  {
        
         
         Scanner scanner = new Scanner(System.in);
         
         String nombre,nombreDeporte;
         Integer edad;
         Integer idDeporte, opcion=6;
         
         do {      
         System.out.println("MENU DE OPCIONES");
         System.out.println("1. Crear Deporte");
         System.out.println("2. Crear Persona");
         System.out.println("3. Listar Personas");
         System.out.println("4. Listar Desportes");
         System.out.println("5. Salir");
         System.out.println("--------------------");
         opcion = scanner.nextInt();
         
             if (opcion==1){
                crearDeporte();
             }
             if (opcion==2){
                crearPersona();
             }
             if (opcion==3){
                
             }
             if (opcion==4){
                listarDeportes();
             }
             
         
         
             
         } while ( opcion != 5  );
         
          
         
         
         
         
         
         
         
         
         
     }

    private static void crearDeporte() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
         String nombre,nombreDeporte;
         Integer edad;
         Integer idDeporte;
         
         System.out.println("Digite Nombre de Deporte = ");
         nombreDeporte = scanner.next();         
         System.out.println("Digite el Id del Deporte= ");
         idDeporte = scanner.nextInt();         
         controlador.adicionarDeporte(idDeporte, nombreDeporte);    
    }

    private static void crearPersona() throws SQLException, IOException {System.out.println("Digite Nombre = ");
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        String nombre,nombreDeporte;
         Integer edad;
         Integer idDeporte;
         nombre = scanner.next();
         
         System.out.println("Digite La edad de la persona= ");
         edad = scanner.nextInt();
         
         System.out.println("Digite El Código del Deporte = ");
         idDeporte = scanner.nextInt();    
         controlador.adicionarPersona(nombre, edad, idDeporte);    }

    private static void listarDeportes() throws SQLException, IOException {
        Controlador controlador = new Controlador();
        List<Deporte> lista =  controlador.listarDeportes();
        
        lista.forEach(i-> System.out.println(i.getId()+ " - " +i.getNombreDeporte()));
         
    }
    
}
