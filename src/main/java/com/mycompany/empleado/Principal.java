/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;
 import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        // Empleado
        System.out.print("Favor ingresar el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Favor ingresar el salario del empleado: ");
        double salario = sc.nextDouble();
        sc.nextLine();  
        System.out.print("Favor ingresar el género del empleado: ");
        String genero = sc.nextLine();
        System.out.print("Favr ingresar la edad del empleado: ");
        int edad = sc.nextInt();

        Bonificacion empleado = new Bonificacion(nombre, salario, genero, edad, 0);
        System.out.println("Salario final con bonificación: " + empleado.SalarioFinal());

        
        //Libro  
        System.out.print("Favor ingrese el titulo del: ");
        String titulo = sc.nextLine();
        System.out.print("Favor ingresar el autor: ");
        String autor = sc.nextLine();
        System.out.print("Favor ingresar el ISBN del libro: ");
        String isbn = sc.nextLine();
        System.out.print("Favor ingresar el precio del libro: ");
        double precio = sc.nextDouble();
        System.out.print("¿El comprador es mayor de edad? (true/false): ");
        boolean mayorDeEdad = sc.nextBoolean();

        Libro libro = new Libro(titulo, autor, isbn, precio);
        libro.Detalles();
        System.out.println("Su precio final es: " + libro.Descuento(mayorDeEdad));
    }
}


