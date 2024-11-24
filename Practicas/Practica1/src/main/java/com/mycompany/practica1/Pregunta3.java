/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

public class Pregunta3 {
    
    /*
    Declara tres variables: a (un número), operador (un operador aritmético como
    cadena), y b (otro número). Utiliza condicionales para realizar la operación
    correspondiente y muestra el resultado.
    */
    public static void main(String[] args) {

        double a = 10;
        double b = 5;
        String operador = "*";

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("no se puede dividir por cero");
                    return;
                }   break;
            default:
                System.out.println("Operador no válido");
                return;
        }

        System.out.println("El resultado de " + a + " " + operador + " " + b + " es: " + resultado);
    }
  
}
