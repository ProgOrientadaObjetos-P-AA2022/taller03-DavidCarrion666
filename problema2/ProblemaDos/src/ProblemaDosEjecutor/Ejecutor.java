/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemaDosEjecutor;

import ProblemaDosEquivalente.EquivalenteHora;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        EquivalenteHora tiempo = new EquivalenteHora();
        EquivalenteHora tiempoDos = new EquivalenteHora();

        // Valores de entrada
        double horas = 30;
        double horasDos = 45.50;

        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        tiempo.establecerHoras(horas);
        tiempo.establecerDias();
        tiempo.establecerMinutos();
        tiempo.establecerSegundos();
        
        tiempoDos.establecerHoras(horasDos);
        tiempoDos.establecerDias();
        tiempoDos.establecerMinutos();
        tiempoDos.establecerSegundos();


        System.out.printf("Transformacion De Unidades\n\nValor de horas: %.2f\n"
                + "Valor Horas a Dias: %.2f\nValor Horas a Minutos: %.2f\n"
                + "Valor Horas a Segundos: %.2f\n",
                tiempo.obtenerHoras(),
                tiempo.obtenerDias(),
                tiempo.obtenerMinutos(),
                tiempo.obtenerSegundos());
        
        System.out.printf("Transformacion De Unidades\n\nValor de horas: %.2f\n"
                + "Valor Horas a Dias: %.2f\nValor Horas a Minutos: %.2f\n"
                + "Valor Horas a Segundos: %.2f\n",
                tiempoDos.obtenerHoras(),
                tiempoDos.obtenerDias(),
                tiempoDos.obtenerMinutos(),
                tiempoDos.obtenerSegundos());
    }

}
