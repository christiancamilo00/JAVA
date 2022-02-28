/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.EdadMenor;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class EdadMenor {
      public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la edad");
        edad = sc.nextInt();
        
        
        if( edad < 18) {
        System.out.println("Usted aun es un niño");
        }
        else{
        System.out.println("Usted es un adulto");
        }
            

    }
    
}
