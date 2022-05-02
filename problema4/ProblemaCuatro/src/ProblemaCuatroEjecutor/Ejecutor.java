/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemaCuatroEjecutor;

import ProblemaCuatroDispositivo.DispositivoMovil;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono

        DispositivoMovil movilUno = new DispositivoMovil();
        DispositivoMovil movilDos = new DispositivoMovil();
        
        // Valores de entrada
        String sistemaUno = "Android";
        String tamanioUno = "15 pulgadas";
        double costoInicialUno = 500;
        double ivaUno = 15;
        String direccionUno = "123-c23-a98";
        String informacionIMEIUno = "123-9284/153";
        
        String sistemaDos = "IOs!";
        String tamanioDos = "14 pulgadas";
        double costoInicialDos = 700;
        double ivaDos = 18;
        String direccionDos = "674-d85-f12";
        String informacionIMEIDos= "938-5916/693";


        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        
        movilUno.establecerSistemaOperativo(sistemaUno);
        movilUno.establecerTamanio(tamanioUno);
        movilUno.establecerCostoInicial(costoInicialUno);
        movilUno.establecerIVA(ivaUno);
        movilUno.establecerDireccion(direccionUno);
        movilUno.establecerinfoIMEI(informacionIMEIUno);
        movilUno.establecerivaCostoInicial();
        movilUno.establecerCostoFinal();
        
        movilDos.establecerSistemaOperativo(sistemaDos);
        movilDos.establecerTamanio(tamanioDos);
        movilDos.establecerCostoInicial(costoInicialDos);
        movilDos.establecerIVA(ivaDos);
        movilDos.establecerDireccion(direccionDos);
        movilDos.establecerinfoIMEI(informacionIMEIDos);
        movilDos.establecerivaCostoInicial();
        movilDos.establecerCostoFinal();
        


        System.out.printf("Detalles del Dispositivo Movil\n\nSistema Operativo:"
                + " %s\nTamanio De La Pantalla: %s\nCosto inicial: %.2f\n"
                + "IVA: %.2f\nIVA del Costo Inicial: %.2f\nDireccion Mac: %s\n"
                + "Informacion IMEI %sf\nCosto Final: %.2f\n",
                movilUno.obtenerSistemaOperativo(),
                movilUno.obtenerTamanio(),
                movilUno.obtenerCostoInicial(),
                movilUno.obtenerIVA(),
                movilUno.obtenerIVACostoInicial(),
                movilUno.obtenerDireccion(),
                movilUno.obtenerInformacionIMEI(),
                movilUno.obtenerCostoFinal());
        
        System.out.println("-------------------------------------------------");

        System.out.printf("Detalles del Dispositivo Movil\n\nSistema Operativo:"
                + " %s\nTamanio De La Pantalla: %s\nCosto inicial: %.2f\n"
                + "IVA: %.2f\nIVA del Costo Inicial: %.2f\nDireccion Mac: %s\n"
                + "Informacion IMEI %sf\nCosto Final: %.2f\n",
                movilDos.obtenerSistemaOperativo(),
                movilDos.obtenerTamanio(),
                movilDos.obtenerCostoInicial(),
                movilDos.obtenerIVA(),
                movilDos.obtenerIVACostoInicial(),
                movilDos.obtenerDireccion(),
                movilDos.obtenerInformacionIMEI(),
                movilDos.obtenerCostoFinal());

    }
}
