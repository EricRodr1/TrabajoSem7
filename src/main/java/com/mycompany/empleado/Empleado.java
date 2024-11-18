/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado;

/**
 *
 * @author Eric Rodriguez
 */
public class Empleado {
    private String nombre;
    private double salario;
    private String genero;
    private int edad;

    public Empleado(String nombre, double salario, String genero, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.genero = genero;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

    

