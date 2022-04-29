/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemaDosEquivalente;

/**
 *
 * @author UTPL
 */
public class EquivalenteHora {
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valor_Metro_Cuadrado;

    public void establecerValor_Metro_Cuadrado(double c) {
        valor_Metro_Cuadrado = c;
    }

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void establecerArea() {
        area = ancho * largo;
    }

    public void establecerCosto_Terreno() {
        costoTerreno = valor_Metro_Cuadrado * area;
    }

    // -------------------------------------------------------------------------
    
    public double obtenerValor_Metro_Cuadrado() {
        return valor_Metro_Cuadrado;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerCosto_Terreno() {
        return costoTerreno;
    }
    
}
