/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.person;

/**
 *
 * @author karly
 */
public class Alumno extends Persona{
    private String NumeroCuenta;
    private String Carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String NumeroCuenta, String Carrera, int semestre) {
        this.NumeroCuenta = NumeroCuenta;
        this.Carrera = Carrera;
        this.semestre = semestre;
    }

    public Alumno(String NumeroCuenta, String Carrera, int semestre, String nombre, int edad, String genero, float altura) {
        super(nombre, edad, genero, altura);
        this.NumeroCuenta = NumeroCuenta;
        this.Carrera = Carrera;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "NumeroCuenta=" + NumeroCuenta + ", Carrera=" + Carrera + ", semestre=" + semestre + '}';
    }
    
    
}
