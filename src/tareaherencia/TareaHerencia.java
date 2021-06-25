/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherencia;

import ico.fes.person.Alumno;
import ico.fes.person.Persona;

/**
 *
 * @author karly
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1= new Persona("Juan", 20, "Hombre", 1.80f);
        Alumno Al1= new Alumno("978203739", "Medicina", 6, "Mario", 26, "Hombre", 1.60f);
        System.out.println(per1);
        System.out.println(Al1);
        System.out.println("El alumno con numero de cuenta " + Al1.getNumeroCuenta() + " se llama " + Al1.getNombre());
    } 
    
}
