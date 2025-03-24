/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion;

/**
 *
 * @author carlamorales
 */
enum Responsable {
    mecanica,
    electrica,
    limpieza
}

public class Mantenimiento extends Empleado {
    
    // Atributos
    Responsable areaResponsable;

    // Constructores
    public Mantenimiento(Responsable areaResponsable) {
        this.areaResponsable = areaResponsable;
    }

    public Mantenimiento(Responsable areaResponsable, String nombre, int id, Puesto puesto) {
        super(nombre, id, puesto);
        this.areaResponsable = areaResponsable;
    }

    public Responsable getAreaResponsable() {
        return areaResponsable;
    }
    
    public void reportarMantenimiento() {
        System.out.println("Se esta realizando el mantenimiento de una atraccion");
    }
     
    public void reportarProblema(String problema) {
        System.out.println("Se ha reportado el problema: " + problema + " en una atraccion");
    }
    
}
