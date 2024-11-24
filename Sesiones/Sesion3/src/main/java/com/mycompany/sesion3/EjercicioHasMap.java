/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion3;

import java.util.HashMap;

public class EjercicioHasMap {
    
    public static void main(String[] args) {
        
        HashMap<String, String> paisesCapitales = new HashMap<>();
        paisesCapitales.put("Perú", "Lima");
        paisesCapitales.put("Japón", "Tokio");
        paisesCapitales.put("Francia", "Paris");
        
        String pais = "Per";
        String capital=buscarCapital(paisesCapitales,pais);
        
        if (capital!=null){
                System.out.println("La capital de " + pais + " es " + capital);
            
        }else{
            System.out.println("No se encontro valor");
        }
    }   
    
    public static String buscarCapital(HashMap<String, String> hMap, String pais){
        
        return hMap.get(pais);
    }
    
}
