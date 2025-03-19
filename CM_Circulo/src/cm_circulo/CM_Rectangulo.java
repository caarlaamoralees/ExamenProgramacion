/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm_circulo;

/**
 *
 * @author carlamorales
 * @version 1.0
 */
public class CM_Rectangulo {

    int id;
    double ladoA;
    double ladoB;
    String Color;

    public CM_Rectangulo() {
    }

    public CM_Rectangulo(int id, double ladoA, double ladoB, String Color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.Color = Color;
    }

    // getters
    public int getId() {
        return id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public String getColor() {
        return Color;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "CM_Rectangulo{" + "id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", Color=" + Color + '}';
    }

    // calcula el area del rectangulo
    public double calcularAreaRectangulo() {
        double ladoA = this.getLadoA();
        double ladoB = this.getLadoB();
        double area1 = ladoA * ladoB;
        return area1;

    }

}
