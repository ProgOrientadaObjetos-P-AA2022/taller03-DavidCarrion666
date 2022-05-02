/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemaUnoEjecutor;

import problemaUnoTerreno.Terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono

        Terreno terrenoUno = new Terreno();
        Terreno terrenoDos = new Terreno();
        // Valores de entrada
        double valorMetro = 500;
        double ancho = 20;
        double largo = 30;
        
        double valorMetroDos = 300;
        double anchoDos = 50;
        double largoDos = 40;

        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        terrenoUno.establecerValor_Metro_Cuadrado(valorMetro);
        terrenoUno.establecerAncho(ancho);
        terrenoUno.establecerLargo(largo);                
        terrenoUno.establecerArea();
        terrenoUno.establecerCosto_Terreno();
        
        terrenoDos.establecerValor_Metro_Cuadrado(valorMetroDos);
        terrenoDos.establecerAncho(anchoDos);
        terrenoDos.establecerLargo(largoDos);                
        terrenoDos.establecerArea();
        terrenoDos.establecerCosto_Terreno();

        System.out.printf("Factura Del Terreno\n\nValor del metro cuadrado: %.2f\n"
                + "Datos del ancho: %.2f\nDatos del Largo: %.2f\n"
                + "area del terreno: %.2f\nCosto del terreno: %.2f\n",
                terrenoUno.obtenerValor_Metro_Cuadrado(),
                terrenoUno.obtenerAncho(),
                terrenoUno.obtenerLargo(),
                terrenoUno.obtenerArea(),
                terrenoUno.obtenerCosto_Terreno());
        
        System.out.printf("Factura Del Terreno\n\nValor del metro cuadrado: %.2f\n"
                + "Datos del ancho: %.2f\nDatos del Largo: %.2f\n"
                + "area del terreno: %.2f\nCosto del terreno: %.2f\n",
                terrenoDos.obtenerValor_Metro_Cuadrado(),
                terrenoDos.obtenerAncho(),
                terrenoDos.obtenerLargo(),
                terrenoDos.obtenerArea(),
                terrenoDos.obtenerCosto_Terreno());

    }
}
