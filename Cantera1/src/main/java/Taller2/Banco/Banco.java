/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Banco;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Banco {
     public static void main(String[] args) {
     	String titular;
	int cantidad,ingreso,retiro, opcion;
	

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del titular");
        titular = sc.nextLine();
        System.out.println("Escribir cantidad");
        cantidad = sc.nextInt();
        System.out.println("Su banco fiel, por favor elija una opcion");
        System.out.println("1. Realizar ingresos");
        System.out.println("2. Realizar retiros");
        System.out.println("3. Realizar consultas de valor");
        System.out.println("4. Salir ");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Valor del ingreso?");
                 ingreso = sc.nextInt();
                 if(ingreso < 0){
                     System.out.println("El valor introducido es negativo");
                 }
                 break;
             case 2:
                 System.out.println("Valor del retiro?");
                 retiro = sc.nextInt();
                 if(retiro > cantidad){
                     System.out.println("El valor introducido es mayor al que tiene en la cuenta");
                 }
                 break;
             case 3:
                 System.out.println("Su saldo es " + cantidad);
                 break;     
             case 4:    
                  System.out.println("Hasta Luego");
                 break;     
        }
        
       
     }
}
