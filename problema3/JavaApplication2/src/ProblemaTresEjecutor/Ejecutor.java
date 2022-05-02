/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemaTresEjecutor;

import ProblemaTresInstitucion.InstitucionEducativa;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono

        InstitucionEducativa colegioUno = new InstitucionEducativa();
        InstitucionEducativa colegioDos = new InstitucionEducativa();
        
        // Valores de entrada
        String nombreUno = "La Salle";
        String tipoUno = "Privada";
        int alumnosUno = 500;
        int docentesUno = 60;
        int sedesUno = 120;
        double gastosUno = 220.50;
        
        String nombreDos = "Eugenio Espejo";
        String tipoDos = "Privado";
        int alumnosDos  = 800;
        int docentesDos = 120;
        int sedesDos = 5;
        double gastosDos = 550.75;


        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        
        colegioUno.establecerNombre(nombreUno);
        colegioUno.establecerTipo(tipoUno);
        colegioUno.establecerAlumnos(alumnosUno);
        colegioUno.establecerDocentes(docentesUno);
        colegioUno.establecerSedes(sedesUno);
        colegioUno.establecerGastos(gastosUno);
        colegioUno.establecerPresupuesto();
        
        colegioDos.establecerNombre(nombreDos);
        colegioDos.establecerTipo(tipoDos);
        colegioDos.establecerAlumnos(alumnosDos);
        colegioDos.establecerDocentes(docentesDos);
        colegioDos.establecerSedes(sedesDos);
        colegioDos.establecerGastos(gastosDos);
        colegioDos.establecerPresupuesto();


        System.out.printf("Detalles de la Institución Educativa\n\n"
                + "Nombre Del Colegio: %s\nTipo De Colegio: %s\nNumero De "
                + "Alumnos: %d\nNumero De Docentes: %d\nNumero De Sedes: %d\n"
                + "Numero De Gastos Por Estudiante %.2f\nPresupuesto %.2f\n",
                colegioUno.obtenerNombre(),
                colegioUno.obtenerTipo(),
                colegioUno.obtenerAlumnos(),
                colegioUno.obtenerDocentes(),
                colegioUno.obtenerSedes(),
                colegioUno.obtenerGastos(),
                colegioUno.obtenerPresupuesto());
        
        System.out.println("-------------------------------------------------");

        System.out.printf("Detalles de la Institución Educativa\n\n"
                + "Nombre Del Colegio: %s\nTipo De Colegio: %s\nNumero De "
                + "Alumnos: %d\nNumero De Docentes: %d\nNumero De Sedes: %d\n"
                + "Numero De Gastos Por Estudiante %.2f\nPresupuesto %.2f\n",
                colegioDos.obtenerNombre(),
                colegioDos.obtenerTipo(),
                colegioDos.obtenerAlumnos(),
                colegioDos.obtenerDocentes(),
                colegioDos.obtenerSedes(),
                colegioDos.obtenerGastos(),
                colegioDos.obtenerPresupuesto());

    }
}
