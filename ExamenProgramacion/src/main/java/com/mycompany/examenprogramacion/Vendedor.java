/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion;

/**
 *
 * @author carlamorales
 */
public class Vendedor extends Empleado {
    //atributo
    int ventasRealizadas;

    // constructores
    public Vendedor(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public Vendedor(int ventasRealizadas, String nombre, int idEmpleado, Puesto puesto) {
        super(nombre, idEmpleado, puesto);
        this.ventasRealizadas = ventasRealizadas;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }
    
    public void venderEntrada(){
        this.ventasRealizadas += 1;
        System.out.println("Entrada vendida.");
    }
    
    public void reportarVentas(){
        System.out.println("Se han vendido " + getVentasRealizadas() + " entradas.");
    }
    
}
