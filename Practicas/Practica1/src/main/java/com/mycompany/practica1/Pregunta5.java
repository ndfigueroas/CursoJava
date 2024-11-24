/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

public class Pregunta5 {
    
    /*
    Declara cuatro variables a, b, c y d con valores numéricos. Utiliza condicionales
    para determinar cuál de los cuatro números es el mayor y muéstralo.    
    */
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;
        int d = 25;

        if (a >= b && a >= c && a >= d) {
            System.out.println("El mayor valor es: " + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("El mayor valor es: " + b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("El mayor valor es: " + c);
        } else {
            System.out.println("El mayor valor es: " + d);
        }
    }
  
}
