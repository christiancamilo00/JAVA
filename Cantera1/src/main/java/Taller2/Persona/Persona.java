/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Persona;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Persona {
      public static void main(String[] args) {
          String nombre, apellidos;
          int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escriba su nombre");
        nombre = sc.nextLine();
        System.out.println("Por favor escriba sus apellidos");
        apellidos = sc.nextLine();
        System.out.println("Digite la edad");
        edad = sc.nextInt();
        
        
        if( edad >= 18) {
        System.out.println(nombre +" " + apellidos + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }
        else{
        System.out.println(nombre +" " + apellidos + " usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devuelvase a su casa");
        }
     }
}
