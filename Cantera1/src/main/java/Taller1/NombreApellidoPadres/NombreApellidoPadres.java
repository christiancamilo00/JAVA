/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.NombreApellidoPadres;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class NombreApellidoPadres {
    public static void main(String args[]) {
        String nombre, apellido,nombreMadre,apellidoMadre,nombrePadre,apellidoPadre;  
        int edad;
        float estatura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nombre");
        nombre = sc.nextLine();
        System.out.println("Digite apellido");
        apellido = sc.nextLine();
        System.out.println("Por favor escribir el nombre de su madre   ");
        nombreMadre = sc.nextLine();
        System.out.println("Por favor escribir el apellido de su madre ");
        apellidoMadre = sc.nextLine();
        System.out.println("Por favor escribir el nombre de su padre   ");
        nombrePadre = sc.nextLine();
        System.out.println("Por favor escribir el apellido de su padre ");
        apellidoPadre = sc.nextLine();
        
        System.out.println("Yo "+ nombre +" "+ apellido + " soy el hijo de " + nombreMadre + " y " + nombrePadre);    

        }
}
