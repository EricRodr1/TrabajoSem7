/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;

/**
 *
 * @author Eric Rodriguez
 */
public class Bonificacion extends Empleado {
    private double bonificacion;

    public Bonificacion(String nombre, double salario, String genero, int edad, double bonificacion) {
        super(nombre, salario, genero, edad);
        this.bonificacion = bonificacion;
    }

    public double SalarioFinal() {
        double salario = getSalario();
        int antiguedad = getEdad(); 

        if (salario > 18900 && antiguedad > 5) {
            bonificacion = salario * 0.10;
        } else if (salario > 25000 && salario <= 45000 && antiguedad > 7) {
            bonificacion = salario * 0.15;
        } else if (salario > 45000) {
            bonificacion = salario * 0.20;
        } else {
            bonificacion = 0;
        }

        return salario + bonificacion;
    }

    
    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
}

