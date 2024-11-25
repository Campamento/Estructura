/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ec.espoch;

import Clases.Estudiante;

/**
 *
 * @author Lizeth
 */
public class EcEspoch {

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[3];
        
        estudiantes[0] = new Estudiante ("Ana", 25, 9.6);
        estudiantes[1] = new Estudiante ("Luis", 23, 7.8);
        estudiantes[2] = new Estudiante ("Felipe", 20, 8.0);
        
        System.out.println ("Informacion de los estudiantes:");
    for (Estudiante e : estudiantes){
    e.mostrarInfo();
        System.out.println("Bienvenidos estudiantes");
}
    }
}

