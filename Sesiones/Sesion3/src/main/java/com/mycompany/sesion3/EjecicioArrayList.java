/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion3;

import java.util.ArrayList;

public class EjecicioArrayList {
    
    public static void main(String[] args) {
        
           ArrayList<String> nombres = new ArrayList<>();
           nombres.add("Abel");
           nombres.add("Alexander");
           nombres.add("Briyit");
           nombres.add("Claudia");
           nombres.add("Joseph");
           nombres.add("Karen");
           nombres.add("Noé");
           
           nombres.size();
           for (int i = nombres.size()-1; i >=0; i--) {
               System.out.println(nombres.get(i));
            
        }
           
    }     
    
}
