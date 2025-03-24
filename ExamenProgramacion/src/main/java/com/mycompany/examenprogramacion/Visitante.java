/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion;

/**
 *
 * @author carlamorales
 */
public class Visitante {
    private int idVisitante;
    private String nombreVisitante;
    private int edadVisitante;
    
    //constructor
    public Visitante(int idVisitante, String nombreVisitante, int edadVisitante) {
        this.idVisitante = idVisitante;
        this.nombreVisitante = nombreVisitante;
        this.edadVisitante = edadVisitante;
    }
  
    //getters
    public int getIdVisitante() {
        return idVisitante;
    }

    public String getNombre() {
        return nombreVisitante;
    }

    public int getEdad() {
        return edadVisitante;
    }
    
    //metodo para comprar entrada
    public void comprarEntrada(){
        System.out.println("Entrada comprada correctamente");
        
    }
    // metodo para utilizar la atraccion
    public void usarAtraccion(){
        System.out.println(this.getNombre() + " Esta utilizando la atraccion");
    }
   
}
