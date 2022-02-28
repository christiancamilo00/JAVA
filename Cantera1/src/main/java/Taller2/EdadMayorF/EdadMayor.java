/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.EdadMayorF;

import java.util.Scanner;

public class EdadMayor {

    public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la edad");
        edad = sc.nextInt();
        
        
        if( edad >= 18) {
        System.out.println("Usted es mayor de edad");
        }
       


    }
}