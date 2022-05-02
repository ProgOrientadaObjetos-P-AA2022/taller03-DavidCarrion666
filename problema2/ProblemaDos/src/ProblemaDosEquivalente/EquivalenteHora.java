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

    private double horas;
    private double segundos;
    private double minutos;
    private double dias;

    public void establecerHoras(double c) {
        horas = c;
    }

    public void establecerSegundos() {
        segundos = (horas * 3600);
    }

    public void establecerMinutos() {
        minutos = (horas * 60);
    }

    public void establecerDias() {
        dias = (horas / 24);
    }

    // -------------------------------------------------------------------------
    
    public double obtenerHoras() {
        return horas;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerDias() {
        return dias;
    }

}
