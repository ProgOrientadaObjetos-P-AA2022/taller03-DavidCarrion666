/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemaTresInstitucion;

/**
 *
 * @author Usuario iTC
 */
public class InstitucionEducativa {

    private String nombre;
    private String tipo;
    private int alumnos;
    private int docentes;
    private int sedes;
    private double gastos;
    private double presupuestos;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerTipo(String c) {
        tipo = c;
    }

    public void establecerAlumnos(int c) {
        alumnos = c;
    }

    public void establecerDocentes(int c) {
        docentes = c;
    }
    
    public void establecerSedes(int c) {
        sedes = c;
    }
    
    public void establecerGastos(double c) {
        gastos = c;
    }

    public void establecerPresupuesto() {
        presupuestos = alumnos * gastos;
    }

    // -------------------------------------------------------------------------
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerAlumnos() {
        return alumnos;
    }

    public int obtenerDocentes() {
        return docentes;
    }

    public int obtenerSedes() {
        return sedes;
    }   
    public double obtenerGastos() {
        return gastos;
    }
    
    public double obtenerPresupuesto() {
        return presupuestos;
    }
}
