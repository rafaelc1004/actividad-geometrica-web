/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Rafaelito
 */
public class Circulo {
    
    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public double calcularRadioCirculo(){
        return diametro / 2;
    }
    
    public double calcularPerimetroCirculo(){
        return Math.PI * diametro;
    }
    
    public double calcularAreaCirculo(){
        double radio = calcularRadioCirculo();
        return Math.PI * Math.pow(radio, 2.0);
    }
    
}

    
