
package com.sena.laboratoriobus;

import com.sena.controlador.Controlador;
import com.sena.modelo.Deporte;
import com.sena.modelo.Persona;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


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
         System.out.println("4. Listar Deportes");
         System.out.println("5. Encontrar Deportes");
         System.out.println("6. Encontrar Persona");
         System.out.println("7. Listar Personas Por Id Deporte");
         System.out.println("8. Listar el Ranking de Deportes con más Personas");
         System.out.println("9. Listar los Deportes que Contienen la letra ... ");
         System.out.println("10. Salir");
         System.out.println("--------------------");
         opcion = scanner.nextInt();
         
             if (opcion==1){
                crearDeporte();
             }
             if (opcion==2){
                crearPersona();
             }
             if (opcion==3){
                listarPersonas();
             }
             if (opcion==4){
                listarDeportes();
             }
             if (opcion==5){
                encontrarDeportes();
             }
             if (opcion==6){
                encontrarPersonas();
             }
             if (opcion==7){
                
             }
             if (opcion==8){
                listarDeportesPopulares();
             }
             
             if (opcion==9){
                listarDeporteQueContienenLaLetra();
             }
             
         
         
             
         } while ( opcion != 10  );
         
          
         
                 
         
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
         
         System.out.println("Digite El Código del Deporte " 
                   + controlador.listarDeportes().toString()
         );
         idDeporte = scanner.nextInt();    
         controlador.adicionarPersona(nombre, edad, idDeporte);    }

    private static void listarDeportes() throws SQLException, IOException {
        Controlador controlador = new Controlador();
        List<Deporte> lista =  controlador.listarDeportes();
        
        lista.forEach(i-> System.out.println(i.getId()+ " - " +i.getNombreDeporte()));
         
    }
    
    private static void listarPersonas() throws SQLException, IOException {
        Controlador controlador = new Controlador();
        List<Persona> lista =  controlador.listarPersonas();
        String deporte;
        
        
        
        for(Persona i : lista)
            {
                
                deporte = controlador.encontrarDeporte(i.getIdDeporte()).getNombreDeporte();
                System.out.println(i.getNombre() 
                        + " - "
                        + deporte
                
                );
            }
         
    }
    
    
    private static void encontrarDeportes() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        
        Integer idDeporte;
        
         System.out.println("Digite el Id del Deporte= ");
         idDeporte = scanner.nextInt();
        
         Deporte deporte = controlador.encontrarDeporte(idDeporte);
         
         System.out.println("El deporte se llama "+deporte.getNombreDeporte());
         
    }

    private static void encontrarPersonas() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        
        Integer idPersona;
        
         System.out.println("Digite el Id de la Persona = ");
         idPersona = scanner.nextInt();
        
         Persona persona = controlador.encontrarPersona(idPersona);
         
         System.out.println("El nombre de la Persona es : " + persona.getNombre());
        
         }
    private static void listarDeportesPopulares() throws SQLException, IOException {
         Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        
         Integer ranking;
         System.out.println("Digite el Tamaño del Ranking = ");
         ranking = scanner.nextInt();
         
         List<Deporte> lista =  controlador.listarDeportesMasPopulares(ranking);
         lista.forEach(i-> System.out.println(i.getId()+ " - " +i.getNombreDeporte()));

        
               
    }
    
    private static void listarDeporteQueContienenLaLetra() throws SQLException, IOException {
         Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        
         String letra;
         System.out.println("Digite la letra = ");
         letra = scanner.next();
         
         List<Deporte> lista =  controlador.listarDeporteQueContienenLaLetra(letra);
         lista.forEach(i-> System.out.println(i.getId()+ " - " +i.getNombreDeporte()));
    
    }
    
}
