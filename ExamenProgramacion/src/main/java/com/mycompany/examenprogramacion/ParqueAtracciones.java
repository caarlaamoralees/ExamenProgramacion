/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion;

import java.util.ArrayList;

/**
 *
 * @author carlamorales
 */
public class ParqueAtracciones {
    
    //atributos que contienen listas de operadores, empleados y visitantes
    public ArrayList<Empleado> listaEmpleados;
    public ArrayList<Atraccion> listaAtracciones;
    public ArrayList<Visitante> listaVisitantes;

    //constructor
    public ParqueAtracciones() {
        this.listaEmpleados = new ArrayList();
        this.listaAtracciones = new ArrayList();
        this.listaVisitantes = new ArrayList();
    }
    
    // getters para acceder a las listas
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    public ArrayList<Visitante> getListaVisitantes() {
        return listaVisitantes;
    }
    
    // metodo para agregar empleado 
    public void agregarEmpleado(Empleado empleado){
        this.listaEmpleados.add(empleado);
        System.out.println("Empleado añadido correctamente");
    }
    
    // metodo para agregar atraccion
    public void agregarAtraccion(Atraccion atraccion){
        this.listaAtracciones.add(atraccion);
        System.out.println("Atraccion añadida correctamente");
    }
    
    // metodo para agregar visitante
    public void agregarVisitante(Visitante visitante){
        this.listaVisitantes.add(visitante);
        System.out.println("Visitante añadido correctamente");
    }
    
    // metodo para mostrar la informacion del parque
    public void mostrarInformacionParque(){
        System.out.println("Mostrando empleados");
        for (Empleado empleado : listaEmpleados){
            System.out.println("Nombre: " + empleado.getNombre() + " - Id del empleado: " + empleado.getIdEmpleado() + " - Puesto: " + empleado.getPuesto());
            
        }
        System.out.println("Mostrando atracciones");
        for (Atraccion atraccion : listaAtracciones){
            System.out.println("Nombre: " + atraccion.getNombre() + " - Capacidad: " + atraccion.getCapacidad() + " - Estado: " + atraccion.getEstado());
        }
        System.out.println("Mostrando visitantes");
        for (Visitante visitante : listaVisitantes){
            System.out.println("Nombre: " + visitante.getNombre() + " - id del visitante: " + visitante.getIdVisitante() + " - Estado: " + visitante.getEdad());
        }
    }    
}
