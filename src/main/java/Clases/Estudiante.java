/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lizeth
 */
public class Estudiante {
    public String nombre;
    public int edad;
    public double promedio;
    

    public Estudiante(String nombre, int edad, double promedio){
        this.edad=edad;
        this.nombre=nombre;
        this.promedio=promedio;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void mostrarInfo(){
    System.out.println("Nombre:" +nombre+ " Edad:"+edad+ " Promedio:"+ promedio);
    }
    
    
}

