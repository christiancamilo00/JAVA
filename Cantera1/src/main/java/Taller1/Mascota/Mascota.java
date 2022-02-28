/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Mascota;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Mascota {
     public static void main(String args[]) {
        String nmascota,tipo,nombre; 
        int edad;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor escribir el nombre de su mascota ");
        nmascota = sc.nextLine();
        System.out.println("Por favor escribir el tipo de mascota");
        tipo = sc.nextLine();
        System.out.println("Por favor escribir su nombre");
        nombre = sc.nextLine();
        System.out.println("Por favor escribir la edad de la mascota");
        edad = sc.nextInt();
               
        System.out.println(nmascota + " es un@ " + tipo + " el cual tiene "+ edad + " años de edad "+ " y " + nombre +" es actualmente su dueñ@" );    

        }
}
