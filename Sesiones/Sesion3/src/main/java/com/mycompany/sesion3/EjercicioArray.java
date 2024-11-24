/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion3;

//import java.util.ArrayList;

public class EjercicioArray {

    public static void main(String[] args) {
           
        //ArrayList<Integer> numerosList = new ArrayList<>();
        //int[] numeros;
        int[] numeros={1,2,3,4,5,6,7,8,9,10};
        int sumaTotal=sumarEnteros(numeros);
        System.out.println(sumaTotal);
    }     
    
    private static int sumarEnteros(int[] array){
        int suma=0;
        for (int num:array) {
            suma=suma+num;
        }
        return suma;
    }
    
}
