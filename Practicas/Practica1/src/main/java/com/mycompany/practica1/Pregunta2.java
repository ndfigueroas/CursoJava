/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

public class Pregunta2 {
    /*
    Declara una variable número con un valor numérico y utiliza condicionales para
    determinar en qué rango se encuentra.
    */
    public static void main(String[] args) {

        int numero = 25;

        if (numero >= 0 && numero <= 10) {
            System.out.println("El número está entre 0 y 10");
        } else if (numero > 10 && numero <= 20) {
            System.out.println("El número está entre 11 y 20");
        } else if (numero > 20 && numero <= 30) {
            System.out.println("El número está entre 21 y 30");
        } else {
            System.out.println("El número está fuera de los rangos");
        }
    }
 
}
