
package com.sena.laboratoriobus;

import java.util.Scanner;


public class LaboratorioBus {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         String placa;
         int capacidadPasajeros;
         double preciosPasaje;
         int pasajeros;
         System.out.println("Digite la placa del Bus = ");
         placa = scanner.next();
         
         System.out.println("Digite la Capaciadad de Pasajeros = ");
         capacidadPasajeros = scanner.nextInt();
         
         System.out.println("Digite el precio del pasaje = ");
         preciosPasaje = scanner.nextDouble();
       
        Bus bus = new Bus(placa, capacidadPasajeros, preciosPasaje);
        
        
        int salir=0;
        
        do {          
            
            System.out.println("Digite la Capaciadad de Pasajeros a SUBIR ");
            pasajeros = scanner.nextInt();            
            bus.subirPasajeros(pasajeros);
            
            System.out.println("Digite la Capaciadad de Pasajeros a BAJAR ");
            pasajeros = scanner.nextInt();            
            bus.bajarPasajeros(pasajeros);
            
            
            
         System.out.println("Desea Salir? 1=SI  0=NO ");
         salir = scanner.nextInt();  
            
        } while (salir==0);
        
        
               
        
        
        System.out.println(bus.toString());
    }
}
