/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Rafaelito
 */
public class Rectangulo {

    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularAreaRectangulo() {
        return altura * base;
    }

    public double calcularPerimetroRectangulo() {
        return (altura * 2 + base * 2);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
