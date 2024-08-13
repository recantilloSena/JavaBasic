
package com.sena.laboratoriobus;

/**
 *
 * @author RICARDO
 * 2024-08-13
 */
public class Bus {
    
    private String placa;
    private int capacidadPasajeros;
    private double preciosPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;

    public Bus() {
    }

    public Bus(String placa, int capacidadPasajeros, double preciosPasaje) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.preciosPasaje = preciosPasaje;
    }

    public double getPreciosPasaje() {
        return preciosPasaje;
    }

    public void setPreciosPasaje(double preciosPasaje) {
        this.preciosPasaje = preciosPasaje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        this.pasajerosActuales = pasajerosActuales;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public void setTotalPasajeros(int totalPasajeros) {
        this.totalPasajeros = totalPasajeros;
    }
    
    
    
    
    
    
    
}
