/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion;

/**
 *
 * @author carlamorales
 */
enum Estado{
    operativa,
    enMantenimiento,
    fueraDeServicio
}

public class Atraccion{
    private String nombre;
    private int capacidad;
    private Estado estado;
    
    //constructor

    public Atraccion(String nombre, int capacidad, Estado estado) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }
    
    //constructor vacio

    public Atraccion() {
    }
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Estado getEstado() {
        return estado;
    }
    
    //metodo para comprar entrada
    public void comprarEntrada(String compra){
        System.out.println("Se ha comprado la entrada correctamente");
    }
    
    // metodo para usar la atraccion
    public void usarAtraccion(String montarse){
        System.out.println("Te vas a montar en la atraccion. Disfruta el viaje!");
    }
    
    
    
    
    
    
}
