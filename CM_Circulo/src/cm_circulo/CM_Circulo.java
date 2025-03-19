/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cm_circulo;

/**
 *
 * @author carlamorales
 */
public class CM_Circulo {

    int Id;
    double Radio;
    String color;

    //constructor
    public CM_Circulo() {
    }

    public CM_Circulo(int Id, double Radio, String color) {
        this.Id = Id;
        this.Radio = Radio;
        this.color = color;
    }

    //getters 
    public int getId() {
        return Id;
    }

    public double getRadio() {
        return Radio;
    }

    public String getColor() {
        return color;
    }

    // setters
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CM_Circulo{");
        sb.append('}');
        return sb.toString();
    }

    public double calcularAreaCirculo() {
        double radio1 = this.getRadio();
        double area2 = radio1 * 3.14;
        return area2;
    }

}
