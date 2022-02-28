/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sofka.cantera1;

/**
 *
 * @author Christian
 */
public class Animal {
    
    public String nombre;
   
    
    public String saludar() {
	return "Hola mundo desde la clase animal";
        //System.out.println("com.sofka.cantera1.Animal.saludar()");
	}
     public void saludar2() {
	System.out.println("Hola mundo desde la clase animal saludar 2");
        //System.out.println("com.sofka.cantera1.Animal.saludar()");
	}
    
    public void sonido(String mensaje, int ruta){
            System.out.println(mensaje +" - " + ruta);
            }
}
