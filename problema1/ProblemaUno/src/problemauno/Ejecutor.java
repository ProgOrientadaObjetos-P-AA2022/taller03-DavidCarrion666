/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemauno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono

        Terreno t = new Terreno();

        // Valores de entrada
        double valorMetro = 500;
        double ancho = 20;
        double largo = 30;

        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        t.establecerValor_Metro_Cuadrado(valorMetro);
        t.establecerAncho(ancho);
        t.establecerLargo(largo);
        
        
        t.establecerArea();
        t.establecerCosto_Terreno();

        System.out.printf("Factura Del Terreno\n\nValor del metro cuadrado: %.2f\n"
                + "Datos del ancho: %.2f\nDatos del Largo: %.2f\n"
                + "area del terreno: %.2f\nCosto del terreno: %.2f\n",
                t.obtenerValor_Metro_Cuadrado(),
                t.obtenerAncho(),
                t.obtenerLargo(),
                t.obtenerArea(),
                t.obtenerCosto_Terreno());

    }
}
