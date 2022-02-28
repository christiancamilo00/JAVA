/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.CiudadPais;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class CiudadPais {
     public static void main(String args[]) {
        String ciudad, pais; 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor escribir una ciudad capital ");
        ciudad = sc.nextLine();
        System.out.println("Por favor escribir el pais");
        pais = sc.nextLine();
               
        System.out.println("La ciudad " + ciudad + " es la capital del pais " + pais );    

        }
}
