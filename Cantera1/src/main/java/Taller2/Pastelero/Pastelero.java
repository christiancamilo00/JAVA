/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Pastelero;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Pastelero {
      public static void main(String[] args) {
       	String sabor;
	int porciones;
	String decoracion;
	String pproducto;
	int opcion;
	String torta1 = "Torta de 1 libra";
	String torta2 = "Torta de 2 libras";
	String torta3 = "Torta de 3 libras"; ;
	int ptorta1 = 50000;
	int ptorta2 = 100000;
	int ptorta3 = 150000;
	String venta;
	int precio;
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Pastelero Don Carlos, por favor elija una opcion");
        System.out.println("1. Registrar pedidos");
        System.out.println("2. Disponibilidad de tortas");
        System.out.println("3. Registro de ventas diarias");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Sabor de la torta?");
                 sabor = sc.nextLine();
                 System.out.println("Cantidad de porciones de torta?");
                 porciones = sc.nextInt();
                 System.out.println("Observaciones del cliente?");
                 decoracion = sc.nextLine();
                 break;
             case 2:
                 System.out.println("Las tortas disponibles con sus precios son: ");
                 System.out.println( torta1 + " Precio " + ptorta1);
                 System.out.println( torta2 + " Precio " + ptorta2);
                 System.out.println( torta3 + " Precio " + ptorta3);
                 break;
             case 3:
                 System.out.println("Por favor ingrese la torta vendida");
                 venta = sc.nextLine();
                 System.out.println("Por favor ingrese el valor de la torta");
                 precio = sc.nextInt();
                 break;     
             case 4:    
                 break;     
        }
        
       
     }
}
