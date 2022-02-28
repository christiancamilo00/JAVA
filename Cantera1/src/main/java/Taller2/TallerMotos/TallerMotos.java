/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.TallerMotos;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class TallerMotos {
     public static void main(String[] args) {
        String ingreso, fecha,moto,pproducto,cliente,ncliente,fechas,nmoto,amoto ;
	int opcion;
	


        Scanner sc = new Scanner(System.in);
        System.out.println("Taller de Motos El Maquinista, por favor elija una opcion");
        System.out.println("1. Ingreso de Motos");
        System.out.println("2. Salida de Motos");
        System.out.println("3. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Fecha de ingreso?");
                 fecha = sc.nextLine();
                 System.out.println("Referencia de la moto?");
                 moto = sc.nextLine();
                 System.out.println("Observaciones del cliente?");
                 cliente = sc.nextLine();
                 System.out.println("Nombre del cliente?");
                 ncliente = sc.nextLine();
                 break;
             case 2:
                 System.out.println("Fecha de salida?");
                 fechas = sc.nextLine();
                 System.out.println("Novedades de la moto?");
                 moto = sc.nextLine();
                 System.out.println("Arreglos realizados a la moto?");
                 amoto = sc.nextLine();
                 break;
             case 3:
                 break;      
        }
        
       
     }
    
}
