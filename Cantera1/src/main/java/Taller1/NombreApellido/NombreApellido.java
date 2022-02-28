/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.NombreApellido;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class NombreApellido {
public static void main(String args[]) {
String nombre, apellido;    

Scanner sc = new Scanner(System.in);

System.out.println("Digite nombre");
nombre = sc.nextLine();

System.out.println("Digite apellido");
apellido = sc.nextLine();
System.out.println("Su nombre completo es: " +nombre +" " + apellido);    

}
    
}
