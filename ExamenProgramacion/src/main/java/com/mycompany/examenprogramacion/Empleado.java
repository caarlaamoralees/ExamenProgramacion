/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion;

/**
 *
 * @author carlamorales
 */
enum Puesto{
    mantenimiento,
    vendedor,
    seguridad
}

public class Empleado {
    public String nombreE;
    public int idEmpleado;
    public Puesto puesto;
    
    
    // constructor 
    public Empleado(String nombreE, int idEmpleado, Puesto puesto) {
        this.nombreE = nombreE;
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
    }

    public Empleado() {
    }
    
    //getters

    public String getNombre() {
        return nombreE;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public Puesto getPuesto() {
        return puesto;
    }
    
    // metodos para asignar las tareas a los empeados
    public void asignarTarea(String tarea){
        System.out.println(this.getNombre() + " ha sido asignado a la tarea de " + tarea);
    }  
}



