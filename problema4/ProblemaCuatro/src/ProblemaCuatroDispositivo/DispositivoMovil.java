/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemaCuatroDispositivo;

/**
 *
 * @author Usuario iTC
 */
public class DispositivoMovil {

    private String sistemaOperativo;
    private String tamanio;
    private double costoInicial;
    private double iva;
    private double ivaCosto;
    private String direccion;
    private String infoIMEI;
    private double costoFinal;

    public void establecerSistemaOperativo(String c) {
        sistemaOperativo = c;
    }

    public void establecerTamanio(String c) {
        tamanio = c;
    }

    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }

    public void establecerIVA(double c) {
        iva = c;
    }

    public void establecerivaCostoInicial() {
        ivaCosto = costoInicial * (iva / 100);
    }

    public void establecerDireccion(String c) {
        direccion = c;
    }

    public void establecerinfoIMEI(String c) {
        infoIMEI = c;
    }
    
    public void establecerCostoFinal() {
        
        costoFinal = costoInicial + ivaCosto;
    }

    // -------------------------------------------------------------------------
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerTamanio() {
        return tamanio;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public double obtenerIVA() {
        return iva;
    }

    public double obtenerIVACostoInicial() {
        return ivaCosto;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerInformacionIMEI() {
        return infoIMEI;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }

}
