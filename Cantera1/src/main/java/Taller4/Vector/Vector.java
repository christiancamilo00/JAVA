/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Vector;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Vector {
    public static void main(String[] args) {
        int indice ;
        int[] usuario;
        usuario = new int[5];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primera posicion");
        usuario[0] = sc.nextInt();
         System.out.println("Ingrese segunda posicion");
        usuario[1] = sc.nextInt();
         System.out.println("Ingrese tercera posicion");
        usuario[2] = sc.nextInt();
         System.out.println("Ingrese cuarta posicion");
        usuario[3] = sc.nextInt();
         System.out.println("Ingrese quinta posicion");
        usuario[4] = sc.nextInt();
        
        for(indice =0; indice <=4; indice ++){
            System.out.println("[" +indice+"] = " + usuario[indice]);
        }
        
        
    }
}
