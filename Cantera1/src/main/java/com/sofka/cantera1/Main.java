/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sofka.cantera1;

/**
 *
 * @author Christian
 */
public class Main {
    
  
    public static void main(String[] args) {
	Animal animal = new Animal();
	System.out.println(animal.saludar());
        animal.sonido("cali", 59);
        animal.saludar();
        animal.saludar2();
        
	String nombre = "Cristian Arias ";
      //  System.out.println(nombre);
        ejemplo();
        
        Animal p1 = new Animal();
        p1.nombre = "Camilo";
        
    }
    
    public static void ejemplo(){
        String respuesta;
        respuesta = "Si señor, gracias";
        System.out.println("Texto a imprimir " + respuesta);
        System.out.println("si");
    }
    
}
