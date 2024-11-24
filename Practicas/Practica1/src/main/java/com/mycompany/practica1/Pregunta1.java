/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

public class Pregunta1 {
    /*
    Declara tres variables a, b y c con valores numéricos y utiliza condicionales
    para determinar cuál de ellos es el mayor.
    */    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("El mayor es a: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es b: " + b);
        } else {
            System.out.println("El mayor es c: " + c);
        }
    }
    
}
