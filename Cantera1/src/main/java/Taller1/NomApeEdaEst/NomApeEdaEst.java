/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.NomApeEdaEst;

import java.util.Scanner;
/**
 *
 * @author Christian
 */
public class NomApeEdaEst {
        public static void main(String args[]) {
        String nombre, apellido; 
        int edad;
        float estatura;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nombre");
        nombre = sc.nextLine();
        System.out.println("Digite apellido");
        apellido = sc.nextLine();
        System.out.println("Que edad tienes ");
        edad = sc.nextInt();
        System.out.println("Cuanto mides");
        estatura = sc.nextFloat();
        
        System.out.println("Su nombre completo es: " +nombre +" " + apellido + " tienes " + edad + " años" + " y mides "+ estatura );    

        }
    
    }
